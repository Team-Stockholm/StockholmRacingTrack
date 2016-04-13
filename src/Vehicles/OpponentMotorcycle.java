package Vehicles;

import gfx.Assets;

import java.awt.*;

public class OpponentMotorcycle extends Opponent{
    public OpponentMotorcycle(int xCoord, int yCoord) {
        super(xCoord, yCoord);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage((Assets.opponentMotorcycle), this.getxCoord(), this.getyCoord(), null);
    }
}
