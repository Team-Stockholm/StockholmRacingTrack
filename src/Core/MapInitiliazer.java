package Core;

import Items.*;
import Vehicles.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapInitiliazer {
    private static Random Rand = new Random();
    private final int NUMBER_OF_VEHICLES = 5;
    private final int NUMBER_OF_ITEMS = 5;
    private final int[] coordinates = {243, 315, 387, 455, 525};
    private int step = 0;

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
            int xIndex = Rand.nextInt(5);
            int currentXCoord = coordinates[xIndex];

            for (GameObject object:entities) {
                if (object.getxCoord() == currentXCoord){
                    xIndex = Rand.nextInt(5);
                    currentXCoord = coordinates[xIndex];
                    break;
                }
            }

            step += i * 20;
            int currentYCoord =(0 + i * 10) - step;
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

        Item vehicle = null;
        for (int i = 0; i <= NUMBER_OF_ITEMS; i++)
        {
            int xIndex = Rand.nextInt(5);
            int currentXCoord = coordinates[xIndex];

            for (GameObject object:entities) {
                if (object.getxCoord() == currentXCoord){
                    xIndex = Rand.nextInt(5);
                    currentXCoord = coordinates[xIndex];
                    break;
                }
            }
            step += i * 15;
            int currentYCoord = (0 + i * 5) - step;
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
