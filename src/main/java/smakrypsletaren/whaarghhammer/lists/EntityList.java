package smakrypsletaren.whaarghhammer.lists;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;
import smakrypsletaren.whaarghhammer.WhaarghHammer;
import smakrypsletaren.whaarghhammer.entities.Poxwalker;

public class EntityList 
{
	public static EntityType<?> POXWALKER = EntityType.Builder.create(Poxwalker::new, EntityClassification.CREATURE).build(WhaarghHammer.modid + ":poxwalker").setRegistryName(WhaarghHammer.modid, "poxwalker");
	
	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().registerAll
		(
			ItemList.poxwalker_egg = registerEntitySpawnEgg(POXWALKER, 0xf7c383, 0xf06060, "poxwalker_egg")// (entity, color1, color2, spawn egg id)
		);
	}
	
	public static void registerEntityWorldSpawns()
	{
		registerEntityWorldSpawn(POXWALKER, Biomes.PLAINS);
	}
	
	public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name) 
	{
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(WhaarghHammer.WhaarghH));
		item.setRegistryName(new ResourceLocation(WhaarghHammer.modid, name));
		return item;
	}
	
	public static void registerEntityWorldSpawn(EntityType<?> entity,Biome... biomes)
	{
		for(Biome biome : biomes)
		{
			if(biome != null) 
			{
				biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, 10, 2, 10));
			}
		}
	}
}
