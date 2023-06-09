package game.global;

public interface DataTypes {

    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    enum FruitState {
        HANGING,
        EATEN,
        FALLING
    }

    enum SnapjawState {
        IDLE,
        ATTACKING
    }

}
