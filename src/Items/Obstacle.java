package Items;

public abstract class Obstacle extends Item{
    private int xCoordinate;
    private int yCoordinate;
    private int damage;

    public Obstacle(int xCoordinate, int yCoordinate, int damage) {
        super(xCoordinate, yCoordinate);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
    public  void setDamage(int damage) {
        this.damage = damage;
    }
}
