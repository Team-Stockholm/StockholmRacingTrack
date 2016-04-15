package States;


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

    public GameState(){
        init();
        player = new PlayerCar("player", 31, 62, 385, 450);
        map = new MapInitiliazer();
        this.entities = map.PopulateMap();
    }

    private void init(){
        Assets.init();
    }

    @Override
    public void tick() {

        player.tick();
        List<GameObject> vehicles = this.entities.stream().filter(i->i instanceof Opponent).collect(Collectors.toList());
        List<GameObject> items = this.entities.stream().filter(i->i instanceof ExtraPoints).collect(Collectors.toList());
        if (vehicles.size() == 0)        {
            map.generateEnemies(this.entities);
        }
        if (items.size() == 0){
            map.generateItems(this.entities);
        }

        for (GameObject vehicle : this.entities) {
            vehicle.setyCoord(vehicle.getyCoord() + 3);
        }

        if (entities.stream().allMatch(y->y.getyCoord() > 800)){
            entities.clear();
        }

    }

    @Override
    public void render(Graphics graphics) {
        player.render(graphics);

        for (GameObject vehicle : this.entities) {
            vehicle.render(graphics);
        }
    }
}
