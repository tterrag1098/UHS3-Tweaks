package tterrag.uhs3;

import tterrag.rtc.RecipeTweakingCore;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name="UHS3 Tweaks", modid="uhs3tweaks", version="0.0.1", dependencies="after:simplyjetpacks")
public class UHS3
{
	@Instance
	public static UHS3 instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RecipeTweakingCore.registerPackageName("tterrag.uhs3.tweaks");
	}
}
