package smakrypsletaren.whaarghhammer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import smakrypsletaren.whaarghhammer.client.render.TutorialRenderRegistries;
import smakrypsletaren.whaarghhammer.config.Config;
import smakrypsletaren.whaarghhammer.lists.ArmourMaterialList;
import smakrypsletaren.whaarghhammer.lists.BiomeList;
import smakrypsletaren.whaarghhammer.lists.BlockList;
import smakrypsletaren.whaarghhammer.lists.EntityList;
import smakrypsletaren.whaarghhammer.lists.ItemList;
import smakrypsletaren.whaarghhammer.lists.ToolMaterialList;
import smakrypsletaren.whaarghhammer.world.OreGeneration;
import smakrypsletaren.whaarghhammer.world.biomes.BloatedForrest;

@Mod("whaarghhammer")
public class WhaarghHammer 
{
	public static WhaarghHammer instance;
	public static final String modid = "whaarghhammer";
	public static final Logger logger = LogManager.getLogger(modid);
	
	public static final ItemGroup WhaarghH = new WhaarghHammerItemGroup();
	
	public WhaarghHammer() 
	{
		instance = this;
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.server_config, "whaarghhammer-server.toml");
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.client_config, "whaarghhammer-client.toml");
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		Config.loadConfig(Config.client_config, FMLPaths.CONFIGDIR.get().resolve("whaarghhammer-client.toml").toString());
		Config.loadConfig(Config.server_config, FMLPaths.CONFIGDIR.get().resolve("whaarghhammer-server.toml").toString());
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) 
	{
		OreGeneration.setupOreGeneration();		
		
		logger.info("Setup method registered");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) 
	{
		TutorialRenderRegistries.registryEntityRenders();
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegsitryEvents
	{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event)
		{
			event.getRegistry().registerAll
			(
					ItemList.adamantium_ingot = new Item(new Item.Properties().group(WhaarghH)).setRegistryName(location("adamantium_ingot")),
					ItemList.plastic = new Item(new Item.Properties().group(WhaarghH)).setRegistryName(location("plastic")),
					ItemList.plasteel_ingot = new Item(new Item.Properties().group(WhaarghH)).setRegistryName(location("plasteel_ingot")),
					ItemList.ceramite_ingot = new Item(new Item.Properties().group(WhaarghH)).setRegistryName(location("ceramite_ingot")),
					ItemList.oil_bucket = new Item(new Item.Properties().group(WhaarghH)).setRegistryName(location("oil_bucket"))
					
					ItemList.adamantium_axe = new AxeItem(ToolMaterialList.tutorial, -1.0f, 6.0f, new Item.Properties().group(WhaarghH)).setRegistryName(location("adamantium_axe")),
					ItemList.adamantium_hoe = new HoeItem(ToolMaterialList.tutorial, 6.0f, new Item.Properties().group(WhaarghH)).setRegistryName(location("adamantium_hoe")),
					ItemList.adamantium_pickaxe = new PickaxeItem(ToolMaterialList.tutorial, -2, 6.0f, new Item.Properties().group(WhaarghH)).setRegistryName(location("adamantium_pickaxe")),
					ItemList.adamantium_shovel = new ShovelItem(ToolMaterialList.tutorial, -1.0f, 6.0f, new Item.Properties().group(WhaarghH)).setRegistryName(location("adamantium_shovel")),
					ItemList.adamantium_sword = new SwordItem(ToolMaterialList.tutorial, 0, 6.0f, new Item.Properties().group(WhaarghH)).setRegistryName(location("adamantium_sword")),
					
					ItemList.power_helmet = new ArmorItem(ArmourMaterialList.power, EquipmentSlotType.HEAD, new Item.Properties().group(WhaarghH)).setRegistryName(location("power_helmet")),
					ItemList.power_chestplate = new ArmorItem(ArmourMaterialList.power, EquipmentSlotType.CHEST, new Item.Properties().group(WhaarghH)).setRegistryName(location("power_chestplate")),
					ItemList.power_leggings = new ArmorItem(ArmourMaterialList.power, EquipmentSlotType.LEGS, new Item.Properties().group(WhaarghH)).setRegistryName(location("power_leggings")),
					ItemList.power_boots = new ArmorItem(ArmourMaterialList.power, EquipmentSlotType.FEET, new Item.Properties().group(WhaarghH)).setRegistryName(location("power_boots")),
					
					ItemList.adamantium_block = new BlockItem(BlockList.adamantium_block, new Item.Properties().group(WhaarghH)).setRegistryName(BlockList.adamantium_block.getRegistryName()),
					ItemList.adamantium_ore1 = new BlockItem(BlockList.adamantium_ore1, new Item.Properties().group(WhaarghH)).setRegistryName(BlockList.adamantium_ore1.getRegistryName()),
					ItemList.adamantium_ore2 = new BlockItem(BlockList.adamantium_ore2, new Item.Properties().group(WhaarghH)).setRegistryName(BlockList.adamantium_ore2.getRegistryName()),
					ItemList.adamantium_ore3 = new BlockItem(BlockList.adamantium_ore3, new Item.Properties().group(WhaarghH)).setRegistryName(BlockList.adamantium_ore3.getRegistryName())
			);
			
			EntityList.registerEntitySpawnEggs(event);
			
			logger.info("Items Registered.");
		}
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event)
		{
			event.getRegistry().registerAll
			(
					BlockList.adamantium_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)).setRegistryName(location("adamantium_block")),
					BlockList.adamantium_ore1 = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)).setRegistryName(location("adamantium_ore1")),
					BlockList.adamantium_ore2 = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)).setRegistryName(location("adamantium_ore2")),
					BlockList.adamantium_ore3 = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.METAL)).setRegistryName(location("adamantium_ore3"))
			);
			
			logger.info("Blocks Registered.");
		}
		
		@SubscribeEvent
		public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
		{
			event.getRegistry().registerAll
			(
				EntityList.POXWALKER
			);
			
			EntityList.registerEntityWorldSpawns();
		}
		
		@SubscribeEvent
		public static void registerBiomes(final RegistryEvent.Register<Biome> event)
		{
			event.getRegistry().registerAll
			(
					BiomeList.bloated_forrest = new BloatedForrest()
			);
			
			BiomeList.registerBiomes();
		}
		
		public static ResourceLocation location(String name) 
		{
			return new ResourceLocation(modid, name);
		}
	}
} 