package Vehicles;

import Core.GameEngine;
import gfx.Assets;
import org.omg.CORBA.Environment;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PlayerCar extends Vehicle {
    private final int INITIAL_NUMBER_OF_LIVES = 3;

    private String name;
    private int pointsCollected;
    private int velocityX;
    private int numberOfLives;
    public static boolean isMovingLeft;
    public static boolean isMovingRight;

    public PlayerCar(String name, int xCoord, int yCoord){
        super(xCoord, yCoord, Assets.player);
        this.name = name;
        this.velocityX = 5;
        this.numberOfLives = INITIAL_NUMBER_OF_LIVES;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointsCollected(){
        return this.pointsCollected;
    }

    public void setPointsCollected(int pointsCollected){this.pointsCollected = pointsCollected;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    @Override
    public void update() {
        this.getColliderBox().setBounds(this.getxCoord(), this.getyCoord(), this.getImage().getWidth(), this.getImage().getHeight());
        if (isMovingLeft && this.getxCoord() >= 225) {
            this.setxCoord(this.getxCoord() - this.velocityX);
        }else if (isMovingRight && this.getxCoord() <= 540) {
            this.setxCoord(this.getxCoord() + this.velocityX);
        }

        if (this.getNumberOfLives() <= 0){
            this.setExists(false);
        }

        if (this.getPointsCollected() < 0){
            this.setPointsCollected(0);
        }
    }

    public void render(Graphics graphics) {
        graphics.drawImage((Assets.player), this.getxCoord(), this.getyCoord(), null);
    }
}

