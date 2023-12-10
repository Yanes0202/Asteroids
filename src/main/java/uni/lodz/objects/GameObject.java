package uni.lodz.objects;

import lombok.Getter;

@Getter
public class GameObject {
    Position position;
    boolean visible;

    public GameObject(Position position) {
        this.position = position;
        this.visible = false;
    }

    public void moveRight() {
        position.setX(position.getX() + 1);
    }

    public void moveLeft() {
        position.setX(position.getX() - 1);
    }

    void moveUp() {
        position.setY(position.getY() + 1);
    }

    void moveDown() {
        position.setY(position.getY() - 1);
    }

    public void setVisible() {
        this.visible = true;
    }
}
