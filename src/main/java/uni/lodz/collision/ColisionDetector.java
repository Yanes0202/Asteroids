package uni.lodz.collision;

import uni.lodz.objects.GameObject;

import java.util.List;

public class ColisionDetector {

    public void detectCollision(List<GameObject> gameObjects) {
        List<GameObject> visibleObjects = gameObjects.stream().filter(GameObject::isVisible).toList();
        if (!visibleObjects.size()==1) {

        }
    }
}
