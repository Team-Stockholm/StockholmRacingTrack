package Core;

        import gfx.SpriteSheet;
        import Vehicles.PlayerCar;

        import java.awt.*;
        import java.awt.image.BufferStrategy;
        import java.awt.image.BufferedImage;

public class GameEngine implements Runnable{
    public int width, height;
    public String title;

    private boolean running = false;
    private Thread thread;

    private BufferStrategy bufferStrategy;
    private Graphics graphics;

    private BufferedImage image;
    private SpriteSheet spriteSheet;

    //Player
    public static PlayerCar player;
    public static Rectangle enemy;

    public GameEngine(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
    }

    //Initializes all the graphics and it will get
    //everything ready for our game
    private void init() {
    }


    //The method that will update all the variables
    private void update() {

    }

    //The method that will draw everything on the canvas
    private void render() {

    }

    //Implementing the interface's method
    @Override
    public void run() {
        init();

        int fps = 30;
        double timePerTick = 1_000_000_000.0 / fps;
        double delta = 0;

        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;

        while (running) {
            now = System.nanoTime();
            delta += (now-lastTime) / timePerTick;
            timer += now - lastTime;
            lastTime = now;

            if (delta >= 1) {
                this.update();
                this.render();

                ticks++;
                delta--;
            }

            if (timer >= 1_000_000_000) {
                System.out.println("Ticks and Frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }

        stop();
    }


    public synchronized void start() {
        if(running) {
            return;
        }

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        if(!running) {
            return;
        }
        running = false;

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



