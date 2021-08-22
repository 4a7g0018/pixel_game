package game.keyboard;

import java.awt.event.KeyEvent;

public class KeyboardRight extends Keyboard {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                System.out.println("UP-down");
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("LEFT-down");
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("RIGHT-down");
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("DOWN-down");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:

                System.out.println("UP-put");
                break;
            case KeyEvent.VK_LEFT:

                System.out.println("LEFT-put");
                break;
            case KeyEvent.VK_RIGHT:

                System.out.println("RIGHT-put");
                break;
            case KeyEvent.VK_DOWN:

                System.out.println("DOWN-put");
                break;
        }
    }

}
