package game.model.naturalProducts;

import game.model.SiteMaterial;
import game.model.destroy.Unbreakable;

import java.awt.*;
import java.io.File;

public class Tree extends SiteMaterial implements Natural, Unbreakable {

    public Tree(Point materialLocation) {
        super(materialLocation);
    }

    @Override
    protected void setMaterialName() {
        super.materialName.add("Tree");
    }

    @Override
    protected void setSiteMaterialImagePath() {
        super.materialImagePath.add(new File("tree/tree.png"));
    }

    @Override
    protected void setWidth() {
        super.materialWidth.add(100);
    }

    @Override
    protected void setHeight() {
        super.materialHeight.add(128);
    }

    @Override
    public boolean getDestroyLicense() {
        return DESTROY;
    }


}
