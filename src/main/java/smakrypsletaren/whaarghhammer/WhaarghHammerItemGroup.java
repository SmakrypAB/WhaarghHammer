package smakrypsletaren.whaarghhammer;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import smakrypsletaren.whaarghhammer.lists.ItemList;

public class WhaarghHammerItemGroup extends ItemGroup
{
	public WhaarghHammerItemGroup() 
	{
		super("WhaarghH");
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(ItemList.adamantium_sword);
	}
}
