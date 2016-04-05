package Items;

public abstract class ExtraPoints extends Item {
    private int xCoordinate;
    private int yCoordinate;
    private int healthPoints;

    public ExtraPoints(int xCoordinate, int yCoordinate, int healthPoints) {
        super(xCoordinate, yCoordinate);
        this.healthPoints = healthPoints;
    }

    @Override
    public int getxCoordinate() {
        return xCoordinate;
    }

    @Override
    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    @Override
    public int getyCoordinate() {
        return yCoordinate;
    }

    @Override
    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
