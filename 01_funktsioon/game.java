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
        int playerCoordinateY = (int)Math.random()*(worldHeight-2))+1;
        int playerCoordinateX = 2;
        int enemyCoordinateY = 3;
        int enemyCoordinateX = 5;

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

        }
    }


