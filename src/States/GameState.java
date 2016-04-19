package States;


import Core.CollisionHandler;
import Core.MapInitiliazer;
import Items.ExtraPoints;
import Vehicles.GameObject;
import Vehicles.Opponent;
import Vehicles.PlayerCar;
import gfx.Assets;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class GameState extends State{
    public static PlayerCar player;
    private List<GameObject> entities;
    private MapInitiliazer map;
    private CollisionHandler collisionHandler;
    private int width = 800;
    private int height = 50;
    public int i = 23;

    public GameState(){
        init();
        player = new PlayerCar("player", 385, 450);
        map = new MapInitiliazer();
        this.entities = map.PopulateMap();
        this.collisionHandler = new CollisionHandler();
    }

    private void init(){
        Assets.init();
    }

    @Override
    public void tick() {
        i--;
        if (i <= 1){
            i = 23;
        }
        player.update();
        this.collisionHandler.handleCollisions(this.player, this.entities);
        List<GameObject> removed = entities.stream().filter(a-> !a.exists()).collect(Collectors.toList());
        this.entities.removeAll(removed);
        
        if (!this.player.exists()){
            StateManager.setCurrentState(new GameOverState());
        } else {
            map.generateEnemies(this.entities);
            map.generateItems(this.entities);

            for (GameObject vehicle : this.entities) {
                vehicle.update();
            }
        }
    }

    @Override
    public void render(Graphics graphics) {

        graphics.drawImage((Assets.background), 0, height - (height * i), null);
        graphics.drawImage((Assets.logo), 70, 150, null);
        graphics.drawImage((Assets.titleLives), 610, 500, null);
        graphics.drawImage((Assets.titleScores), 590, 400, null);
        player.render(graphics);

        for (GameObject vehicle : this.entities) {
            vehicle.render(graphics);
        }

        graphics.setFont(new Font("HELEN BG THIN ITALIC_0", Font.PLAIN, 30));
        graphics.setColor(Color.white);
        graphics.drawString(String.format("%d",this.player.getPointsCollected()), 615, 485);

        for (int i = 0; i < this.player.getNumberOfLives(); i++) {
            graphics.drawImage((Assets.lives), 705 + (i * 20), 514, null);
        }
    }
}
