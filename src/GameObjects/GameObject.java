package GameObjects;

import Interfaces.Collidable;
import Interfaces.Drawable;
import Interfaces.Updatable;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class GameObject implements Updatable, Drawable{
    private int xCoord;
    private int yCoord;
    private Rectangle colliderBox;
    private BufferedImage image;
    private boolean exists;

    public GameObject(int xCoord, int yCoord, BufferedImage image){
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.colliderBox = new Rectangle(this.getxCoord(), this.getyCoord(), image.getWidth(), image.getHeight());
        this.exists = true;
        this.image = image;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public boolean exists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public Rectangle getColliderBox() {
        return this.colliderBox;
    }

    public void setColliderBox(Rectangle colliderBox) {
        this.colliderBox = colliderBox;
    }

    public abstract void render(Graphics graphics);

    public abstract void update();
}
