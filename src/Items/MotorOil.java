package Items;

import gfx.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;

public class MotorOil extends ExtraPoints {

    public MotorOil(int xCoord, int yCoord) {
        super(xCoord, yCoord, Assets.motorOil);
        this.setHealthPoints(100);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage((Assets.motorOil), this.getxCoord(), this.getyCoord(), null);
    }
}
