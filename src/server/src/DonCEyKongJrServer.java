/*
Sebastián M. Chen Cerdas (https://github.com/seballoll)
Valerie M. Hernández Fernández (https://github.com/valeriehernandez-7)
Óscar M. Soto Varela (https://github.com/CAMANEM)

DonCEy Kong Jr (Server)
Extra-class

Costa Rica Institute of Technology
Cartago Central Technology Campus
Computer Engineering Academic Area

CE 3104 Languages, Compilers and Interpreters
Eng. Marco Rivera Meneses, MGP
Class 01

I Semester
2023
*/

import game.assets.entities.fruits.Apple;
import game.assets.entities.fruits.Banana;
import game.assets.entities.fruits.Fruit;
import game.assets.entities.fruits.Orange;
import game.assets.entities.snapjaws.FallingSnapjaw;
import game.assets.entities.snapjaws.HangingSnapjaw;
import game.assets.entities.snapjaws.Snapjaw;
import game.player.Player;
import utils.Constants;

import java.util.Arrays;

public class DonCEyKongJrServer {
    public static void main(String[] args) {
        System.out.println("\n" + Constants.ASCII_NAME + "\n" + Constants.ASCII_JUNIOR + "\n" + Constants.ASCII_SERVER + "\n");


        // TODO : delete all lines below

        // testing zone

        Fruit[] fruits =
                {
                        new Banana(500),
                        new Apple(157),
                        new Orange(888)
                };
        Snapjaw[] snapjaws =
                {
                        new FallingSnapjaw(500),
                        new HangingSnapjaw(5)
                };

        Player[] players = {
                new Player(),
                new Player(),
                new Player()
        };

        for (Fruit f : fruits) {
            System.out.println(f.getId());
            System.out.println(f.getSprite());
            System.out.println(f.getVisible());
            System.out.println(f.getScore());
            System.out.println(f.getState());
            System.out.println(f.getStateAsString());
            System.out.println(Arrays.toString(f.getPosition()));
            System.out.println(Arrays.toString(f.getSize()));
            System.out.println("\n\n");
        }

        for (Snapjaw s : snapjaws) {
            System.out.println(s.getId());
            System.out.println(s.getSprite());
            System.out.println(s.getVisible());
            System.out.println(s.getScore());
            System.out.println(s.getState());
            System.out.println(s.getStateAsString());
            System.out.println(Arrays.toString(s.getPosition()));
            System.out.println(Arrays.toString(s.getSize()));
            System.out.println("\n\n");
        }

        for (Player p : players) {
            System.out.println(p.getId());
        }
    }
}