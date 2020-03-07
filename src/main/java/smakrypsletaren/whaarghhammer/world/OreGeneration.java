package smakrypsletaren.whaarghhammer.world;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import smakrypsletaren.whaarghhammer.config.OregenConfig;

public class OreGeneration 
{
	public static void setupOreGeneration()
	{
		for(Biome biome : ForgeRegistries.BIOMES) 
		{
			biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, smakrypsletaren.whaarghhammer.lists.BlockList.adamantium_ore1.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(OregenConfig.tutorial_chance.get(), 50, 0,10)));
			biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, smakrypsletaren.whaarghhammer.lists.BlockList.adamantium_ore2.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(OregenConfig.tutorial_chance.get(), 50, 0,10)));
		}
	}
}
