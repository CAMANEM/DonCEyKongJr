package game.global;

public interface DataTypes {

    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    enum JuniorState {
        IDLE,
        RUNNING,
        HANGING,
        WINNER
    }

    enum FruitState {
        IDLE,
        EATEN,
        FALLING
    }

    enum SnapjawState {
        IDLE,
        CHASING
    }

}
