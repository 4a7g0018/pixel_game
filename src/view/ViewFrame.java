package game.view;

import game.controller.UpdateSprite;

import javax.swing.*;
import java.awt.*;


public class ViewFrame extends JFrame {
    private final int width = 500;
    private final int height = 600;

    private Panel panel;
//    private UpdateSprite update;


    public ViewFrame() {
        Panel panel = new Panel();
        this.panel = panel;
        init();

//        JSplitPane jSplitPane=new JSplitPane();
//        jSplitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
//        jSplitPane.setDividerLocation(250);
//        jSplitPane.setTopComponent(test());
//        jSplitPane.setBottomComponent(this.panel);
//        this.add(jSplitPane);

        this.setContentPane(this.panel);
        this.setVisible(true);
    }

    private JPanel test(){
        JPanel jPanel=new JPanel();
        JLabel jLabel=new JLabel("testsesatasdsasdsada");
        jPanel.add(jLabel);
        jPanel.setPreferredSize(new Dimension(500,100));
        jPanel.setLocation(0,0);

        return jPanel;
    }

    protected void init() {
        this.setTitle("title");
        this.setSize(this.width, this.height);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void start(UpdateSprite update) {
        this.addKeyListener(update.getPlayerKeyboard());
        panel.draw(update);
    }


    public static class Panel extends JPanel {
        private static String oldState = null;
        private static int i = 0;
        private static UpdateSprite update;

        protected void fps(long ms) {
            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void draw(UpdateSprite updates) {
            update = updates;
        }

        public void drawBackground(Graphics g) {
            g.drawImage(new ImageIcon(String.valueOf(update.getBackgroundImages())).getImage(), update.getPlayerMoveLocation().x, update.getPlayerMoveLocation().y, 1000, 1000, null);
            System.out.println("******************************************************************************************************************");
            for (int i = 0; i < update.getMaterialNameTable().size(); i++) {
                g.drawImage(new ImageIcon(String.valueOf(update.getMaterialImagesTable().get(i))).getImage(), update.getMaterialLocationTable().get(i).x + update.getPlayerMoveLocation().x, update.getMaterialLocationTable().get(i).y + update.getPlayerMoveLocation().y, update.getMaterialWidthTable().get(i), update.getMaterialHeightTable().get(i), null);
//                g.drawImage(new ImageIcon(String.valueOf(update.getMaterialImagesTable().get(i))).getImage(), update.getMaterialLocationTable().get(i).x + update.getPlayerMoveLocation().x, update.getMaterialLocationTable().get(i).y + update.getPlayerMoveLocation().y, null);
                System.out.println(update.getMaterialNameTable().get(i)+" : ( "+(update.getMaterialLocationTable().get(i).x + update.getPlayerMoveLocation().x)+" , "+(update.getMaterialLocationTable().get(i).y + update.getPlayerMoveLocation().y)+ " )");



//                g.drawLine(update.getMaterialLocationTable().get(i).x + update.getPlayerMoveLocation().x, update.getMaterialLocationTable().get(i).y + update.getPlayerMoveLocation().y-30,
//                        update.getMaterialLocationTable().get(i).x + update.getPlayerMoveLocation().x, update.getMaterialLocationTable().get(i).y + update.getPlayerMoveLocation().y+30);
//                g.drawLine(update.getMaterialLocationTable().get(i).x + update.getPlayerMoveLocation().x-30, update.getMaterialLocationTable().get(i).y + update.getPlayerMoveLocation().y,
//                        update.getMaterialLocationTable().get(i).x + update.getPlayerMoveLocation().x+30, update.getMaterialLocationTable().get(i).y + update.getPlayerMoveLocation().y);
//                g.setColor(Color.blue);

            }
            System.out.println("p : ( "+ update.getPlayerMoveLocation().x+","+update.getPlayerMoveLocation().y+" )");
            repaint();
        }

        public void drawRole(Graphics g) {
            g.drawImage(new ImageIcon(String.valueOf(update.getPlayerImages())).getImage(),update.getPlayerPresetLocation().x,update.getPlayerPresetLocation().y,30,50,null);
            //player box
            int x=((update.getPlayerMoveLocation().x-update.getPlayerPresetLocation().x)*(-1));
            int y=((update.getPlayerMoveLocation().y- update.getPlayerPresetLocation().y)*(-1));
//            g.drawLine(x+30+ update.getPlayerMoveLocation().x ,y+50+ update.getPlayerMoveLocation().y, x-10+ update.getPlayerMoveLocation().x , y-10+ update.getPlayerMoveLocation().y);
//            g.setColor(Color.RED);

            fps(30);
            repaint();

        }


        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);


            drawBackground(g);
            drawRole(g);

        }
    }

}
