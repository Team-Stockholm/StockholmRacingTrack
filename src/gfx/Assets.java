package gfx;


import java.awt.image.BufferedImage;
import java.io.File;

public class Assets {

    public static BufferedImage background;
    public static BufferedImage player;
    public static BufferedImage opponentCar;
    public static BufferedImage opponentTruck;
    public static BufferedImage motorOil;

    public static void init(){
        background = ImageLoader.loadImage("/Background.png");
        player = ImageLoader.loadImage("/player.png");
        opponentCar = ImageLoader.loadImage("/enemy car.png");
        opponentTruck = ImageLoader.loadImage("/enemy bus.png");
        motorOil = ImageLoader.loadImage("/oil.png");
    }
}
