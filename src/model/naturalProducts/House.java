package game.model.naturalProducts;

import game.model.SiteMaterial;
import game.model.destroy.Unbreakable;

import java.awt.*;
import java.io.File;

public class House extends SiteMaterial implements Natural, Unbreakable {

    public House(Point materialLocation) {
        super(materialLocation);
    }

    @Override
    protected void setMaterialName() {
        super.materialName.add("house");
    }

    @Override
    protected void setSiteMaterialImagePath() {
        super.materialImagePath.add(new File("house/house3.png"));
    }

    @Override
    protected void setWidth() {
        super.materialWidth.add(240);
    }

    @Override
    protected void setHeight() {
        super.materialHeight.add(230);
    }

    @Override
    public boolean getDestroyLicense() {
        return DESTROY;
    }
}
