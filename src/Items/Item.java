package Items;

import States.GameState;
import Vehicles.GameObject;
import gfx.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Item extends GameObject{
        private int xCoordinate;
        private int yCoordinate;

        public Item(int xCoordinate, int yCoordinate, BufferedImage image) {
         super(xCoordinate, yCoordinate, image);
        }

    public void update(){
        this.setyCoord(this.getyCoord() + 10);


    }
}