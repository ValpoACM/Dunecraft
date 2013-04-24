package mod.dunecraft.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;
import mod.dunecraft.CommonProxy;
import mod.dunecraft.EntitySmallSandworm;

public class ClientProxy extends CommonProxy {
	
	
        @Override
        public void registerRenderers() {
        		RenderingRegistry.registerEntityRenderingHandler(EntitySmallSandworm.class,new RenderSmallSandworm(new ModelSmallSandworm(),(float)1.00));
                //MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                //MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        }
        
}