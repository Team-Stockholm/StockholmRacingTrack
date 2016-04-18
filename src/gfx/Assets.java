package gfx;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
    public static BufferedImage gameOverBackground;
    public static BufferedImage scoreBackground;
    public static String path;

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
        gameOverBackground = ImageLoader.loadImage("/gameOver.png");
        scoreBackground = ImageLoader.loadImage("/bestEver.png");
        path = "/score.txt";

        try {
            GraphicsEnvironment ge =
                    GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("/HELEN BG THIN ITALIC_0.OTF")));
        } catch (IOException |FontFormatException e) {

        }

    //Handle exception
    }
}
