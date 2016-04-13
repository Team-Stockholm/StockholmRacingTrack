package Vehicles;

import java.awt.*;

public abstract class GameObject {
    private int xCoord;
    private int yCoord;

    public GameObject(int xCoord, int yCoord){
        setyCoord(yCoord);
        setxCoord(xCoord);
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
}
