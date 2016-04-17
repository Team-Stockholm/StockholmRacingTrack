package Core;

import Items.Gas;
import Items.MotorOil;
import Items.SewerShaft;
import Items.Wrench;
import Vehicles.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapInitiliazer {
    private static Random Rand = new Random();
    private final int NUMBER_OF_VEHICLES = 3;
    private final int NUMBER_OF_ITEMS = 2;
    private final int MAP_WIDTH = 575;
    private final int HEIGHT = 400;
    private final int MIN_LENGTH = 225;

    public List<GameObject> PopulateMap()
    {
        List<GameObject> entities = new ArrayList<>();

        generateItems(entities);
        generateEnemies(entities);

        return entities;
    }

    public void generateEnemies(List<GameObject> entities) {
        List<String> enemies= new ArrayList<>();
        enemies.add("OpponentCar");
        enemies.add("OpponentTruck");
        enemies.add("OpponentMotorcycle");

        Opponent vehicle = null;

        for (int i = 0; i <= NUMBER_OF_VEHICLES; i++)
        {
            int currentXCoord = Rand.nextInt(MAP_WIDTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int currentYCoord = Rand.nextInt(HEIGHT - MIN_LENGTH + 1) + MIN_LENGTH;

            int index = Rand.nextInt(enemies.size() - 0) + 0;

            switch (enemies.get(index)){
                case "OpponentCar": vehicle = new OpponentCar(currentXCoord, currentYCoord); break;
                case "OpponentTruck" : vehicle = new OpponentTruck(currentXCoord, currentYCoord); break;
                case "OpponentMotorcycle": vehicle = new OpponentMotorcycle(currentXCoord, currentYCoord); break;
            }

           entities.add(vehicle);
        }
    }

    public void generateItems(List<GameObject> entities) {

        List<String> items= new ArrayList<>();
        items.add("Gas");
        items.add("MotorOil");
        items.add("SewerShaft");
        items.add("Wrench");

        GameObject vehicle = null;
        for (int i = 0; i <= NUMBER_OF_ITEMS; i++)
        {
            int currentXCoord = Rand.nextInt(MAP_WIDTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int currentYCoord = Rand.nextInt(HEIGHT - MIN_LENGTH + 1) + MIN_LENGTH;

            int index = Rand.nextInt(items.size() - 0) + 0;

            switch (items.get(index)){
                case "Gas": vehicle = new Gas(currentXCoord, currentYCoord); break;
                case "MotorOil" : vehicle = new MotorOil(currentXCoord, currentYCoord); break;
                case "SewerShaft": vehicle = new SewerShaft(currentXCoord, currentYCoord); break;
                case "Wrench": vehicle = new Wrench(currentXCoord, currentYCoord); break;
            }

            entities.add(vehicle);
        }
    }
}
