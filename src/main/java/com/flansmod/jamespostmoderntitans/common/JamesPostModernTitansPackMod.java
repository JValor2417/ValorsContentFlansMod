package com.flansmod.jamespostmoderntitans.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansModContentProvider;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = JamesPostModernTitansPackMod.MODID, 
			name = "James Post Modern Titans Pack", 
			version = JamesPostModernTitansPackMod.VERSION,
			dependencies = "required-after:" + FlansMod.MODID)
public class JamesPostModernTitansPackMod implements IFlansModContentProvider
{
	public static final String MODID = "jamespostmoderntitanspack";
	public static final String VERSION = "@VERSION@";
	
	@Override
	public String GetContentFolder() 
	{
		return "James Post Modern Titans Pack";
	}
	
	@Override
	public void RegisterModelRedirects()
	{
		FlansMod.RegisterModelRedirect("jamespostmoderntitans", "com.flansmod.jamespostmoderntitans.client.model");
	}
}
