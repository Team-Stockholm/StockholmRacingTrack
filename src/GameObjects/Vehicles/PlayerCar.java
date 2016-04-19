package GameObjects.Vehicles;

import gfx.Assets;

import java.awt.*;

public class PlayerCar extends Vehicle {
    private final int INITIAL_NUMBER_OF_LIVES = 3;

    private String name;
    private int pointsCollected;
    private int velocityX;
    private int numberOfLives;
    public static boolean isMovingLeft;
    public static boolean isMovingRight;

    private int count;

    public PlayerCar(String name, int xCoord, int yCoord){
        super(xCoord, yCoord, Assets.player);
        this.name = name;
        this.velocityX = 5;
        this.numberOfLives = INITIAL_NUMBER_OF_LIVES;
        this.setCount(500);
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

    public void setPointsCollected(int pointsCollected){this.pointsCollected = pointsCollected;}

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
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

        if (this.getPointsCollected() != 0){
            if (this.getPointsCollected() / this.getCount() >= 1){
                if (this.getNumberOfLives() < 3){
                    this.setNumberOfLives(this.getNumberOfLives() + 1);
                }
                this.setCount(this.getCount() + 500);
            }
        }

    }

    public void render(Graphics graphics) {
        graphics.drawImage((Assets.player), this.getxCoord(), this.getyCoord(), null);
    }
}

