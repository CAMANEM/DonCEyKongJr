package game.assets.map.platforms;

public final class Trunk extends Platform {

    public Trunk(Integer id) {
        super(id, TRUNK_RECT[id - 1], TRUNK_SPRITE);
    }
}
