package Items;

import java.awt.*;

public class Gas extends ExtraPoints {
    private int xCoordinate;
    private int yCoordinate;
    private int healthPoints;

    public Gas(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate);
        this.healthPoints = 50;
    }

    @Override
    public void render(Graphics graphics) {

    }
}
