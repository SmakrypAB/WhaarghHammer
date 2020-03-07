package smakrypsletaren.whaarghhammer.world.biomes;

import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import smakrypsletaren.whaarghhammer.WhaarghHammer;
import smakrypsletaren.whaarghhammer.lists.BlockList;
import smakrypsletaren.whaarghhammer.lists.EntityList;

public class BloatedForrest extends Biome 
{
	public BloatedForrest() 
	{
		super(new Biome.Builder()
				.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlockList.adamantium_block.getDefaultState(), BlockList.adamantium_ore1.getDefaultState(), BlockList.adamantium_ore3.getDefaultState())))
				.precipitation(RainType.SNOW)
				.category(Category.FOREST)
				.downfall(0.5f)
				.depth(0.4f)
				.temperature(0.5f)
				.scale(0.5f)
				.waterColor(0xdce8c1)
				.waterFogColor(0xcad6b0)
				.parent(null));
		DefaultBiomeFeatures.addCarvers(this);
		DefaultBiomeFeatures.addOres(this);
		
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityList.POXWALKER, 100, 1, 5));
		
		this.setRegistryName(WhaarghHammer.modid, "bloated_forrest");
	}
	
}
