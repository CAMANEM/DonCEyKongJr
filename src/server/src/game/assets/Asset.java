package game.assets;

import global.Constants;
import global.DataTypes;

public abstract class Asset implements Constants, DataTypes {

    protected String id;

    protected Boolean visible;

    protected Integer[] position;

    protected String sprite;

    public Asset(Integer posX, Integer posY, String sprite) {
        this.id = this.getClass().getSimpleName();
        this.visible = true;
        this.position = new Integer[]{posX, posY};
        this.sprite = sprite;
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
