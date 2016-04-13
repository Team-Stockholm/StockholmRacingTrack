package Items;

import gfx.Assets;

import java.awt.*;

public class SewerShaft extends Obstacle {
    private int xCoord;
    private int yCoord;
    private int damage;

    public SewerShaft(int xCoord, int yCoord) {
        super(xCoord, yCoord);
        this.damage = 75;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage((Assets.sewerShaft), this.getxCoord(), this.getyCoord(), null);
    }
}
