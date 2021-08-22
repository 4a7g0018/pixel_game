package game.controller;

import game.model.World;
import game.role.CreateRole;
import game.view.ViewFrame;

public abstract class GameLoop {

    protected CreateRole player;
    protected World world;
    protected ViewFrame viewFrame;
    private boolean running;
    protected UpdateSprite update;


    public GameLoop() {
//        setPlayer();
//        setWorld();
//        setUpdate();
//        setViewFrame();

//        this.player = setPlayer();
//        this.world = setWorld();
//        this.viewFrame = setViewFrame();
//        this.update = new UpdateSprite(world,player);
    }

    protected abstract void setPlayer();

    protected abstract void setWorld();

    protected abstract void setUpdate();

    protected abstract void setViewFrame();

    public void gameStart() {
        new Thread(this::loop).start();
    }

    protected void loop() {
        this.running = true;
        while (running) {
            update.update();
            viewFrame.start(update);
            fps(10);
        }
    }

    protected void fps(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
