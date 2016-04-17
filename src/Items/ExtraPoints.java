package Items;

import Vehicles.GameObject;

import java.awt.image.BufferedImage;

public abstract class ExtraPoints extends Item {
    private int healthPoints;

    public ExtraPoints(int xCoord, int yCoord, BufferedImage image) {
        super(xCoord, yCoord, image);
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
