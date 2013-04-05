package mod.dunecraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="Dunecraft", name="Dunecraft", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class DunecraftBase {

        // The instance of your mod that Forge uses.
        @Instance("DunecraftBase")
        public static DunecraftBase instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="mod.dunecraft.client.ClientProxy", serverSide="mod.dunecraft.CommonProxy")
        public static CommonProxy proxy;
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @Init
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
        }
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}