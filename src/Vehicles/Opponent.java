package Vehicles;

import Core.GameEngine;
import States.GameState;
import gfx.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Opponent extends Vehicle{
    private int damageCaused;
    private BufferedImage image;

    public Opponent(int xCoord, int yCoord, BufferedImage image){
        super(xCoord, yCoord, image);
    }

    public int getDamageCaused() {
        return damageCaused;
    }

    public void setDamageCaused(int damageCaused) {
        this.damageCaused = damageCaused;
    }

    public void update(){
        this.setyCoord(this.getyCoord() + 10);
        this.getRectangle().setBounds(this.getxCoord(), this.getyCoord(), Assets.opponentTruck.getWidth(),
                Assets.opponentTruck.getHeight());

       // if (this.collide(GameState.player.getColliderBox())) {
           // GameState.player.setCurrentBonus(this);
           // GameState.bonusList.remove(this);
      //  }
    }
}
