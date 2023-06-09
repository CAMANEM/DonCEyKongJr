package game.assets;

import game.global.Constants;
import game.global.DataTypes;

public abstract class Asset implements Constants, DataTypes {

    protected final String id;

    protected Boolean visible;

    protected Integer[] position;

    protected String sprite;

    public Asset(String id, Integer posX, Integer posY) {
        this.id = id;
        this.visible = true;
        this.position = new Integer[]{posX, posY};
    }

    public String getId() {
        return id;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Integer[] getPosition() {
        return position;
    }

    public void setPosition(Integer posX, Integer posY) {
        this.position[0] = posX;
        this.position[1] = posY;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }
}
