public class Player {
    int coordinateY;
    int coordinateX;
    Direction direction;

    public Player(int worldHeight, int worldWidth) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
        this.direction = Direction.UP;
    }

    public static int generateRandomCoordinate(int worldSize) {

        return (int) (Math.random()*(worldSize-2))+1;
    }

    public  void movePlayer(String input, int worldHeight, int worldWidth) {
        switch (input) {
            case "a":
                direction = Direction.LEFT;
                break;
            case "s":
                direction = Direction.DOWN;
                break;
            case "d":
                direction = Direction.RIGHT;
                break;
            case "w":
                direction = Direction.UP;
                break;
        }
        switch (direction) {
            case LEFT:
                if (coordinateX > 1) {
                    coordinateX--;
                }
                break;
            case DOWN:
                if ( coordinateY < worldHeight-2) {
                    coordinateY++;
                }
                break;
            case RIGHT:
                if (coordinateX < worldWidth-2) {
                    coordinateX++;
                }
                break;
            case UP:
                if ( coordinateY > 1) {
                    coordinateY--;
                }
                break;
        }

//            if (direction == Direction.LEFT) {
//                playerCoordinateX--;
//            } else if (direction == Direction.DOWN){
//                playerCoordinateY--;
//            } else if (direction == Direction.RIGHT) {
//                playerCoordinateX--;
//            } else if (direction == Direction.UP) {
//                playerCoordinateY--;
//            }
    }

}
//Mille pärast luuakse klasse?
//tellimused, kasutaja loomine, ühe toote tarvis, kategooria