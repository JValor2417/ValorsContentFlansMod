package com.flansmod.common.guns;

import java.util.Optional;

import javax.annotation.Nullable;

import com.flansmod.common.vector.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.math.Vec3d;

/**
 * Class for creating object containing all necessary informations about a fired shot
 */
public class FiredShot {

	/**
	 * Initial velocity of the projectile.
	 * If projectile is an entity, the current velocity is stored by the entity, not here.
	 * Using Vec3d instead of Flan's Mod's Vector3f because Vec3d is actually immutable.
	 */
	private Vec3d velocity;
	/**
	 * The weapon used to fire the shot
	 */
	private FireableGun weapon;
	/**
	 * The BulletType of the fired bullet
	 */
	private BulletType bullet;
	/**
	 * Optional containing a player, if one can be associated with the shot
	 */
	private Optional<EntityPlayerMP> player;
	/**
	 * Optional of the entity which fired the shot. Can be the same as the Player optional
	 */
	private Optional<? extends Entity> shooter;
	
	/**
	 * @param weapon 	Weapon used to fire the shot.
	 * @param bullet 	BulletType of the fired bullet.
	 * @param direction Direction bullet is being fired in. Should be a unit vector
	 */
	public FiredShot(FireableGun weapon, BulletType bullet, Vec3d direction)
	{
		this.weapon = weapon;
		this.bullet = bullet;
		this.player = Optional.empty();
		this.shooter = this.player;
		// Nulls will mostly happen for worlds that load up bullets that don't exist anymore
		if (weapon != null && bullet != null) {
			float speed = this.getFireableGun().getBulletSpeed() * bullet.bulletSpeedMultiplier;
			this.velocity = direction.normalize().scale(speed);
		}
	}
	
	/**
	 * @param weapon 		weapon used to fire the shot
	 * @param bullet 		BulletType of the fired bullet
	 * @param direction 	Direction the shot was fired in
	 * @param player 		The player who shot
	 */
	public FiredShot(FireableGun weapon, BulletType bullet, Vec3d direction, EntityPlayerMP player)
	{
		this(weapon, bullet, direction, player, player);
	}
	
	/**
	 * This constructor should be used when an entity shot, but no player is involved
	 * e.g a zombie holding a gun or a sentry
	 * 
	 * @param weapon weapon used to fire the shot
	 * @param bullet BulletType of the fired bullet
	 * @param shooter Entity which fired the shot
	 */
	public FiredShot(FireableGun weapon, BulletType bullet, Vec3d direction, Entity shooter)
	{
		this(weapon, bullet, direction, shooter, null);
	}
	
	/**
	 * This constructor should be used if a player causes a shot, but the player is actually not the entity shooting it
	 * e.g a player flying a plane
	 * 
	 * @param weapon  weapon used to fire the shot
	 * @param bullet  BulletType of the fired bullet
	 * @param shooter the Entity firing the shot
	 * @param player  the Player causing the shot
	 */
	public FiredShot(FireableGun weapon, BulletType bullet, Vec3d direction, Entity shooter, @Nullable EntityPlayerMP player)
	{
		this(weapon, bullet, direction);
		this.player = Optional.ofNullable(player);
		this.shooter = Optional.of(shooter);
	}

	/**
	 * @return Initial velocity of the projectile.
	 */
	public Vec3d getVelocity() { return this.velocity; }

	/**
	 * Adds some velocity to the initial velocity. Used for adding the motion of a vehicle.
	 * Only works prior to the shot being fired. Useless afterwards.
	 * @param x Additional velocity in the x-axis
	 * @param y Additional velocity in the y-axis
	 * @param z Additional velocity in the z-axis
	 */
	public void addVelocity(double x, double y, double z) {
		this.velocity = this.velocity.add(x, y, z);
	}

	/**
	 * Adds some velocity to the initial velocity. Used for adding the motion of a vehicle.
	 * Only works prior to the shot being fired. Useless afterwards.
	 * @param additionalVelocity This vector will be added to the current velocity vector.
	 */
	public void addVelocity(Vec3d additionalVelocity) {
		this.velocity = this.velocity.add(additionalVelocity);
	}

	/**
	 * Gets the general damage of the shot.
	 * @return The damage of the shot.
	 */
	public float getDamage() {
		return this.getFireableGun().getDamage() * this.bullet.damageMultiplier;
	}

	/**
	 * Gets the damage of the shot to driveables.
	 * @return The damage of the shot to driveables.
	 */
	public float getDriveableDamage() {
		return this.getDamage() * this.bullet.driveableDamageMultiplier;
	}

	/**
	 * @return The gun used for this shot
	 */
	public FireableGun getFireableGun()
	{
		return this.weapon;
	}
	
	/**
	 * @return The BulletType of the bullet used in the shot
	 */
	public BulletType getBulletType()
	{
		return this.bullet;
	}
	
	/**
	 * @return the matching DamageSource for the shot
	 */
	public DamageSource getDamageSource()
	{
		return getDamageSource(false);
	}

	/**
	 * @return the matching DamageSource for the shot with the additional 'headshot' information
	 */
	public DamageSource getDamageSource(Boolean headshot)
	{
		if (player.isPresent()) {
			return new EntityDamageSourceFlan(weapon.getShortName(), player.get(), player.get(), weapon.getInfoType(), headshot).setProjectile();
		}
		else if(shooter.isPresent())
		{
			return new EntityDamageSourceFlan(weapon.getShortName(), null, null, weapon.getInfoType(), headshot).setProjectile();
		}
		return DamageSource.GENERIC;
	}
	
	/**
	 * @return Optional containing a player if one is involved in the cause of the shot
	 */
	public Optional<EntityPlayerMP> getPlayerOptional()
	{
		return this.player;
	}
	
	/**
	 * @return Optional containing the Entity which shot. Might be the same as the player optional
	 */
	public Optional<? extends Entity> getShooterOptional()
	{
		return this.shooter;
	}
}
