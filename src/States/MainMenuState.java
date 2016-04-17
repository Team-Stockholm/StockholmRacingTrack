package States;


import gfx.Assets;

import java.awt.*;

public class MainMenuState extends State{
    public MainMenuState(){

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage((Assets.startScreen), 0,0, null);
    }
}
