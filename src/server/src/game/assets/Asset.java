package game.assets;

import utils.Constants;
import utils.DataTypes;

public abstract class Asset implements Constants, DataTypes {

    protected String id;

    protected Boolean visible;

    protected Integer rectX;
    protected Integer rectY;
    protected Integer rectW;
    protected Integer rectH;

    protected String sprite;

    public Asset(Integer[] rect, String sprite) {
        this.id = this.getClass().getSimpleName();
        this.visible = true;
        this.rectX = rect[0];
        this.rectY = rect[1];
        this.rectW = rect[2];
        this.rectH = rect[3];
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

    public Integer getX() {
        return this.rectX;
    }

    public Integer getY() {
        return this.rectY;
    }

    public Integer[] getPosition() {
        return new Integer[]{this.rectX, this.rectY};
    }

    public void setPosition(Integer x, Integer y) {
        this.rectX = x;
        this.rectY = y;
    }

    public Integer getW() {
        return this.rectW;
    }

    public Integer getH() {
        return this.rectH;
    }

    public Integer[] getSize() {
        return new Integer[]{this.rectW, this.rectH};
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }
}
