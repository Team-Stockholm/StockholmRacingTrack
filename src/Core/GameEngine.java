package Core;

        import Display.Display;
        import States.GameState;
        import States.MainMenuState;
        import States.StateManager;
        import events.KeybordInput;
        import events.MouseInput;

        import java.awt.*;
        import java.awt.image.BufferStrategy;


public class GameEngine implements Runnable{


    public String title;

    private Display display;
    private BufferStrategy bufferStrategy;
    private Graphics graphics;
    private MapInitiliazer mapInitiliazer;

    private Thread thread;
    private boolean isRunning;

    private GameState gameState;
    private MainMenuState mainMenuState;
    private KeybordInput keybordInput;
    private MouseInput mouseInput;

    public GameEngine() {
        this.title = title;
    }

    //Initializes all the graphics and it will get
    //everything ready for our game
    private void init() {
        this.display = new Display("Stockholm Racing track");
        this.keybordInput = new KeybordInput(this.display);
        this.mouseInput = new MouseInput(this.display);

        gameState = new GameState();
        mainMenuState = new MainMenuState();
        StateManager.setCurrentState(mainMenuState);
        mapInitiliazer = new MapInitiliazer();
    }


    //The method that will update all the variables
    private void update() {
        if (StateManager.getCurrentState() != null){
            StateManager.getCurrentState().update();
        }
    }

    //The method that will draw everything on the canvas
    private void render() {
        this.bufferStrategy = this.display.getCanvas().getBufferStrategy();

        if (this.bufferStrategy == null){
            this.display.getCanvas().createBufferStrategy(2);
            return;
        }

        this.graphics = this.bufferStrategy.getDrawGraphics();

        graphics.clearRect(0, 0, Display.WIDTH, Display.HEIGHT);

        if (StateManager.getCurrentState() != null){
            StateManager.getCurrentState().render(graphics);
        }
        //end drawing
        this.graphics.dispose();
        this.bufferStrategy.show();
    }

    //Implementing the interface's method
    @Override
    public void run() {
        this.init();

        int fps = 30;
        double timePerTick = 1_000_000_000.0 / fps;
        double delta = 0;

        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;

        while (isRunning) {
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
        if (!isRunning){
            this.thread = new Thread(this);
            this.isRunning = true;
            this.thread.start();
        }
    }

    public synchronized void stop() {
        if (isRunning){
            try {
                this.isRunning = false;
                this.thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



