package GameObjects.Items;

import gfx.Assets;

import java.awt.*;

public class Wrench extends ExtraPoints {

    public Wrench(int xCoord, int yCoord) {
        super(xCoord, yCoord, Assets.wrench);
        this.setHealthPoints(50);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage((Assets.wrench), this.getxCoord(), this.getyCoord(), null);
    }
}
