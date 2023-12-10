package uni.lodz;

import uni.lodz.collision.ColisionDetector;
import uni.lodz.objects.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    public static void main(String[] args) {
        int time = 0;
        Map map = new Map(100, 100);
        Position starshipPosition = new Position(0,50);
        Position asteroidPosition = new Position(100, 50);

        List<GameObject> gameObjects = new ArrayList<>();
        Starship starship = new Starship(starshipPosition);
        gameObjects.add(starship);
        ColisionDetector colisionDetector = new ColisionDetector();


        while (!starship.isVisible()) {
            map.map[starship.getPosition().getX()][starship.getPosition().getY()] = "S";

            Random random = new Random();
            int randomPosition = random.nextInt(100) + 1;
            asteroidPosition.setY(randomPosition);
            long randomTime = random.nextLong(time + 20) + 1;
            Asteroid asteroid = new Asteroid(asteroidPosition);
            if (time == randomTime) {
                asteroid.setVisible();
            }
            if (asteroid.isVisible()){
                map.map[asteroid.getPosition().getX()][asteroid.getPosition().getY()] = "A";
                asteroid.moveLeft();
            }

            Rocket rocket = new Rocket(starship.getPosition());
            if (starship.shoot()) {
                rocket.setVisible();
            }
            if (rocket.isVisible()) {
                map.map[rocket.getPosition().getX()][rocket.getPosition().getY()] = "A";
                rocket.moveRight();
            }

            colisionDetector.detectCollision(gameObjects);
        }
    }
}