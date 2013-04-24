package mod.dunecraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import mod.dunecraft.EntitySmallSandworm;

public class CommonProxy implements IGuiHandler{
    public static String ITEMS_PNG = "/mod/dunecraft/items.png";
    public static String BLOCK_PNG = "/mod/dunecraft/block.png";
    
    // Client stuff
    public void registerRenderers() {
            // Nothing here as the server doesn't render graphics!
    }
    
    public void load(){
    	EntityRegistry.registerGlobalEntityID(EntitySmallSandworm.class,"Sandworm", EntityRegistry.findGlobalUniqueEntityId(),1000,200);
    	ModLoader.addLocalization("entity.Sandworm.name", "Sandworm");
    	registerRenderers();
    }

	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}