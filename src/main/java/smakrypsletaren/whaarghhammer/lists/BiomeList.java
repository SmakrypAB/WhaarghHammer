package smakrypsletaren.whaarghhammer.lists;

import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

public class BiomeList 
{
	public static Biome bloated_forrest;
	
	public static void registerBiomes()
	{
		registerBiome(bloated_forrest, Type.PLAINS, Type.DRY);
	}
	
	public static void registerBiome(Biome biome, Type... types)
	{
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}
}
