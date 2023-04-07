package com.flansmod.jamespostmodernweapons.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansModContentProvider;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = JamesPostModernWeaponsPackMod.MODID, 
			name = "James Post Modern Weapons Pack", 
			version = JamesPostModernWeaponsPackMod.VERSION,
			dependencies = "required-after:" + FlansMod.MODID)
public class JamesPostModernWeaponsPackMod implements IFlansModContentProvider
{
	public static final String MODID = "jamespostmodernweaponspack";
	public static final String VERSION = "@VERSION@";
	
	@Override
	public String GetContentFolder() 
	{
		return "James Post Modern Weapons Pack";
	}
	
	@Override
	public void RegisterModelRedirects()
	{
		FlansMod.RegisterModelRedirect("jamespostmodernweapons", "com.flansmod.jamespostmodernweapons.client.model");
	}
}
