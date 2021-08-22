package game.controller;

import game.model.World;
import game.role.CreateRole;
import game.view.ViewFrame;

public class Game extends GameLoop {
    private World world;
    private CreateRole player;
    private UpdateSprite update;
    private ViewFrame viewFrame;

    public Game(World world, CreateRole player) {
        this.world = world;
        this.player = player;
        this.update = new UpdateSprite(world,player);
        this.viewFrame = new ViewFrame();


        super.world=this.world;
        super.player=this.player;
        super.update=this.update;
        super.viewFrame=this.viewFrame;
    }


    @Override
    protected void setWorld() {
        super.world=this.world;
    }

    @Override
    protected void setUpdate() {
        super.update=this.update;
    }

    @Override
    protected void setPlayer() {
        super.player=this.player;
    }

    @Override
    protected void setViewFrame() {
        super.viewFrame=this.viewFrame;
    }
}
