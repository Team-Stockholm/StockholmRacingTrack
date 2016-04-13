package Items;

import gfx.Assets;

import java.awt.*;

public class MotorOil extends ExtraPoints {
    private int healthPoints;

    public MotorOil(int xCoord, int yCoord) {
        super(xCoord, yCoord);
        this.healthPoints = 100;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage((Assets.motorOil), this.getxCoord(), this.getyCoord(), null);
    }
}
