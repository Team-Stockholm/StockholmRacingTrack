package Vehicles;

import Core.GameEngine;
import gfx.Assets;

import java.awt.*;

public class PlayerCar extends Vehicle {
    private final int INITIAL_NUMBER_OF_LIVES = 3;

    private String name;
    private int pointsCollected;
    private int numberOfCollisions;

    private int width, height;
    private int x, y;
    private int velocityX;

    private int numberOfLives;

    private Rectangle boundingBox;

    public static boolean isMovingLeft;
    public static boolean isMovingRight;

    private Rectangle playerPosition;

    public PlayerCar(String name, int width, int height, int xCoord, int yCoord){
        super(xCoord, yCoord);
        this.name = name;
        this.width = width;
        this.height = height;
        setxCoord(xCoord);
        setyCoord(yCoord);
        this.x = x;
        this.y = y;
        this.velocityX = 5;
        this.numberOfLives = INITIAL_NUMBER_OF_LIVES;

        this.boundingBox = new Rectangle(x, y, width, height);

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
        this.boundingBox.setBounds(this.x, this.y, this.width, this.height);

        if (isMovingLeft) {
            this.x -= this.velocityX;
        }else if (isMovingRight) {
            this.x += this.velocityX;
        }
    }

    public void render(Graphics graphics) {
        graphics.drawImage((Assets.player), this.getxCoord(), this.getyCoord(), null);
    }

    public boolean Intersects(Rectangle rectangle) {
        if(this.playerPosition.contains(rectangle) || rectangle.contains(this.playerPosition)) {
            return true;
        }
        return false;
    }
}

