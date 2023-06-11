package game;

import game.assets.AssetFactoryProducer;
import game.assets.entities.EntityAbstractFactory;
import game.assets.entities.fruits.Fruit;
import game.assets.entities.snapjaws.Snapjaw;
import game.assets.junior.Junior;
import game.assets.map.hangers.Vine;
import game.assets.map.platforms.Land;
import game.assets.map.platforms.Trunk;
import game.player.Player;
import utils.Constants;
import utils.DataTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Game implements Constants, DataTypes {

    private Player player;
    private Junior junior;
    private List<Fruit> fruits;
    private List<Snapjaw> snapjaws;
    private List<Land> lands;
    private List<Trunk> trunks;
    private List<Vine> vines;

    private EntityAbstractFactory fruitFactory = AssetFactoryProducer.getEntityFactory("Fruit");
    private EntityAbstractFactory snapjawFactory = AssetFactoryProducer.getEntityFactory("Snapjaw");

    public Game(Player player) {
        this.player = player;
        this.junior = new Junior(JUNIOR_RECT);
        this.fruits = new ArrayList<>();
        this.snapjaws = new ArrayList<>();
        this.lands = new ArrayList<>();
        this.trunks = new ArrayList<>();
        this.vines = new ArrayList<>();
        newGame();
    }

    private void newGame() {
        generateFruits();
    }

    private void generateFruits() {
        for (int f = 0; f < FRUIT_MAX; f++) {
            Object fruit = FRUITS.keySet().toArray()[new Random().nextInt(FRUITS.keySet().toArray().length)];
            this.fruits.add((Fruit) fruitFactory.getEntity(fruit.toString(), FRUITS.get(fruit)));
        }
    }
}
