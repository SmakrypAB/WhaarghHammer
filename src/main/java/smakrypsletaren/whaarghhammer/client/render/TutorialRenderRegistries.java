package smakrypsletaren.whaarghhammer.client.render;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import smakrypsletaren.whaarghhammer.entities.Poxwalker;

@OnlyIn(Dist.CLIENT)
public class TutorialRenderRegistries 
{
	public static void registryEntityRenders() 
	{
		RenderingRegistry.registerEntityRenderingHandler(Poxwalker.class, new PoxwalkerRender.RenderFactory());
	}
}
