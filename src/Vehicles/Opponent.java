package Vehicles;

public class Opponent extends Vehicle{
    public int getDamageCaused() {
        return damageCaused;
    }

    public void setDamageCaused(int damageCaused) {
        this.damageCaused = damageCaused;
    }

    private int damageCaused;
}
