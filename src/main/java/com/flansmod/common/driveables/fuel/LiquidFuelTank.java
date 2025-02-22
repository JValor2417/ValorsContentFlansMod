package com.flansmod.common.driveables.fuel;

import javax.annotation.Nonnull;

import com.flansmod.common.FlansConfig;
import com.flansmod.common.parts.EnumPartCategory;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.UniversalBucket;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.fluids.capability.IFluidTankProperties;

/**
 * Handles fuel for vehicles with combustion engines
 */
public class LiquidFuelTank extends InternalFuelTank {
	/**
	 * The amount of fuel in the driveable, in mb of gasoline.
	 * Note that because most vehicles will burn less than 1mb/t, this value is a float
	 * rather than an integer, unlike standard Forge fluid tanks.
	 */
	private float fuel; 
	/**
	 * The max amount of fuel the driveable can have, in mb of gasoline
	 */
	private float maxFuel;
	
	public LiquidFuelTank(float maxFuel) {
		this.fuel = 0;
		this.maxFuel = maxFuel;
	}

	@Override
	public boolean hasFuel(float consumption) {
		return (fuel - consumption) >= 0;
	}

	@Override
	public boolean hasFuel() {
		return fuel > 0;
	}

	@Override
	public float getMaxFillLevel() {
		return maxFuel;
	} 
	
	@Override
	public float getFillLevel() {
		return this.fuel;
	}
	
	/**
	 * Puts some fuel in the fuel tank. This method uses integers rather than floating point.
	 * This method will refuse to put fuel in the fuel tank if there is less than 1 mb of space remaining
	 * to prevent over-filling.
	 * A negative number will return 0.
	 * @param maxReceive	The max output and fluid type of the giving container, in mb.
	 * 						i.e. how many mb the fuel can/bucket can give the fuel tank this tick.
	 * @param simulate		If true, the fuel will not actually be put into the fuel tank but this method
	 * 						will still return how many mb the tank would have received.
	 * @return				How many mb of fuel the container has received.
	 */
	public int receiveFuel(int maxReceive, boolean simulate) {

		int fuelReceived = MathHelper.clamp(Math.min((FlansConfig.vehicles.fuelTransferRate), maxReceive), 0, (int)(maxFuel - fuel));
		if (!simulate)
			fuel += fuelReceived;
        return fuelReceived;
	}

	/**
	 * Puts some fuel in the fuel tank. This method uses floating-point numbers.
	 * It is recommended to use the int variant of this method when dealing with Forge fluids.
	 * A negative number will return 0.
	 * @param maxReceive	The max output of the giving container, in mb.
	 * 						i.e. how many mb the fuel can/bucket can give the fuel tank this tick
	 * @param simulate		If true, the fuel will not actually be put into the fuel tank but this method
	 * 						will still return how many mb the tank would have received.
	 * @return				How many mb of fuel the container has received.
	 */
	public float receiveFuel(float maxReceive, boolean simulate) {

		float fuelReceived = MathHelper.clamp(Math.min(FlansConfig.vehicles.fuelTransferRate, maxReceive), 0, maxFuel - fuel);
		if (!simulate)
			fuel += fuelReceived;
        return fuelReceived;
	}

	/**
	 * Puts some fuel in the fuel tank. This method uses Forge fluids and will check if fluid is an accepted fuel.
	 * This method will refuse to put fuel in the fuel tank if there is less than 1 mb of space remaining
	 * to prevent over-filling.
	 * Will refuse to fill tank and will return 0 if fluid is not a recognized fuel
	 * @param fluidReceive	The FluidStack to try and fill the tank with. The amount of the stack should
	 * 						be the max output of the giving container and the Fluid of the stack needs to be
	 * 						an accepted fuel.
	 * @param simulate		If true, the fuel will not actually be put into the fuel tank but this method
	 * 						will still return how many mb the tank would have received.
	 * @return				How many mb of fuel the container has received.
	 */
	public int receiveFuel(FluidStack fluidReceive, boolean simulate) {

		int fuelReceived = 0;
		if (FlansConfig.vehicles.isFuel(fluidReceive.getFluid())) {
			fuelReceived = MathHelper.clamp(Math.min((FlansConfig.vehicles.fuelTransferRate), fluidReceive.amount), 0, (int)(maxFuel - fuel));
			if (!simulate)
				fuel += fuelReceived;
		}
        return fuelReceived;
	}
	
