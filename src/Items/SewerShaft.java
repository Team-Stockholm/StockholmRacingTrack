package Items;

import java.awt.*;

public class SewerShaft extends Obstacle {
    private int xCoordinate;
    private int yCoordinate;
    private int damage;

    public SewerShaft(int xCoord, int yCoord) {
        super(xCoord, yCoord);
        this.damage = 75;
    }

    @Override
    public void render(Graphics graphics) {

    }
}
