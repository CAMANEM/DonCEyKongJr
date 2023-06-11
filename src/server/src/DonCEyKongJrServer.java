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

import communication.Socket.SocketServer;
import game.Game;
import game.assets.entities.fruits.Fruit;
import game.assets.entities.fruits.FruitFactory;
import game.assets.entities.snapjaws.Snapjaw;
import game.assets.entities.snapjaws.SnapjawFactory;
import game.player.Player;
import javax.json.*;

import org.json.JSONObject;
import utils.Constants;

import java.io.IOException;
import java.util.Arrays;

public class DonCEyKongJrServer {
    public static void main(String[] args) {
        System.out.println("\n" + Constants.ASCII_NAME + "\n" + Constants.ASCII_JUNIOR + "\n" + Constants.ASCII_SERVER + "\n");


        // TODO : delete all lines below

        // testing zone

        FruitFactory FF = new FruitFactory();
        SnapjawFactory SF = new SnapjawFactory();

        Fruit[] fruits =
                {
                        FF.generateFruit(),
                        FF.generateFruit()
                };
        Snapjaw[] snapjaws =
                {
                        SF.generateSnapjaw(),
                        SF.generateSnapjaw()
                };

        Player[] players = {
                new Player("P1"),
                new Player("P2")
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
            System.out.println(p.getUsername());
        }

        JsonObject jo = Json.createObjectBuilder().add("Fruit", Json.createObjectBuilder().add("ID",fruits[0].getId())).build();
        System.out.println(jo);
        SocketServer SS = null;
        try {
            SS = SocketServer.getInstance();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            SS.Write_to_Client();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("game1");
        Game g = new Game(players[0]);

        System.out.println("game2");
        Game gg = new Game(players[0]);
    }
}