package com.Saunderson.ExperimentalMod;

import com.Saunderson.ExperimentalMod.proxy.IProxy;
import com.Saunderson.ExperimentalMod.reference.reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= reference.MOD_ID, name= reference.MOD_NAME, version= reference.VERSION)

public class ExperimentalMod
{
   @Mod.Instance(reference.MOD_ID)
   public static ExperimentalMod instance;

   @SidedProxy(clientSide = "com.Saunderson.ExperimentalMod.proxy.ClientProxy", serverSide = "com.Saunderson.ExperimentalMod.proxy.ServerProxy")
   public static IProxy proxy;

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
    public void postInit(FMLPostInitializationEvent event)
    {
        // Wrapping your shit up, ext..

    }

}
