package Vehicles;

import gfx.Assets;

import java.awt.*;

public class OpponentCar extends Opponent{

    public OpponentCar(int xCoord, int yCoord) {
        super(xCoord,yCoord);
    }

    public void render(Graphics graphics) {
        graphics.drawImage((Assets.opponentCar), this.getxCoord(), this.getyCoord(), null);
    }
}
