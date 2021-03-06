package GameObjects.Vehicles;

import java.awt.image.BufferedImage;

public abstract class Opponent extends Vehicle{

    public Opponent(int xCoord, int yCoord, BufferedImage image) {
        super(xCoord, yCoord, image);
    }

    public void update(){
        this.setyCoord(this.getyCoord() + 5);
        this.getColliderBox().setBounds(this.getxCoord(), this.getyCoord(), this.getImage().getWidth(),this.getImage().getHeight());
        if (this.getyCoord() > 800){
            setExists(false);
        }
    }
}
