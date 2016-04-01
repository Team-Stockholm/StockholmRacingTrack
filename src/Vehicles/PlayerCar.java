package Vehicles;

public class PlayerCar extends Vehicle {
    private String name;
    private int pointsCollected;
    private int numberOfCollisions;

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
}
