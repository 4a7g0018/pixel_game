package game.role.profession;

import java.io.File;
import java.util.ArrayList;

public abstract class Profession {
    private final String name;
    private final int attack;
    private final int HP;
    private final int MP;
    private final ArrayList<File> creatImage;
    private final ArrayList<File> topImages ;
    private final ArrayList<File> downImages;
    private final ArrayList<File> leftImages;
    private final ArrayList<File> rightImages;

    private final ArrayList<File> topAttackImages;
    private final ArrayList<File> downAttackImages;
    private final ArrayList<File> leftAttackImages;
    private final ArrayList<File> rightAttackImages;

    Profession() {
        this.name = setName();
        this.attack = setAttack();
        this.HP = setHP();
        this.MP = setMP();
        this.creatImage = setCreateImage();
        this.topImages = setTopImages();
        this.downImages = setDownImages();
        this.rightImages = setRightImages();
        this.leftImages = setLeftImages();
        this.topAttackImages=setTopAttackImages();
        this.downAttackImages=setDowAttackImages();
        this.leftAttackImages=setLeftAttackImages();
        this.rightAttackImages=setRighAttackImages();
    }

    protected abstract String setName();

    public abstract int setAttack();

    public abstract int setHP();

    public abstract int setMP();

    protected abstract ArrayList<File> setCreateImage();

    //set run attack

    protected abstract ArrayList<File> setTopImages();

    protected abstract ArrayList<File> setDownImages();

    protected abstract ArrayList<File> setRightImages();

    protected abstract ArrayList<File> setLeftImages();

    //set attack images

    protected abstract ArrayList<File> setTopAttackImages();

    protected abstract ArrayList<File> setDowAttackImages();

    protected abstract ArrayList<File> setRighAttackImages();

    protected abstract ArrayList<File> setLeftAttackImages();


    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public ArrayList<File> getCreateImage() {
        return creatImage;
    }

    public ArrayList<File> getTopImages() {
        return topImages;
    }

    public ArrayList<File> getDownImages() {
        return downImages;
    }

    public ArrayList<File> getRightImages() {
        return rightImages;
    }

    public ArrayList<File> getLeftImages() {
        return leftImages;
    }

    public ArrayList<File> getTopAttackImages() {
        return topAttackImages;
    }

    public ArrayList<File> getDownAttackImages() {
        return downAttackImages;
    }

    public ArrayList<File> getRightAttackImages() {
        return rightAttackImages;
    }

    public ArrayList<File> getLeftAttackImages() {
        return leftAttackImages;
    }
}
