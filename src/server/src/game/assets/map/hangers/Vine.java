package game.assets.map.hangers;

public final class Vine extends Hanger {

    public Vine(Integer id) {
        super(id, VINES_RECT[id - 1], VINE_SPRITE);
    }
}
