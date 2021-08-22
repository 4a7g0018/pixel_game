package game.role;

import game.keyboard.Keyboard;
import game.role.profession.Profession;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public interface PlayerUpdate {
    String getName();

    Profession getProfession();

    Point getPlayerPresetLocation();

    Keyboard getKeyboard();

    ArrayList<File> getCreateImage();

    ArrayList<File> getTopImages();

    ArrayList<File> getDownImages();

    ArrayList<File> getRightImages();

    ArrayList<File> getLeftImages();

    ArrayList<File> getTopAttackImages();

    ArrayList<File> getDownAttackImages();

    ArrayList<File> getRightAttackImages();

    ArrayList<File> getLeftAttackImages();


}
