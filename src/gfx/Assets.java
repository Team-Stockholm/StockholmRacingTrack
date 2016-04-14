package gfx;


import java.awt.image.BufferedImage;
import java.io.File;

public class Assets {

    public static BufferedImage background;
    public static BufferedImage player;
    public static BufferedImage opponentCar;
    public static BufferedImage opponentTruck;
    public static BufferedImage motorOil;
    public static BufferedImage lives;
    public static BufferedImage opponentMotorcycle;
    public static BufferedImage gas;
    public static BufferedImage sewerShaft;
    public static BufferedImage wrench;
    public static BufferedImage startScreen;
    public static BufferedImage logo;
    public static BufferedImage titleLives;
    public static BufferedImage titleScores;

    public static void init(){
        background = ImageLoader.loadImage("/BackgroundCorr.png");
        player = ImageLoader.loadImage("/player.png");
        opponentCar = ImageLoader.loadImage("/enemy car.png");
        opponentTruck = ImageLoader.loadImage("/enemy bus.png");
        motorOil = ImageLoader.loadImage("/oil.png");
        lives = ImageLoader.loadImage("/lives.png");
        opponentMotorcycle = ImageLoader.loadImage("/enemy moto.png");
        gas = ImageLoader.loadImage("/gasoline.png");
        sewerShaft = ImageLoader.loadImage("/shaft.png");
        wrench = ImageLoader.loadImage("/wrench.png");
        startScreen = ImageLoader.loadImage("/startScreen.png");
        logo = ImageLoader.loadImage("/logoLeft.png");
        titleLives = ImageLoader.loadImage("/titleLives.png");
        titleScores = ImageLoader.loadImage("/titleScores.png");
    }
}
