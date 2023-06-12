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

import communication.server.Server;
import game.Game;
import game.player.Player;
import org.json.JSONObject;
import utils.Constants;

import java.io.IOException;

public class DonCEyKongJrServer {
    public static void main(String[] args) {
        System.out.println("\n" + Constants.ASCII_NAME + "\n" + Constants.ASCII_JUNIOR + "\n" + Constants.ASCII_SERVER + "\n");


        // TODO : delete all lines below
        // testing zone

        Player[] players = {
                new Player("P1"),
                new Player("P2")
        };

        System.out.println("\n\n\n");

        System.out.println("Game_1");
        Game game_1 = new Game(players[0]);

        System.out.println("\n\n\n");

        JSONObject player_2 = new JSONObject(players[1]);

        Server SS;
        try {
            SS = Server.getInstance();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            SS.WriteToClient(player_2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            SS.ReadFromClient();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            SS.CloseSockets();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}