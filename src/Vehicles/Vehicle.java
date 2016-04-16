package Vehicles;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Vehicle extends GameObject {
    private Rectangle rectangle;

    public Vehicle(int xCoord, int yCoord, BufferedImage image) {
        super(xCoord, yCoord, image);
    }

    public Rectangle getRectangle(){
      return rectangle;
   }

    public void setRectangle(Rectangle rectangle){
        this.rectangle = rectangle;
  }

   public void render(Graphics graphics){

   }
}
