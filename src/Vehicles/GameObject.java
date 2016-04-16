package Vehicles;

import Interfaces.Collidable;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class GameObject implements Collidable {
    private int xCoord;
    private int yCoord;
    private Rectangle colliderBox;

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    private boolean exists;

    public GameObject(int xCoord, int yCoord, BufferedImage image){
        setyCoord(yCoord);
        setxCoord(xCoord);
        this.colliderBox = new Rectangle(this.getxCoord(), this.getyCoord(), image.getWidth(), image.getHeight());
        setExists(true);
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

    public abstract void render(Graphics graphics);

    public Rectangle getColliderBox() {
        return this.colliderBox;
    }

    public void setColliderBox(Rectangle colliderBox) {
        this.colliderBox = colliderBox;
    }
}
