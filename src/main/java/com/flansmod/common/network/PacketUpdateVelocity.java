package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

/**
 * This class is responsible for sending entity velocity data from the server to client.
 * This essentially performs the same task as {@link net.minecraft.network.play.server.SPacketEntityVelocity}
 * but without the velocity cap.
 * Only use this if necessary, The default Minecraft cap is usually high enough.
 */
public class PacketUpdateVelocity extends PacketBase {
	// Velocity info
	private double motionX;
	private double motionY;
	private double motionZ;

	// ID of the entity
	private int entityId;

	public PacketUpdateVelocity() {

	}

	public PacketUpdateVelocity(Entity bullet) {
		this.motionX = bullet.motionX;
		this.motionY = bullet.motionY;
		this.motionZ = bullet.motionZ;

		this.entityId = bullet.getEntityId();
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		data.writeDouble(motionX);
		data.writeDouble(motionY);
		data.writeDouble(motionZ);

		data.writeInt(this.entityId);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		this.motionX = data.readDouble();
		this.motionY = data.readDouble();
		this.motionZ = data.readDouble();

		this.entityId = data.readInt();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) {
		FlansMod.log.warn("Received PacketUpdateVelocity on Server. This packet should only be send to clients");
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) {
		for(Entity ent : clientPlayer.world.loadedEntityList) {
			if(ent.getEntityId() == entityId) {
				ent.setVelocity(this.motionX, this.motionY, this.motionZ);
				break;
			}
		}
	}
}
