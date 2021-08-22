package game.view;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class DrawIdle implements PaintBrush{
    private ArrayList<File> playerImage=new ArrayList<>();
    public DrawIdle(){
        playerImage.add(new File("C:\\Users\\4a7g0\\IdeaProjects\\PartyGanePractical\\partyGames\\idle\\halt1.png"));
        playerImage.add(new File("C:\\Users\\4a7g0\\IdeaProjects\\PartyGanePractical\\partyGames\\idle\\halt2.png"));
        playerImage.add(new File("C:\\Users\\4a7g0\\IdeaProjects\\PartyGanePractical\\partyGames\\idle\\halt3.png"));
    }

    @Override
    public void draw(Graphics g,int imageNumber) {
        g.drawImage(new ImageIcon(String.valueOf(playerImage.get(imageNumber))).getImage(),30,30,null);
    }

    @Override
    public int getImagesAmount() {
        return playerImage.size();
    }


}
