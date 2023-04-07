package com.flansmod.jamespostmodernvehicles.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansModContentProvider;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = JamesPostModernVehiclesPackMod.MODID, 
			name = "James Post Modern Vehicles Pack", 
			version = JamesPostModernVehiclesPackMod.VERSION,
			dependencies = "required-after:" + FlansMod.MODID)
public class JamesPostModernVehiclesPackMod implements IFlansModContentProvider
{
	public static final String MODID = "jamespostmodernvehiclespack";
	public static final String VERSION = "@VERSION@";
	
	@Override
	public String GetContentFolder() 
	{
		return "James Post Modern Vehicles Pack";
	}
	
	@Override
	public void RegisterModelRedirects()
	{
		FlansMod.RegisterModelRedirect("jamespostmodernvehicles", "com.flansmod.jamespostmodernvehicles.client.model");
	}
}
