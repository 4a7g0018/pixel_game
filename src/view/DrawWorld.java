package game.view;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class DrawWorld implements PaintBrush{
    private ArrayList<File> backgroundImage=new ArrayList<>();
    public DrawWorld(){
        backgroundImage.add(new File("C:\\Users\\4a7g0\\IdeaProjects\\PartyGanePractical\\partyGames\\background\\background.jpg"));
    }

    @Override
    public void draw(Graphics g,int imageNumber) {
        g.drawImage(new ImageIcon(String.valueOf(backgroundImage.get(imageNumber))).getImage(),0,0,null);
    }

    @Override
    public int getImagesAmount() {
        return backgroundImage.size();
    }


}
