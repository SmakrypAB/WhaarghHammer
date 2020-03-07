package smakrypsletaren.whaarghhammer.entities;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.world.World;
import smakrypsletaren.whaarghhammer.lists.EntityList;

public class Poxwalker extends CreatureEntity
{
	@SuppressWarnings("unchecked")
	public Poxwalker(EntityType<? extends CreatureEntity> type, World worldIn) 
	{
		super((EntityType<? extends CreatureEntity>) EntityList.POXWALKER, worldIn);
	}
	
	@Override
	protected void registerGoals()
	{
		this.goalSelector.addGoal(0, new SwimGoal(this));
		this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1.2d));
		this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
	}
	
	@Override
	protected void registerAttributes()
	{
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0d);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.2d);
	}
}
