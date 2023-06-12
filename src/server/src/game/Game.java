package game;

import game.assets.entities.fruits.Fruit;
import game.assets.entities.fruits.FruitFactory;
import game.assets.entities.snapjaws.Snapjaw;
import game.assets.entities.snapjaws.SnapjawFactory;
import game.assets.junior.Junior;
import game.assets.map.MapFactory;
import game.assets.map.hangers.Vine;
import game.assets.map.platforms.Land;
import game.assets.map.platforms.Trunk;
import game.player.Player;
import utils.Constants;
import utils.DataTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class Game implements Constants, DataTypes {

    private final Player player;
    private final MapFactory MF;
    private final FruitFactory FF;
    private final SnapjawFactory SF;
    private final List<Vine> vines;
    private final List<Land> lands;
    private final List<Trunk> trunks;
    private final List<Fruit> fruits;
    private final List<Snapjaw> snapjaws;
    private final Junior junior;


    public Game(Player player) {
        this.player = player;
        this.MF = new MapFactory();
        this.FF = new FruitFactory();
        this.SF = new SnapjawFactory();
        this.vines = new ArrayList<>();
        this.lands = new ArrayList<>();
        this.trunks = new ArrayList<>();
        this.fruits = new ArrayList<>();
        this.snapjaws = new ArrayList<>();
        this.junior = new Junior(JUNIOR_RECT);
        newGame();
    }

    private void newGame() {
        System.out.print(NOTIFICATION_EMOJI + this.player.getUsername() + GORILLA_EMOJI + "LOADING .");
        generateVines();
        generateLands();
        generateTrunks();
        System.out.print(BANANA_EMOJI + ".");
        generateFruits();
        System.out.print(BANANA_EMOJI + ".");
        generateSnapjaws();
        System.out.println(BANANA_EMOJI + ".");
    }

    private void generateVines() {
        for (int v = 0; v < VINE_MAX; v++) {
            this.vines.add(MF.generateVine());
        }
    }

    private void generateLands() {
        for (int v = 0; v < LAND_MAX; v++) {
            this.lands.add(MF.generateLand());
        }
    }

    private void generateTrunks() {
        for (int v = 0; v < TRUNK_MAX; v++) {
            this.trunks.add(MF.generateTrunk());
        }
    }

    private void generateFruits() {
        try {
            for (int f = 0; f < FRUIT_MAX; f++) {
                this.fruits.add(this.FF.generateFruit());
                TimeUnit.MILLISECONDS.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void generateSnapjaws() {
        try {
            for (int s = 0; s < SNAPJAW_MAX; s++) {
                this.snapjaws.add(this.SF.generateSnapjaw());
                TimeUnit.MILLISECONDS.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
