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
import game.assets.entities.snapjaws.Snapjaw;
import game.global.Constants;

import java.util.Arrays;

public class DonCEyKongJrServer implements Constants {
    public static void main(String[] args) {
        System.out.println("\n" + ASCII_NAME + "\n" + ASCII_JUNIOR + "\n" + ASCII_SERVER + "\n");

        Fruit[] fruits =
                {
                        new Banana(500, 6, 6),
                        new Apple(157, 5, 3),
                        new Orange(888, 4, 6)
                };
        Snapjaw[] snapjaws =
                {
                        new FallingSnapjaw(500, 5,8)
                };

        for (Fruit f : fruits) {
            System.out.println(f.getId());
            System.out.println(f.getVisible());
            System.out.println(f.getScore());
            System.out.println(f.getState());
            System.out.println(f.getStateAsFruitState());
            System.out.println(Arrays.toString(f.getPosition()));
            System.out.println("\n\n");
        }
    }
}