import java.util.Scanner;

public class game2 {
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

        World world = new World(5, 10);
        Player mangija1 = new Player(world.worldHeight, world.worldWidth);
        Player mangija2 = new Player(world.worldHeight, world.worldWidth);

        //uue instansi loomine, kellel on kõik omadused, mis defineeritud tema klassis
        Enemy vaenlane1 = new Enemy(world.worldHeight, world.worldWidth);

        world.printMap(mangija1.coordinateX, mangija1.coordinateY, vaenlane1.coordinateY, vaenlane1.coordinateX);

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
            mangija1.movePlayer(input, world.worldHeight, world.worldWidth);
            world.printMap(mangija1.coordinateX, mangija1.coordinateY, vaenlane1.coordinateY, vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }
    //int -- sama tüüp mis peab olema funktsiooni sees return järgi
    public static int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }
}


