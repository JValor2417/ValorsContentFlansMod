package com.flansmod.common.guns;

import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.types.InfoType;

import net.minecraft.item.ItemStack;

/**
 * Class used for storing the properties of a gun
 */
public class FireableGun
{
	// InfoType of the weapon being fired
	private InfoType type;
	//Radius of the bullet spread
	private float spread;
	private EnumSpreadPattern spreadPattern;
	// Speed a bullet fired from this gun will travel at. (0 means instant/raytraced)
	private float bulletSpeed;
	// the damage this gun will cause
	private float damage;

	/**
	 * Direct input constructor, primary for reading from NBT.
	 */
	public FireableGun(InfoType infoType, float damage, float spread, float bulletSpeed, EnumSpreadPattern spreadPattern)
	{
		this.damage = damage;
		this.spread = spread;
		this.bulletSpeed = bulletSpeed;
		this.spreadPattern = spreadPattern;
		this.type = infoType;
	}

	/**
	 * Gets the stats from a GunType and an ItemStack. Attachment stats are taken from ItemStack.
	 * Used for players shooting firearms.
	 * @param type          InfoType of the gun
	 * @param gunItem       The item of the gun being fired, used to find attachments
	 */
	public FireableGun(GunType type, ItemStack gunItem)
	{
		this.damage = type.getDamage(gunItem);
		this.spread = type.getSpread(gunItem);
		this.bulletSpeed = type.getBulletSpeed(gunItem);
		this.spreadPattern = type.getSpreadPattern(gunItem);
		this.type = type;
	}

	/**
	 * This method is for instances where there isn't an item associated with the gun.
	 * Primarily used for vehicles.
	 * @param type          InfoType of the gun
	 */
	public FireableGun(GunType type)
	{
		this.damage = type.damage;
		this.spread = type.bulletSpread;
		this.bulletSpeed = type.bulletSpeed;
		this.spreadPattern = type.spreadPattern;
		this.type = type;
	}

	public FireableGun(DriveableType driveableType, boolean secondary)
	{
		this.damage = secondary ? driveableType.damageSecondary : driveableType.damagePrimary;
		this.spread = driveableType.bulletSpread;
		this.bulletSpeed = driveableType.bulletSpeed;
		this.spreadPattern = EnumSpreadPattern.circle; // Circle appears to be the only spread pattern for vehicles
		this.type = driveableType;
	}

	/**
	 * @return the bullet spread of this gun
	 */
	public float getGunSpread()
	{
		return spread;
	}

	public EnumSpreadPattern getSpreadPattern()
	{
		return spreadPattern;
	}

	public InfoType getInfoType() {
		return this.type;
	}

	/**
	 * @return the shortName of the InfoType of this gun
	 */
	public String getShortName()
	{
		return this.type.shortName;
	}

	/**
	 * @return the damage this gun will cause to anything that isn't a vehicle
	 */
	public float getDamage()
	{
		return damage;
	}

	/**
	 * @return the speed a bullet fired from this gun will travel at. (0 means instant/raytraced)
	 */
	public float getBulletSpeed()
	{
		return this.bulletSpeed;
	}

	public void MultiplySpread(float multiplier) { spread *= multiplier; }
	public void MultiplyDamage(float multiplier) { damage *= multiplier; }
}
