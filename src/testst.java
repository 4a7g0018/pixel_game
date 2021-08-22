package game;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

class p1 {

    p1() {
        new Thread(this::tp1).start();
        new Thread(this::tp2).start();
    }

    p1(int x) {
        tp1();
        tp2();
    }

    public void tp1() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println("------------------ : i");
        }
    }

    public void tp2() {
        for (int j = 0; j < 1000000; j++) {
            System.out.println("////////////////// : j");
        }
    }
}

class t {

    public ArrayList<File> imgs() {
        ArrayList<File> img = new ArrayList<>();
        img.add(new File("C:\\Users\\4a7g0\\IdeaProjects\\PartyGanePractical\\partyGames\\idle\\halt1.png"));
        img.add(new File("C:\\Users\\4a7g0\\IdeaProjects\\PartyGanePractical\\partyGames\\idle\\halt2.png"));
        img.add(new File("C:\\Users\\4a7g0\\IdeaProjects\\PartyGanePractical\\partyGames\\idle\\halt3.png"));
        return img;
    }


}

class frame extends JFrame {

    frame() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        this.setContentPane(new panel());
        this.add(new panel());
        this.setVisible(true);
    }
}

class panel extends JPanel {

    panel(){
        this.setPreferredSize(new Dimension(100,100));
        this.setLocation(100,100);
        this.setBackground(Color.blue);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("test",100,100);
    }
}

class panel2 extends JPanel {

    panel2(){
        this.setPreferredSize(new Dimension(100,100));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("test2",100,100);
    }
}


public class testst {
    public static void main(String[] args) {
//        new p1(1);
        new frame();


    }

}
