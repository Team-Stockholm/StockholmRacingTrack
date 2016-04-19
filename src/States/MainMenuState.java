package States;


import gfx.*;
import gfx.Button;

import java.awt.*;


public class MainMenuState extends State{

    public static Button newGameButton = new Button(600, 330);
    public static Button bestButton = new Button(600, 400);
    public static Button exitButton = new Button(600, 400);

    public MainMenuState(){
        newGameButton.getColliderBox().setBounds(600, 330, 180, 30);
        bestButton.getColliderBox().setBounds(600,400, 180, 30);
        exitButton.getColliderBox().setBounds(600,470, 160, 30);
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage((Assets.startScreen), 0,0, null);
        g.drawImage(Assets.newGameButton, 600, 330, null);
        g.drawImage(Assets.bestsButton, 600, 400, null);
        g.drawImage(Assets.exitButton, 600, 470, null);
    }
}
