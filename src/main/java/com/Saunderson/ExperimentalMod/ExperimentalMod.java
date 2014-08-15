package com.Saunderson.ExperimentalMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="ExperimentalMod", name="Experimental Mod", version="1.7.10-1.0")

public class ExperimentalMod
{
   @Mod.Instance("ExperimentalMod")
   public static ExperimentalMod instance;

   @Mod.EventHandler
   public void preInit(FMLPreInitializationEvent event)
   {
       // Blocks, Items, Server Networking, ext..

   }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // recipes, gui's, tile entities, ext..

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        // Wrapping your shit up, ext..

    }

}
