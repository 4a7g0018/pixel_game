package game.model.physics;

import java.awt.*;
import java.util.ArrayList;

public class EventCollision {
    private Point playerPresetLocation;
    private Point playerMoveLocation;
    private ArrayList<Point> materialLocationTable;
    private boolean collision = false;

    public EventCollision(Point playerPresetLocation,Point playerMoveLocation, ArrayList<Point> materialLocationTable) {
        this.playerPresetLocation=playerPresetLocation;
        this.playerMoveLocation = playerMoveLocation;
        this.materialLocationTable = materialLocationTable;

        this.collision=false;
    }


    public void tryCollision() {
        System.out.println("//////////////////////////////////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////");

        for (Point materialPoints : materialLocationTable) {
            System.out.println("m --("+(materialPoints.x+playerMoveLocation.x)+","+(materialPoints.y+playerMoveLocation.y)+" )");
            System.out.println("p --("+playerMoveLocation.x+","+playerMoveLocation.y+" )");

            System.out.println(playerPresetLocation);
            int x=((materialPoints.x-playerPresetLocation.x)*(-1));
            int y=((materialPoints.y- playerPresetLocation.y)*(-1));
            System.out.println("new : ( "+x+","+y+" )");
            if(x+30>playerMoveLocation.x && playerMoveLocation.x>x-25 && y+45>playerMoveLocation.y && playerMoveLocation.y>y-10){
                System.out.println("??????????????????????????");
                this.collision=true;
            }
        }
    }

    public void setCollision(boolean collision) {
        this.collision = collision;
    }

    public boolean getCollision(){
        tryCollision();
        return collision;
    }

}
