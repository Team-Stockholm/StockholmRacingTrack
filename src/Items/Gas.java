package Items;

import gfx.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Gas extends ExtraPoints {
    private int xCoord;
    private int yCoord;
    private int healthPoints;

    public Gas(int xCoord, int yCoord) {
        super(xCoord, yCoord, Assets.gas);
        this.healthPoints = 50;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage((Assets.gas), this.getxCoord(), this.getyCoord(), null);
    }
}
