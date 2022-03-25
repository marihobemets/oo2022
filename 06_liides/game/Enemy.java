package game;

public class Enemy extends Character implements WorldObject {

    //new enemy()
    public Enemy(int worldHeight, int worldWidth) {
        super(worldHeight,worldWidth);
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random() * (worldSize - 2)) + 1;
    }
}
