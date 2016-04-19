package GameObjects.Items;

import gfx.Assets;

import java.awt.*;

public class MotorOil extends ExtraPoints {

    public MotorOil(int xCoord, int yCoord) {
        super(xCoord, yCoord, Assets.motorOil);
        this.setHealthPoints(40);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage((Assets.motorOil), this.getxCoord(), this.getyCoord(), null);
    }
}
