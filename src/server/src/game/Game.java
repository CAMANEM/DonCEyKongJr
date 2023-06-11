package game;

import game.assets.entities.fruits.Fruit;
import game.assets.entities.fruits.FruitFactory;
import game.assets.entities.snapjaws.Snapjaw;
import game.assets.entities.snapjaws.SnapjawFactory;
import game.assets.junior.Junior;
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

    private Player player;
    private Junior junior;
    private List<Fruit> fruits;
    private List<Snapjaw> snapjaws;
    private List<Land> lands;
    private List<Trunk> trunks;
    private List<Vine> vines;
    private FruitFactory FF;
    private SnapjawFactory SF;

    public Game(Player player) {
        this.player = player;
        this.junior = new Junior(JUNIOR_RECT);
        this.fruits = new ArrayList<>();
        this.snapjaws = new ArrayList<>();
        this.lands = new ArrayList<>();
        this.trunks = new ArrayList<>();
        this.vines = new ArrayList<>();
        this.FF = new FruitFactory();
        newGame();
    }

    private void newGame() {
        generateFruits();
        generateSnapjaws();
    }

    private void generateFruits() {
        try {
            for (int f = 0; f < FRUIT_MAX; f++) {
                this.fruits.add(FF.generateFruit());
                TimeUnit.MILLISECONDS.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void generateSnapjaws() {
        try {
            for (int f = 0; f < SNAPJAW_MAX; f++) {
                this.snapjaws.add(SF.generateSnapjaw());
                TimeUnit.MILLISECONDS.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
