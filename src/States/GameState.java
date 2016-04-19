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

    public GameState(){
        init();
        player = new PlayerCar("player", 31, 62, 385, 450);
        map = new MapInitiliazer();
        this.entities = map.PopulateMap();
        this.collisionHandler = new CollisionHandler();
    }

    private void init(){
        Assets.init();
    }

    @Override
    public void tick() {

        player.update();
        this.collisionHandler.handleCollisions(this.player, this.entities);
        List<GameObject> removed = entities.stream().filter(a-> !a.exists()).collect(Collectors.toList());
        this.entities.removeAll(removed);
        if (!this.player.exists()){
            StateManager.setCurrentState(new GameOverState());
        } else {
            List<GameObject> vehicles = this.entities.stream().filter(i->i instanceof Opponent).collect(Collectors.toList());
            List<GameObject> items = this.entities.stream().filter(i->i instanceof ExtraPoints).collect(Collectors.toList());
            if (vehicles.size() == 0)        {
                map.generateEnemies(this.entities);
            }
            if (items.size() == 0){
                map.generateItems(this.entities);
            }

            for (GameObject vehicle : this.entities) {
                vehicle.update();
            }

            if (entities.stream().allMatch(y->y.getyCoord() > 800)){
                entities.clear();
            }
        }
    }

    @Override
    public void render(Graphics graphics) {
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
