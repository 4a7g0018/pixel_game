package game.controller;

import game.keyboard.Keyboard;
import game.model.World;
import game.model.physics.EventCollision;
import game.role.CreateRole;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;


public class UpdateSprite {
    private World world;
    private CreateRole player;
    private String oldState = null;

    //background
    private File backgroundImages;
    private Point backgroundLocation;

    //material
    private ArrayList<String> materialNameTable;
    private ArrayList<File> materialImagesTable;
    private ArrayList<Point> materialLocationTable;
    private ArrayList<Integer> materialWidthTable;
    private ArrayList<Integer> materialHeightTable;

    //player
    private Keyboard playerKeyboard;
    private String state;
    private File playerImages;
    private Point playerPresetLocation;
    private Point playerMoveLocation = new Point(0, 0);
    private int playerMoveLocationX;
    private int playerMoveLocationY;
    private int playerImagesNumber = 0;
    private int playerMovePace=8;

    //physics
    private EventCollision collision;

    //test
    private boolean topCollision = false;
    private boolean downCollision = false;
    private boolean rightCollision = false;
    private boolean leftCollision = false;
    private boolean oldCollision = false;

    public UpdateSprite(World world, CreateRole player) {
        this.world = world;
        this.player = player;
    }

    public void update() {
//        System.out.println("update !!!");
        this.backgroundImages = world.getBackgroundImage();
        this.backgroundLocation = world.getBackgroundLocation();

        this.materialNameTable = world.getMaterialNameTable();
        this.materialImagesTable = world.getMaterialsImagesPathTable();
        this.materialLocationTable = world.getMaterialLocationTable();
        this.materialWidthTable = world.getMaterialsWidthTable();
        this.materialHeightTable = world.getMaterialHeightTable();


        this.playerKeyboard = player.getKeyboard();
        this.state = player.getKeyboard().getState();
        this.playerPresetLocation = player.getPlayerPresetLocation();
        System.out.println("update");
        System.out.println(playerPresetLocation);

        this.collision = new EventCollision(playerPresetLocation, playerMoveLocation, materialLocationTable);
    }

    //background
    public File getBackgroundImages() {
        return backgroundImages;
    }

    public Point getBackgroundLocation() {
        return backgroundLocation;
    }

    //material
    public ArrayList<String> getMaterialNameTable() {
        return materialNameTable;
    }

    public ArrayList<File> getMaterialImagesTable() {
        return materialImagesTable;
    }

    public ArrayList<Point> getMaterialLocationTable() {
        return materialLocationTable;
    }

    public ArrayList<Integer> getMaterialWidthTable() {
        return materialWidthTable;
    }

    public ArrayList<Integer> getMaterialHeightTable() {
        return materialHeightTable;
    }

    //player

    public Keyboard getPlayerKeyboard() {
        return playerKeyboard;
    }

    public String getState() {
        return state;
    }

    public File getPlayerImages() {
        playerImages = getImage();
        return playerImages;
    }

    public Point getPlayerPresetLocation() {
        return playerPresetLocation;
    }

//    public int getPlayerMoveLocationX() {
//        return playerMoveLocationX;
//    }
//
//    public int getPlayerMoveLocationY() {
//        return playerMoveLocationY;
//    }

    public Point getPlayerMoveLocation() {
        return playerMoveLocation;
    }

    private File getImage() {
        if (state != "attack" && state != "create" && state != null) {
            oldState = state;
        }

        //playerImagesNumber++ & playerImagesNumber reset
        if (state == oldState) {
            playerImagesNumber++;
            if (playerImagesNumber == player.getTopImages().size()) {
                playerImagesNumber = 0;
            }
        }

        if (oldCollision != collision.getCollision()) {
            oldCollision = collision.getCollision();
        }
//        System.out.println("-------------------------------");
//        System.out.println("old state"+oldState);
//        System.out.println("*******************************");

        //get image to state


        if (state == "create") {
            return player.getCreateImage().get(playerImagesNumber);
        } else if (state == "top") {

            if (collision.getCollision() == true && downCollision == false && rightCollision == false && leftCollision == false) {//是否撞到
                topCollision = true;
            }else if (collision.getCollision() == false){
                topCollision = false;
                downCollision = false;
                rightCollision = false;
                leftCollision = false;
            }

            if (topCollision == false) {
                playerMoveLocation.y += playerMovePace;
            }
            return player.getTopImages().get(playerImagesNumber);

        } else if (state == "down") {

            if (collision.getCollision() == true && topCollision == false && rightCollision == false && leftCollision == false) {
                downCollision = true;
            }else if (collision.getCollision() == false){
                topCollision = false;
                downCollision = false;
                rightCollision = false;
                leftCollision = false;
            }

            if (downCollision == false) {
                playerMoveLocation.y -= playerMovePace;
            }
            return player.getDownImages().get(playerImagesNumber);

        } else if (state == "right") {
            if (collision.getCollision() == true  && topCollision == false && downCollision == false && leftCollision == false) {
                rightCollision = true;
            }else if (collision.getCollision() == false){
                topCollision = false;
                downCollision = false;
                rightCollision = false;
                leftCollision = false;
            }

            if (rightCollision == false) {
                playerMoveLocation.x -= playerMovePace;
            }
            return player.getRightImages().get(playerImagesNumber);

        } else if (state == "left") {

            if (collision.getCollision() == true  && topCollision == false && downCollision == false && rightCollision == false ) {
                leftCollision = true;
            }else if (collision.getCollision() == false){
                topCollision = false;
                downCollision = false;
                rightCollision = false;
                leftCollision = false;
            }

            if (leftCollision == false) {
                playerMoveLocation.x += playerMovePace;
            }
            return player.getLeftImages().get(playerImagesNumber);

        } else {
            //剩餘狀態:attack、null
            playerImagesNumber = 0;
            if (state == "attack") {
                if (oldState == "top") {
                    return player.getTopAttackImages().get(0);

                } else if (oldState == "down") {
                    return player.getDownAttackImages().get(0);

                } else if (oldState == "right") {
                    return player.getRightAttackImages().get(0);

                } else if (oldState == "left") {
                    return player.getLeftAttackImages().get(0);

                } else {
                    return null;
                }
            } else {
                if (oldState == "top") {
                    return player.getTopImages().get(0);
                } else if (oldState == "down") {
                    return player.getDownImages().get(0);
                } else if (oldState == "right") {
                    return player.getRightImages().get(0);
                } else if (oldState == "left") {
                    return player.getLeftImages().get(0);
                } else {
                    return null;
                }
            }
        }


    }
//    public int getBackgroundLocationX() {
//        return player.getKeyboard().getBackgroundX();
//    }
//
//    public int getBackgroundLocationY() {
//        return player.getKeyboard().getBackgroundY();
//    }
}
