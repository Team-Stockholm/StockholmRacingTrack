package Vehicles;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Vehicle extends GameObject {

    public Vehicle(int xCoord, int yCoord, BufferedImage image) {
        super(xCoord, yCoord, image);
    }
}
