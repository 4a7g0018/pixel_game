package game.model;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public abstract class World {
    private File backgroundImage;
    private Point backgroundLocation;

    private ArrayList<String> materialNameTable = new ArrayList<>();
    private ArrayList<File> materialsImagesPathTable = new ArrayList<>();
    protected ArrayList<Integer> materialsWidthTable = new ArrayList<>();
    protected ArrayList<Integer> materialHeightTable = new ArrayList<>();
    protected ArrayList<Point> materialLocationTable = new ArrayList<>();

    World() {
        this.backgroundImage = setBackgroundImage();
        this.backgroundLocation = setBackgroundLocation();

    }

    protected abstract File setBackgroundImage();

    protected abstract Point setBackgroundLocation();

    protected void addSiteMaterials(SiteMaterial siteMaterial) {
        System.out.println("add!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        this.materialNameTable = siteMaterial.getMaterialName();
        this.materialsImagesPathTable = siteMaterial.getMaterialImagePath();
        this.materialsWidthTable = siteMaterial.getWidth();
        this.materialHeightTable = siteMaterial.getHeight();
        this.materialLocationTable = siteMaterial.getMaterialLocation();
//        System.out.println(materialNameTable);

    }

    public abstract File getBackgroundImage();

    public abstract Point getBackgroundLocation();


    public ArrayList<String> getMaterialNameTable() {
        return materialNameTable;
    }

    public ArrayList<File> getMaterialsImagesPathTable() {
        return materialsImagesPathTable;
    }

    public ArrayList<Integer> getMaterialsWidthTable() {
        return materialsWidthTable;
    }

    public ArrayList<Integer> getMaterialHeightTable() {
        return materialHeightTable;
    }

    public ArrayList<Point> getMaterialLocationTable() {
        return materialLocationTable;
    }

}
