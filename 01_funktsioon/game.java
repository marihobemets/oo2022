import java.util.Scanner;

public class game {
    //main
    public static void main(String[] args) {
        //sout
        System.out.println("Hello world!");
        //String - sõnaline muutuja
        //char - üks täht
        //double - 15kohaline komaarv
        //float - 7kohaline komaarv
        //int - täiskohaline nr 2.1mlj
        //byte - 32kohta
        //short - 256kohta
        //long - 9, 223, 372, 036, 854, 775, 807
        //boolean - kahendväärtus true//false
        int worldHeight = 5;
        int worldWidth = 10;
        int playerCoordinateY = generateRandomCoordinate(worldHeight);
        int playerCoordinateX = generateRandomCoordinate(worldWidth);
        int enemyCoordinateY = generateRandomCoordinate(worldHeight);
        int enemyCoordinateX = generateRandomCoordinate(worldWidth);

        printMap(worldHeight, worldWidth, playerCoordinateX, playerCoordinateY, enemyCoordinateY, enemyCoordinateX);

        //klasside tegemine
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //fori --> pakub'
        char symbol; //deklareerib 1x muutuja, mitte iga kord
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) { //andmebaasipäring || primitiiv
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                if(playerCoordinateY == y && playerCoordinateX == x) {
                    symbol = 'x';
                }
                if(enemyCoordinateY == y && enemyCoordinateX == x){
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
        //kontrollib ühte muutujat mingite väärtuste vastu
        while (!input.equals("end")) {
            switch (input) {
                case "a":
                    playerCoordinateX--;
                    break;
                case "s":
                    playerCoordinateY--;
                    break;
                case "d":
                    playerCoordinateX--;
                    break;
                case "w":
                    playerCoordinateY--;
                    break;
            }
            printMap(worldHeight, worldWidth, playerCoordinateX, playerCoordinateY, enemyCoordinateY, enemyCoordinateX);
            input = scanner.nextLine();
        }
    }
    //int -- sama tüüp mis peab olema funktsiooni sees return järgi
    public static int generateRandomCoordinate(int worldSize){
        return (int) (Math.random()*(worldSize-2))+1;
    }
    public static void printMap(int worldHeight, int worldWidth, int playerCoordinateX, int playerCoordinateY, int enemyCoordinateY, int enemyCoordinateX ) {
        char symbol; //deklareerib 1x muutuja, mitte iga kord
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) { //andmebaasipäring || primitiiv
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                if(playerCoordinateY == y && playerCoordinateX == x) {
                    symbol = 'x';
                }
                if(enemyCoordinateY == y && enemyCoordinateX == x){
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}


