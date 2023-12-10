package uni.lodz.objects;

public class Starship extends GameObject{

    public Starship(Position position) {
        super(position);
        visible = true;
    }
    public boolean shoot() {
        return true;
    }

}
