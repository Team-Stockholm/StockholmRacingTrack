package States;


import Vehicles.PlayerCar;
import gfx.Assets;

import java.awt.*;

public class GameState extends State{
    public static PlayerCar player;

    public GameState(){
        init();

       player = new PlayerCar("player", 31, 62, 330, 350);
    }

    private void init(){
        Assets.init();
    }

    @Override
    public void tick() {
        player.tick();
    }

    @Override
    public void render(Graphics graphics) {
        player.render(graphics);
    }
}
