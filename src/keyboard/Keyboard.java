package game.keyboard;

import java.awt.event.KeyListener;

public abstract class Keyboard implements KeyListener {
    public SetState setState=new SetState();


    public String getState(){
        return setState.getState();

    }


}
