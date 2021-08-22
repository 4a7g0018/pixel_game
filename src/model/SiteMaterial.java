package game.model;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public abstract class SiteMaterial {
    protected static ArrayList<String> materialName = new ArrayList<>();
    protected static ArrayList<File> materialImagePath = new ArrayList<>();
    protected static ArrayList<Integer> materialWidth = new ArrayList<>();
    protected static ArrayList<Integer> materialHeight = new ArrayList<>();
    protected static ArrayList<Point> materialLocation = new ArrayList<>();


    public SiteMaterial(Point materialLocation) {
        setMaterialName();
        setSiteMaterialImagePath();
        setWidth();
        setHeight();
        this.materialLocation.add(materialLocation);
    }

    protected abstract void setMaterialName();

    protected abstract void setSiteMaterialImagePath();

    protected abstract void setWidth();//用來做物理的碰撞

    protected abstract void setHeight();//用來做物理的碰撞

    public ArrayList<String> getMaterialName() {
        return materialName;
    }

    public ArrayList<File> getMaterialImagePath() {
        return materialImagePath;
    }


    public ArrayList<Integer> getWidth() {
        return materialWidth;
    }

    public ArrayList<Integer> getHeight() {
        return materialHeight;
    }

    public ArrayList<Point> getMaterialLocation() {
        return materialLocation;
    }
}
