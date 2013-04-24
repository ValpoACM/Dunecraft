package mod.dunecraft;

import java.awt.Color;
import java.util.Map;

import mod.dunecraft.client.ModelSmallSandworm;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.*;
import net.minecraft.src.ModLoader;

public class LoadSmallSandworm extends DunecraftBase {
	public String getVersion()
	{
	return "1.4.7";
	}
	
public void load()
	{
		ModLoader.registerEntityID(EntitySmallSandworm.class, "Sandworm", 30);//registers the mobs name and id
		ModLoader.addSpawn("Sandworm", 15, -5, 5, EnumCreatureType.creature);//makes the mob spawn in game
		ModLoader.addLocalization("entity.Sandworm.name", "Sandworm");//adds Mob name on the spawn egg
		EntityList.entityEggs.put(Integer.valueOf(30), new EntityEggInfo(30, 894731, (new Color(21, 15, 6)).getRGB()));//creates the spawn egg, and chnages color of egg
	}

public void addRenderer(Map var1)
	{
		var1.put(EntitySmallSandworm.class, new RenderLiving(new ModelSmallSandworm(),.5f));
	}
}