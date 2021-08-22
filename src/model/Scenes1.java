package game.model;

import game.model.naturalProducts.House;
import game.model.naturalProducts.StoneSmall;
import game.model.naturalProducts.Tree;

import java.awt.*;
import java.io.File;

public class Scenes1 extends World {
    private final File backgroundImageFile = new File("background/background2.png");

    public Scenes1() {
//        SiteMaterial stoneSmall1 = new StoneSmall(new Point(270, 240));
//        SiteMaterial stoneSmall2 = new StoneSmall(new Point(270, 200));
//        SiteMaterial stoneSmall3 = new StoneSmall(new Point(270, 160));
//        SiteMaterial stoneSmall4 = new StoneSmall(new Point(270, 120));


//        SiteMaterial stoneSmall5 = new StoneSmall(new Point(270, 310));
//        SiteMaterial stoneSmall6 = new StoneSmall(new Point(270, 270));
//
        SiteMaterial topAisleStone1 = new StoneSmall(new Point(290, 230));
        SiteMaterial topAisleStone2 = new StoneSmall(new Point(330, 230));
        SiteMaterial topAisleStone3 = new StoneSmall(new Point(370, 230));
        SiteMaterial topAisleStone4 = new StoneSmall(new Point(410, 230));
        SiteMaterial topAisleStone5 = new StoneSmall(new Point(450, 230));
        SiteMaterial topAisleStone6 = new StoneSmall(new Point(490, 230));
        SiteMaterial topAisleStone7 = new StoneSmall(new Point(530, 230));
        SiteMaterial topAisleStone8 = new StoneSmall(new Point(570, 230));
        SiteMaterial topAisleStone9 = new StoneSmall(new Point(610, 230));
        SiteMaterial topAisleStone10 = new StoneSmall(new Point(650, 230));
        SiteMaterial topAisleStone11 = new StoneSmall(new Point(690, 230));
        SiteMaterial topAisleStone12 = new StoneSmall(new Point(730, 230));


        SiteMaterial downAisleStone1 = new StoneSmall(new Point(10, 350));
        SiteMaterial downAisleStone2 = new StoneSmall(new Point(50, 350));
        SiteMaterial downAisleStone3 = new StoneSmall(new Point(90, 350));
        SiteMaterial downAisleStone4 = new StoneSmall(new Point(130, 350));
        SiteMaterial downAisleStone5 = new StoneSmall(new Point(170, 350));
        SiteMaterial downAisleStone6 = new StoneSmall(new Point(210, 350));
        SiteMaterial downAisleStone7 = new StoneSmall(new Point(250, 350));
        SiteMaterial downAisleStone8 = new StoneSmall(new Point(290, 350));
        SiteMaterial downAisleStone9 = new StoneSmall(new Point(330, 350));
        SiteMaterial downAisleStone10 = new StoneSmall(new Point(370, 350));
        SiteMaterial downAisleStone11 = new StoneSmall(new Point(410, 350));
        SiteMaterial downAisleStone12 = new StoneSmall(new Point(450, 350));
        SiteMaterial downAisleStone13 = new StoneSmall(new Point(490, 350));
        SiteMaterial downAisleStone14 = new StoneSmall(new Point(530, 350));

        SiteMaterial downAisleStone15 = new StoneSmall(new Point(530, 390));
        SiteMaterial downAisleStone16 = new StoneSmall(new Point(530, 430));
        SiteMaterial downAisleStone17 = new StoneSmall(new Point(530, 470));
        SiteMaterial downAisleStone18 = new StoneSmall(new Point(530, 510));
        SiteMaterial downAisleStone19 = new StoneSmall(new Point(530, 550));
        SiteMaterial tree1=new Tree(new Point(360, 80));
        SiteMaterial tree2=new Tree(new Point(560, 80));
        SiteMaterial tree3=new Tree(new Point(760, 80));

        SiteMaterial house=new House(new Point(27,30));


        addSiteMaterials(house);
    }

    @Override
    protected File setBackgroundImage() {
        return backgroundImageFile;
    }

    @Override
    protected Point setBackgroundLocation() {
        return new Point(0, 0);
    }

    @Override
    public File getBackgroundImage() {
        return backgroundImageFile;
    }

    @Override
    public Point getBackgroundLocation() {
        return new Point(0, 0);
    }

}
