package uni.lodz.objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Position {
    private int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
