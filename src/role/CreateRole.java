package game.role;

import game.keyboard.Keyboard;
import game.role.profession.Profession;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class CreateRole implements PlayerUpdate {
    private final String name;
    private final Point playerPresetLocation;
    private final Profession profession;
    private final Keyboard keyboard;

    //state images
    private final ArrayList<File> createImages;
    private final ArrayList<File> topImages;
    private final ArrayList<File> downImages;
    private final ArrayList<File> rightImages;
    private final ArrayList<File> leftImages;

    //state attack images
    private final ArrayList<File> topAttackImages;
    private final ArrayList<File> downAttackImages;
    private final ArrayList<File> rightAttackImages;
    private final ArrayList<File> leftAttackImages;


    public CreateRole(String selfName, Profession profession, Point location, Keyboard keyboard) {
        this.name = selfName;
        this.profession = profession;
        this.playerPresetLocation = location;
        this.keyboard = keyboard;
        this.createImages = profession.getCreateImage();
        this.topImages = profession.getTopImages();
        this.downImages = profession.getDownImages();
        this.rightImages = profession.getRightImages();
        this.leftImages = profession.getLeftImages();
        this.topAttackImages=profession.getTopAttackImages();
        this.downAttackImages=profession.getDownAttackImages();
        this.rightAttackImages=profession.getRightAttackImages();
        this.leftAttackImages=profession.getLeftAttackImages();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Profession getProfession() {
        return profession;
    }

    @Override
    public Point getPlayerPresetLocation() {
        return playerPresetLocation;
    }

    @Override
    public Keyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public ArrayList<File> getCreateImage() {
        return createImages;
    }

    @Override
    public ArrayList<File> getTopImages() {
        return topImages;
    }

    @Override
    public ArrayList<File> getDownImages() {
        return downImages;
    }

    @Override
    public ArrayList<File> getRightImages() {
        return rightImages;
    }

    @Override
    public ArrayList<File> getLeftImages() {
        return leftImages;
    }

    @Override
    public ArrayList<File> getTopAttackImages() {
        return topAttackImages;
    }

    @Override
    public ArrayList<File> getDownAttackImages() {
        return downAttackImages;
    }

    @Override
    public ArrayList<File> getRightAttackImages() {
        return rightAttackImages;
    }

    @Override
    public ArrayList<File> getLeftAttackImages() {
        return leftAttackImages;
    }
}
