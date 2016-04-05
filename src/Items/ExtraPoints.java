package Items;

public abstract class ExtraPoints extends Item {
    private int xCoordinate;
    private int yCoordinate;
    private int healthPoints;

    public ExtraPoints(int xCoordinate, int yCoordinate, int healthPoints) {
        super(xCoordinate, yCoordinate);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
