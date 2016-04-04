package Vehicles;

import java.awt.*;

public class PlayerCar extends Vehicle {
    private final int INITIAL_NUMBER_OF_LIVES = 3;

    private String name;
    private int pointsCollected;
    private int numberOfCollisions;

    private int x, y;
    private int velocity;
    private int width, height;
    private int numberOfLives;

    private Rectangle boundingBox;

    public static boolean isGoingLeft;
    public static boolean isGoingRight;

    private Rectangle playerPosition;

    public PlayerCar(){
        // TODO: To be set correctly
        this.x = 200;
        this.y = 300;
        this.width = 95;
        this.height = 130;
        this.numberOfLives = INITIAL_NUMBER_OF_LIVES;
        this.velocity = 2;
        this.boundingBox = new Rectangle(this.width, this.height);

        isGoingLeft = false;
        isGoingRight = false;
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


    public void update() {
        //Update the bounding box's position
        this.playerPosition.setBounds(this.x, this.y, this.width, this.height);

        if(isGoingLeft) {
            this.x -= this.velocity;
        }
        if(isGoingRight) {
            this.x += this.velocity;
        }
    }


    public boolean Intersects(Rectangle rectangle) {
        if(this.playerPosition.contains(rectangle) || rectangle.contains(this.playerPosition)) {
            return true;
        }
        return false;
    }

    // TODO: Implement it correctly!
    public void render(Graphics g) {
       // g.drawImage(A.player1, this.x, this.y, null);
    }
}

