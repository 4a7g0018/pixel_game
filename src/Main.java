package game;

import game.controller.Game;
import game.controller.GameLoop;
import game.keyboard.KeyboardLeft;
import game.model.Scenes1;
import game.model.World;
import game.role.CreateRole;
import game.role.profession.Mage;


import java.awt.*;


public class Main {
    public static void main(String[] args) {
        CreateRole player1 = new CreateRole("John", new Mage(), new Point(200, 240), new KeyboardLeft());
//        new test(player1);
//        System.out.println(player1.getProfession().getCreateImage());
//        System.out.println(player1.getKeyboard().getState());
        World world = new Scenes1();
//        System.out.println(world.getBackgroundLocation());
        GameLoop game = new Game(world, player1);
        game.gameStart();

    }
}
