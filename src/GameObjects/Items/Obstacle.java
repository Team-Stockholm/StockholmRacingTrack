package GameObjects.Items;

import java.awt.image.BufferedImage;

public abstract class Obstacle extends Item {
    private int damage;

    public Obstacle(int xCoord, int yCoord, BufferedImage image) {
        super(xCoord, yCoord, image);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
