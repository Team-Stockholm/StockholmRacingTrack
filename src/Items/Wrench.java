package Items;

import gfx.Assets;

import java.awt.*;

public class Wrench extends ExtraPoints{
    private int xCoord;
    private int yCoord;
    private int healthPoints;

    public Wrench(int xCoord, int yCoord) {
        super(xCoord, yCoord, Assets.wrench);
        this.healthPoints = 50;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage((Assets.wrench), this.getxCoord(), this.getyCoord(), null);
    }
}
