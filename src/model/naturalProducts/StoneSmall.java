package game.model.naturalProducts;

import game.model.SiteMaterial;
import game.model.destroy.Unbreakable;

import java.awt.*;
import java.io.File;

public class StoneSmall extends SiteMaterial implements Natural, Unbreakable {

    public StoneSmall(Point materialLocation) {
        super(materialLocation);
    }

    @Override
    protected void setMaterialName() {
        super.materialName.add("small stone");
    }

    @Override
    protected void setSiteMaterialImagePath() {
        super.materialImagePath.add(new File("stone/small_stone.png"));
    }

    @Override
    protected void setWidth() {
        super.materialWidth.add(32);
    }

    @Override
    protected void setHeight() {
        super.materialHeight.add(32);
    }

    @Override
    public boolean getDestroyLicense() {
        return DESTROY;
    }


}