	/**
	 * Puts some fuel in the fuel tank. This method is meant for Forge's buckets.
	 * Method will drain the full 1000mb regardless of the fuel transfer rate.
	 * Will refuse to fill tank and will return 0 if fluid is not a recognized fuel.
	 * @param fluidReceive	The Fluid that is currently in the bucket, needs to be an accepted fuel
	 * @param simulate		If true, the fuel will not actually be put into the fuel tank but this method
	 * 						will still return how many mb the tank would have received.
	 * @return				How many mb of fuel the container has received
	 */
	public int receiveFuelBucket(Fluid fluidReceive, boolean simulate) {

		if (FlansConfig.vehicles.isFuel(fluidReceive) && ((maxFuel - fuel) >= Fluid.BUCKET_VOLUME)) {
			if (!simulate)
				fuel += Fluid.BUCKET_VOLUME;
			
			return Fluid.BUCKET_VOLUME;
		} else {
			return 0;
		}
	}

	@Override
	public void setFillPercentage(float percentage) {
		percentage = MathHelper.clamp(percentage, 0, 1);
		fuel = maxFuel * percentage;
	}

	@Override
	public void setFillAmount(float amount) {
		amount = MathHelper.clamp(amount, 0, maxFuel);
		fuel = amount;
	}

	@Override
	public void consume(float amountToConsume) {
		fuel = Math.max(0, fuel - amountToConsume);
	}

	@Override
	public ItemStack handleFuelItem(@Nonnull ItemStack stack) {
		Item item = stack.getItem();

		IFluidHandlerItem fuelItem = FluidUtil.getFluidHandler(stack);

		if (fuelItem != null) {
			IFluidTankProperties[] fluidTanksToDrain = fuelItem.getTankProperties();

			for (IFluidTankProperties fluidTank : fluidTanksToDrain) {
				//Checking to make sure container isn't empty and the fuel inside is actually a fuel
				FluidStack fuelStack = fluidTank.getContents();
				if (fuelStack != null && FlansConfig.vehicles.isFuel(fuelStack.getFluid())) {
					Fluid fluidToDrain = fuelStack.getFluid();
					// Forge fluid buckets.
					// Buckets must transfer the full 1000 mb in one tick, so they have special handling
					if (item instanceof UniversalBucket) {
						//Checking to see if the fuel tank can hold 1000mb more
						if (this.receiveFuelBucket(fluidToDrain, true) == Fluid.BUCKET_VOLUME) {
							//Fill the tank
							this.receiveFuelBucket(fluidToDrain, false);

							//Drain the bucket
							fuelItem.drain(Fluid.BUCKET_VOLUME, true);

							//Returning empty bucket
							stack = fuelItem.getContainer();
						}

						//Normal fluid containers
					} else {
						//Check to see how much we can drain first
						FluidStack amountToDrain = fuelItem.drain(fuelStack, false);

						if (amountToDrain != null) {
							//Filling the internal tank
							int amountTransferred = this.receiveFuel(amountToDrain, false);

							//Draining the item
							fuelItem.drain(new FluidStack(fluidToDrain, amountTransferred), true);
						}
					}
					break; //Only drain one container at a time. Once we find one, we'll move on to next tick.
				}
			}
		}
		/*
		 * This bit looks for Flan's Mod fuel items
		 */
		if(item instanceof ItemPart)
		{
			PartType part = ((ItemPart)item).type;
			// Check it is a fuel item
			if(part.category == EnumPartCategory.FUEL)
			{
				//The max amount the fuel can is able to transfer is its current capacity
				int maxTransferAmount = stack.getMaxDamage() - stack.getItemDamage();
				
				int amountTransferred = this.receiveFuel(maxTransferAmount, false);
				
				// Damage the fuel item to indicate being used up
				stack.setItemDamage(stack.getItemDamage() + amountTransferred);
				if (stack.getItemDamage() >= stack.getMaxDamage()) {
					stack.setCount(stack.getCount() - 1);
					
					if (stack.getCount() <= 0) {
						stack = ItemStack.EMPTY;
					}
				}
			}
			
		//If the ItemStack doesn't have energy or fuel, we do nothing with it.
		}
		
		return stack;
	}
}
