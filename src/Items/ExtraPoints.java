package Items;

import Vehicles.GameObject;

public abstract class ExtraPoints extends GameObject {
    private int xCoordinate;
    private int yCoordinate;
    private int healthPoints;

    public ExtraPoints(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate);
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
