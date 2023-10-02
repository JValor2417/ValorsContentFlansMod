package com.flansmod.common;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.RangeInt;
import net.minecraftforge.fluids.Fluid;

/**
 * This class handles all the configs for Flan's Mod
 * Config names should be in title case with a space between every word
 */
@Config(modid = FlansMod.MODID)
public final class FlansConfig {
	
	public static ClientCategory client = new ClientCategory();
	public static VehiclesCategory vehicles = new VehiclesCategory();
	
	@Name("Add All Paintjobs to Creative")
	@Comment("Whether or not all paintjobs should be added in creative")
	public static boolean addAllPaintjobsToCreative = false;
	
	@Name("Gunpowder Recipe")
	@Comment("Whether or not the Flan's Mod recipe for gunpowder should be available, (3 charcoal + 1 glowstone)")
	public static boolean addGunpowderRecipe = true;
	
	@Name("Force Update JSONs")
	@Comment("Turn this on to force re-create all JSON files. Should only be used in dev environment")
	public static boolean forceUpdateJSONs = false;
	
	@Name("Enable Enchantment Module")
	@Comment("Whether or not to enable gun-related enchantments added by Flan's Mod")
	public static boolean enchantmentModuleEnabled = true;

	@Name("Mob Armor Spawn Chance")
	@Comment({
			"The probability that mobs will spawn with Flan's Mod armor.",
			"Currently this is limited to Zombies and Skeletons.",
			"0 to prevent mobs from spawning with Flan's Armor, 1 = 100%."
	})
	public static float armourSpawnRate = 0.125F;
	
	public static class ClientCategory {
		@Name("Shoot on Right Click")
		@Comment("If true, guns will be shot on right click, if false, guns will be shot on left click")
		public boolean shootOnRightClick = false;
	}
	
	public static class VehiclesCategory {
		@Name("Global Fuel Use Multiplier")
		@Comment("Fuel use will be multiplied by this value. Higher means more fuel used per tick")
		public float globalFuelUseMultiplier = 1F;
		
		@Name("Fuel Transfer Rate")
		@Comment("How much fuel (mb) to transfer from a container to the vehicle in one tick")
		@RangeInt(min = 0, max = 10000)
		public int fuelTransferRate = 50;
		
		@Name("Energy Transfer Rate")
		@Comment("How much fuel (FE/RF) to transfer from a container to the vehicle in one tick")
		@RangeInt(min = 0, max = 1000000)
		public int energyTransferRate = 2000;
		
		@Name("Accepted Fuels")
		@Comment({
			"The fluids listed below will be usable as fuel by Flan's vehicles",
			"You can find these names with mods (Crafttweaker, Modtweaker, or TellMe)",
			"or you can open up the relevant mod's .jar file and look in the .lang files for fluid names"
		})
		public String[] acceptedFuelNames = {"refined_fuel", "refined_biofuel", "diesel", "gasoline", "biodiesel"};
		
		@Name("Max Speed for GUI Interaction")
		@Comment({
			"If a vehicle is moving faster than this speed, its GUI will be locked.",
			"That means the player can no longer interact with its inventory, weapon, and fuel slots",
			"essentially, this means players can no longer refuel and rearm while on the move.",
			"Measured in blocks/tick, set to negative value (e.g. -1) to allow refueling and rearming on the move."
		})
		public float maxInteractSpeed = 1F;

		/**
		 * Check to see whether or not the given fluid is a compatible fuel
		 * @param fluid	the possible fuel fluid to check
		 * @return		true if the fluid given is compatible, false otherwise
		 */
		public boolean isFuel(Fluid fluid) {
			String fluidName = fluid.getName();
			
			for (String acceptedFluidName : acceptedFuelNames) {
				if (fluidName.equals(acceptedFluidName)) {
					return true;
				}
			}
			
			return false;
		}
		
		/**
		 * Checks to see if a driveable's speed is low enough to be interacted with.
		 * @param speed the driveable's speed.
		 * @return true if the maxInteractSpeed is negative (i.e. there's no max speed) or if the max speed is low enough
		 */
		public boolean canInteract(float speed) {
			return maxInteractSpeed < 0 || speed <= maxInteractSpeed;
		}
	}
	
	
}
