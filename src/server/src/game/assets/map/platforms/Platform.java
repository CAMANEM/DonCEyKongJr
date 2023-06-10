package game.assets.map.platforms;

import game.assets.Asset;

public abstract class Platform extends Asset {

    public Platform(Integer posX, Integer posY, String sprite) {
        super(posX, posY, sprite);
    }
}
