package GameObjects.Items;

import gfx.Assets;

import java.awt.*;

public class SewerShaft extends Obstacle {

    public SewerShaft(int xCoord, int yCoord) {
        super(xCoord, yCoord, Assets.sewerShaft);
        this.setDamage(75);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage((Assets.sewerShaft), this.getxCoord(), this.getyCoord(), null);
    }
}
