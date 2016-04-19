package Items;

import States.GameState;
import Vehicles.GameObject;
import gfx.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Item extends GameObject{
        private BufferedImage image;

        public Item(int xCoordinate, int yCoordinate, BufferedImage image) {
            super(xCoordinate, yCoordinate, image);

            this.setColliderBox(new Rectangle(this.getxCoord(), this.getyCoord(), image.getWidth(), image.getHeight()));
            setExists(true);
            this.image = image;
        }

    public void update(){
        this.setyCoord(this.getyCoord() + 5);
        this.getColliderBox().setBounds(this.getxCoord(), this.getyCoord(), image.getWidth(),image.getHeight());
        if (this.getyCoord() > 800){
            this.setExists(false);
        }
    }
}