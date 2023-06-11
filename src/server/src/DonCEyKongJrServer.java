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

import game.assets.AssetFactoryProducer;
import game.assets.entities.Entity;
import game.assets.entities.EntityAbstractFactory;
import game.assets.entities.fruits.Fruit;
import game.assets.entities.fruits.Orange;
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

        EntityAbstractFactory fruitFactory = AssetFactoryProducer.getEntityFactory("Fruit");

        Entity ff = fruitFactory.getEntity("Banana", 500);

        EntityAbstractFactory snapjawFactory = AssetFactoryProducer.getEntityFactory("Snapjaw");

        Entity ss = snapjawFactory.getEntity("FallingSnapjaw", 500);

        Fruit[] fruits =
                {
                        (Fruit) ff,
                        (Fruit) fruitFactory.getEntity("Apple", 153),
                        (Fruit) fruitFactory.getEntity("Orange", 144),
                        new Orange(888)
                };
        Snapjaw[] snapjaws =
                {
                        (Snapjaw) ss,
                        (Snapjaw) snapjawFactory.getEntity("FallingSnapjaw", 153),
                        (Snapjaw) snapjawFactory.getEntity("HangingSnapjaw", 144),
                        new HangingSnapjaw(888)
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