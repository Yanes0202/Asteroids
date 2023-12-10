package uni.lodz.objects;

public class Map {
    public String[][] map;

    public Map(int maxX, int maxY) {
        this.map = new String[maxX][maxY];
    }
}
