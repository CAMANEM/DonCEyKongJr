package game.assets.map.platforms;

public final class Land extends Platform {

    public Land(Integer id) {
        super(id, LAND_RECT[id - 1], LAND_SPRITE);
    }
}
