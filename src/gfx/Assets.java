package gfx;


import java.awt.image.BufferedImage;
import java.io.File;

public class Assets {

    public static BufferedImage background;
    public static BufferedImage player;

    public static void init(){
        background = ImageLoader.loadImage("/Background.png");
        player = ImageLoader.loadImage("/player.png");
    }
}
