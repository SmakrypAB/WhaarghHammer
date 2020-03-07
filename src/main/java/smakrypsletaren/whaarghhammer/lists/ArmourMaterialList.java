package smakrypsletaren.whaarghhammer.lists;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import smakrypsletaren.whaarghhammer.WhaarghHammer;

public enum ArmourMaterialList implements IArmorMaterial
{
	power("power",  400, new int[] {450, 540, 570, 410}, 25, ItemList.adamantium_ingot, "entity.ender_pearl.throw", 0.0f);
	
	private static final int[] max_damage_array = new int[]{13, 15, 16, 11};
	private String name, equipSound;
	private int durability, enchantability;
	private Item repairItem;
	private int[] damageReductionAmounts;
	private float toughtness;
	
	private ArmourMaterialList(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughtness) 
	{
		this.name = name;
		this.equipSound = equipSound;
		this.durability = durability;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
		this.damageReductionAmounts = damageReductionAmounts;
		this.toughtness = toughtness;
	}

	@Override
	public int getDurability(EquipmentSlotType slot) 
	{
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) {
		// TODO Auto-generated method stub
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() 
	{
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairItem);
	}

	@Override
	public String getName() 
	{
		return WhaarghHammer.modid + ":" + this.name;
	}

	@Override
	public float getToughness() 
	{
		return this.toughtness;
	}
	
	
}
