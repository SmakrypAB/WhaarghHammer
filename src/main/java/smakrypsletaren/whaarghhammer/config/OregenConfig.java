package smakrypsletaren.whaarghhammer.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig 
{
	public static ForgeConfigSpec.IntValue tutorial_chance;
	
	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client) 
	{
		server.comment("Oregen Config");
		
		tutorial_chance = server
				.comment("Maximum numbers of ore veins of the tutorial ore that can spawn in one chunk.")
				.defineInRange("oregen.tutorial_chance", 5, 1, 100);
	}
}
