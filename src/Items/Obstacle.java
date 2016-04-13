package Items;

import Vehicles.GameObject;

public abstract class Obstacle extends GameObject {
    private int damage;

    public Obstacle(int xCoord, int yCoord) {
        super(xCoord, yCoord);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
