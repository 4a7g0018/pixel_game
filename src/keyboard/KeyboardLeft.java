package game.keyboard;

import java.awt.event.KeyEvent;

public class KeyboardLeft extends Keyboard {


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
//                System.out.println("W-down");
                setState.top();
                break;
            case KeyEvent.VK_A:
//                System.out.println("A-down");
                setState.left();
                break;
            case KeyEvent.VK_D:
//                System.out.println("D-down");
                setState.right();
                break;
            case KeyEvent.VK_S:
//                System.out.println("S-down");
                setState.down();
                break;
            case KeyEvent.VK_J:
//                System.out.println("Attack");
                setState.attack();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
//                System.out.println("W-put");
                setState.setNull();
                break;
            case KeyEvent.VK_A:
//                System.out.println("A-put");
                setState.setNull();
                break;
            case KeyEvent.VK_D:
//                System.out.println("D-put");
                setState.setNull();
                break;
            case KeyEvent.VK_S:
//                System.out.println("S-put");
                setState.setNull();
                break;
            case KeyEvent.VK_J:
//                System.out.println("Attack-put");
                setState.setNull();
        }
    }
}
