package WolfShotz.Wyrmroost.content.entities.dragon.dfruitdrake;

import WolfShotz.Wyrmroost.Wyrmroost;
import WolfShotz.Wyrmroost.content.entities.dragon.AbstractDragonRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class DragonFruitDrakeRenderer extends AbstractDragonRenderer<DragonFruitDrakeEntity>
{
    public static final ResourceLocation CHILD = resource("child.png");
    
    public DragonFruitDrakeRenderer(EntityRendererManager manager)
    {
        super(manager, new DragonFruitDrakeModel(), 1.5f);
    }
    
    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(DragonFruitDrakeEntity entity)
    {
        if (entity.isChild()) return CHILD;
        String path = "body_" + (entity.getGender()? "m" : "f");
        if (entity.isSpecial()) path += "_s";
        return resource(path + ".png");
    }
    
    public static ResourceLocation resource(String png)
    {
        return Wyrmroost.rl(DEF_LOC + "dfruitdrake/" + png);
    }
}
