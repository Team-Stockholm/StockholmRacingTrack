package Vehicles;

import java.awt.*;


public class Vehicle extends GameObject {
    private Rectangle rectangle;

    public Vehicle(int xCoord, int yCoord) {
        super(xCoord, yCoord);
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
