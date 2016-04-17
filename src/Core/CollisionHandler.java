package Core;

import Interfaces.Collidable;
import Items.ExtraPoints;
import Items.Item;
import Items.Obstacle;
import Vehicles.GameObject;
import Vehicles.Opponent;
import Vehicles.PlayerCar;

import java.util.List;

public class CollisionHandler {
    public void handleCollisions(PlayerCar player, List<GameObject> entities)
    {
        for(GameObject entity : entities)
        {
            if (player.getColliderBox().intersects(entity.getColliderBox()))
            {
                entity.setExists(false);
                if (entity instanceof Item)
                {
                    if (entity instanceof ExtraPoints)
                    {
                        player.setPointsCollected(player.getPointsCollected() + ((ExtraPoints) entity).getHealthPoints());
                    }
                    else if (entity instanceof Obstacle)
                    {
                        player.setPointsCollected(player.getPointsCollected() - ((Obstacle) entity).getDamage());
                    }
                }
                else if (entity instanceof Opponent)
                {
                    player.setNumberOfLives(player.getNumberOfLives() - 1);
                }
            }
        }
    }
}
