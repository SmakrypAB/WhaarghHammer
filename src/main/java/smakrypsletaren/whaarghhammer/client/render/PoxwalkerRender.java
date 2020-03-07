package smakrypsletaren.whaarghhammer.client.render;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import smakrypsletaren.whaarghhammer.WhaarghHammer;
import smakrypsletaren.whaarghhammer.client.models.PoxwalkerModel;
import smakrypsletaren.whaarghhammer.entities.Poxwalker;

@OnlyIn(Dist.CLIENT)
public class PoxwalkerRender extends LivingRenderer<Poxwalker, PoxwalkerModel>
{

	public PoxwalkerRender(EntityRendererManager manager) 
	{
		super(manager, new PoxwalkerModel(), 0f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Poxwalker entity) 
	{
		return new ResourceLocation(WhaarghHammer.modid, "textures/entities/poxwalker.png");
	}
	
	public static class RenderFactory implements IRenderFactory<Poxwalker>
	{
		@Override
		public EntityRenderer<? super Poxwalker> createRenderFor(EntityRendererManager manager) 
		{
			return new PoxwalkerRender(manager);
		}
		
	}
}
