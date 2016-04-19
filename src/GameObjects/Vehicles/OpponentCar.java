package GameObjects.Vehicles;

import gfx.Assets;

import java.awt.*;

public class OpponentCar extends Opponent{

    public OpponentCar(int xCoord, int yCoord) {
        super(xCoord,yCoord, Assets.opponentCar);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage((Assets.opponentCar), this.getxCoord(), this.getyCoord(), null);
    }
}
