package Items;

import Vehicles.GameObject;

import java.awt.image.BufferedImage;

public abstract class Obstacle extends Item {
    private int damage;

    public Obstacle(int xCoord, int yCoord, BufferedImage image) {
        super(xCoord, yCoord, image);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
