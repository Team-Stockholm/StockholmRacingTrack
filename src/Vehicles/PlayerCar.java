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
    private int numberOfCollisions;

    private int width, height;

    private int velocityX;



    private int numberOfLives;

    public static boolean isMovingLeft;
    public static boolean isMovingRight;

    private Rectangle playerPosition;

    public PlayerCar(String name, int width, int height, int xCoord, int yCoord){
        super(xCoord, yCoord, Assets.player);
        this.name = name;
        this.width = width;
        this.height = height;
        this.velocityX = 5;
        this.numberOfLives = INITIAL_NUMBER_OF_LIVES;
    }

    public int getPointsCollected(){
        return this.pointsCollected;
    }

    public void setPointsCollected(int pointsCollected){
        this.pointsCollected = pointsCollected;
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
        if (isMovingLeft) {
            this.setxCoord(this.getxCoord() - this.velocityX);
        }else if (isMovingRight) {
            this.setxCoord(this.getxCoord() + this.velocityX);
        }

        if (this.getNumberOfLives() < 0){
            this.setExists(false);
        }
    }

    public void render(Graphics graphics) {
        graphics.drawImage((Assets.player), this.getxCoord(), this.getyCoord(), null);
    }
}

