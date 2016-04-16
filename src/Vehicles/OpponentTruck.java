package Vehicles;

import gfx.Assets;

import java.awt.*;

public class OpponentTruck extends Opponent{
    public OpponentTruck(int xCoord, int yCoord) {
        super(xCoord, yCoord, Assets.opponentCar);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage((Assets.opponentTruck), this.getxCoord(), this.getyCoord(), null);
    }
}
