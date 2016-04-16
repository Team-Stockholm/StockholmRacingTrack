package Vehicles;

import Core.GameEngine;
import gfx.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PlayerCar extends Vehicle {
    private final int INITIAL_NUMBER_OF_LIVES = 3;

    private String name;
    private int pointsCollected;
    private int numberOfCollisions;

    private int width, height;
    private int x, y;
    private int velocityX;

    private int numberOfLives;
    private Rectangle colliderBox;

    public static boolean isMovingLeft;
    public static boolean isMovingRight;

    private Rectangle playerPosition;

    public PlayerCar(String name, int width, int height, int xCoord, int yCoord){
        super(xCoord, yCoord, Assets.player);
        this.name = name;
        this.width = width;
        this.height = height;
        setxCoord(xCoord);
        setyCoord(yCoord);
        this.velocityX = 5;
        this.numberOfLives = INITIAL_NUMBER_OF_LIVES;
        setExists(true);
        //this.boundingBox = new Rectangle(x, y, width, height);

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPointsCollected(){
        return this.pointsCollected;
    }

    public void setPointsCollected(int pointsCollected){
        this.pointsCollected = pointsCollected;
    }

    public int getNumberOfCollisions(){
        return this.numberOfCollisions;
    }

    public void setNumberOfCollisions(int numberOfCollisions){
        this.numberOfCollisions = numberOfCollisions;
    }


    public void tick() {
        //Update the bounding box's position
        //this.colliderBox.setBounds(this.getxCoord(), this.getyCoord(), this.width, this.height);

        if (isMovingLeft) {
            this.setxCoord(this.getxCoord() - this.velocityX);
        }else if (isMovingRight) {
            this.setxCoord(this.getxCoord() + this.velocityX);
        }

        if (this.getNumberOfCollisions() > 0){
            this.setExists(false);
        }
    }

    public void render(Graphics graphics) {
        graphics.drawImage((Assets.player), this.getxCoord(), this.getyCoord(), null);
    }

    public boolean intersects(Rectangle rectangle) {
        if(this.playerPosition.contains(rectangle) || rectangle.contains(this.playerPosition)) {
            return true;
        }
        return false;
    }
}

