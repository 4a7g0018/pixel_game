package game.role.profession;

import java.io.File;

import java.util.ArrayList;

public class Mage extends Profession {
    private String mageImagesRootPath;

    public Mage(){
        this.mageImagesRootPath="mageImages";
    }

    @Override
    protected String setName() {
        return "Mage";
    }

    @Override
    public int setAttack() {
        return 10;
    }

    @Override
    public int setHP() {
        return 100;
    }

    @Override
    public int setMP() {
        return 100;
    }

    @Override
    protected ArrayList<File> setCreateImage() {
        ArrayList<File> creatImages = new ArrayList<>();
        creatImages.add(new File("mageImages/down/down4.png"));
        return creatImages;
    }

    @Override
    protected ArrayList<File> setTopImages() {
        ArrayList<File> topImages = new ArrayList<>();
        
        topImages.add(new File("mageImages/top/top4.png"));
        topImages.add(new File("mageImages/top/top4.png"));
        topImages.add(new File("mageImages/top/top4.png"));
        topImages.add(new File("mageImages/top/top3.png"));
        topImages.add(new File("mageImages/top/top3.png"));
        topImages.add(new File("mageImages/top/top3.png"));
        topImages.add(new File("mageImages/top/top2.png"));
        topImages.add(new File("mageImages/top/top2.png"));
        topImages.add(new File("mageImages/top/top2.png"));
        topImages.add(new File("mageImages/top/top1.png"));
        topImages.add(new File("mageImages/top/top1.png"));
        topImages.add(new File("mageImages/top/top1.png"));

        return topImages;
    }

    @Override
    protected ArrayList<File> setDownImages() {
        ArrayList<File> idleImages = new ArrayList<>();
        idleImages.add(new File("mageImages/down/down4.png"));
        idleImages.add(new File("mageImages/down/down4.png"));
        idleImages.add(new File("mageImages/down/down4.png"));
        idleImages.add(new File("mageImages/down/down3.png"));
        idleImages.add(new File("mageImages/down/down3.png"));
        idleImages.add(new File("mageImages/down/down3.png"));
        idleImages.add(new File("mageImages/down/down2.png"));
        idleImages.add(new File("mageImages/down/down2.png"));
        idleImages.add(new File("mageImages/down/down2.png"));
        idleImages.add(new File("mageImages/down/down1.png"));
        idleImages.add(new File("mageImages/down/down1.png"));
        idleImages.add(new File("mageImages/down/down1.png"));

        return idleImages;
    }

    @Override
    protected ArrayList<File> setRightImages() {
        ArrayList<File> rightImages = new ArrayList<>();
        rightImages.add(new File("mageImages/right/right4.png"));
        rightImages.add(new File("mageImages/right/right4.png"));
        rightImages.add(new File("mageImages/right/right4.png"));
        rightImages.add(new File("mageImages/right/right3.png"));
        rightImages.add(new File("mageImages/right/right3.png"));
        rightImages.add(new File("mageImages/right/right3.png"));
        rightImages.add(new File("mageImages/right/right2.png"));
        rightImages.add(new File("mageImages/right/right2.png"));
        rightImages.add(new File("mageImages/right/right2.png"));
        rightImages.add(new File("mageImages/right/right1.png"));
        rightImages.add(new File("mageImages/right/right1.png"));
        rightImages.add(new File("mageImages/right/right1.png"));

        return rightImages;
    }

    @Override
    protected ArrayList<File> setLeftImages() {
        ArrayList<File> leftImages = new ArrayList<>();
        leftImages.add(new File("mageImages/left/left4.png"));
        leftImages.add(new File("mageImages/left/left4.png"));
        leftImages.add(new File("mageImages/left/left4.png"));
        leftImages.add(new File("mageImages/left/left3.png"));
        leftImages.add(new File("mageImages/left/left3.png"));
        leftImages.add(new File("mageImages/left/left3.png"));
        leftImages.add(new File("mageImages/left/left2.png"));
        leftImages.add(new File("mageImages/left/left2.png"));
        leftImages.add(new File("mageImages/left/left2.png"));
        leftImages.add(new File("mageImages/left/left1.png"));
        leftImages.add(new File("mageImages/left/left1.png"));
        leftImages.add(new File("mageImages/left/left1.png"));

        return leftImages;
    }

    @Override
    protected ArrayList<File> setTopAttackImages() {
        ArrayList <File> topAttackImages=new ArrayList<>();
        topAttackImages.add(new File("mageImages/top/top_attack.png"));
        return topAttackImages;
    }

    @Override
    protected ArrayList<File> setDowAttackImages() {
        ArrayList <File> downAttackImages=new ArrayList<>();
        downAttackImages.add(new File("mageImages/down/down_attack.png"));
        return downAttackImages;
    }

    @Override
    protected ArrayList<File> setRighAttackImages() {
        ArrayList <File> rightAttackImages=new ArrayList<>();
        rightAttackImages.add(new File("mageImages/right/right_attack.png"));
        return rightAttackImages;
    }

    @Override
    protected ArrayList<File> setLeftAttackImages() {
        ArrayList <File> leftAttackImages=new ArrayList<>();
        leftAttackImages.add(new File("mageImages/left/left_attack.png"));
        return leftAttackImages;
    }

}
