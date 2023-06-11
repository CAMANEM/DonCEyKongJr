package game.assets.entities;

public abstract class EntityAbstractFactory {
    public abstract Entity getEntity(String entity, Integer score);
}
