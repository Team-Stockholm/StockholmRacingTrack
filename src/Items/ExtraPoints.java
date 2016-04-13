package Items;

import Vehicles.GameObject;

public abstract class ExtraPoints extends GameObject {
    private int xCoord;
    private int yCoord;
    private int healthPoints;

    public ExtraPoints(int xCoord, int yCoord) {
        super(xCoord, yCoord);
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
