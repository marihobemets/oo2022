
import java.util.Random;
import java.util.Scanner;

public class Game {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Mängime trips-traps-trulli");
        System.out.println("Valida tuleb oma märgi asukoht kastinumbri järgi (1-9)");
        playerPlaying(1,1,gameBoard);
        playerMove(gameBoard);
        randomCoordinate(gameBoard);
        gameEnd(gameBoard);
        updatePlayerPosition(1,1,gameBoard);
    }

    static char [][] gameBoard = {
            {'_','|','_','|','_'},
            {'_','|','_','|','_'},
            {' ','|',' ','|',' '}
    };

    public static void printBoard(char [][] gameBoard){
        for(char [] row : gameBoard){
            for( char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void playerPlaying(int position, int playerOne, char[][] gameBoard) {
        char character;
        if (playerOne == 1){
            character = 'X';
        } else {
            character = 'O';
        }
        System.out.println(position);
        switch(position) {
            case 1:
                gameBoard[0][0] = character;
                Game.printBoard(gameBoard);
                break;
            case 2:
                gameBoard[0][2] = character;
                Game.printBoard(gameBoard);
                break;
            case 3:
                gameBoard[0][4] = character;
                Game.printBoard(gameBoard);
                break;
            case 4:
                gameBoard[1][0] = character;
                Game.printBoard(gameBoard);
                break;
            case 5:
                gameBoard[1][2] = character;
                Game.printBoard(gameBoard);
                break;
            case 6:
                gameBoard[1][4] = character;
                Game.printBoard(gameBoard);
                break;
            case 7:
                gameBoard[2][0] = character;
                Game.printBoard(gameBoard);
                break;
            case 8:
                gameBoard[2][2] = character;
                Game.printBoard(gameBoard);
                break;
            case 9:
                gameBoard[2][4] = character;
                Game.printBoard(gameBoard);
                break;

            default:
                break;
        }
    }

    public static void playerMove(char[][] gameBoard){
        System.out.println("Vali ruut. (1-9)");
        int move = input.nextInt();
        boolean result = goodMove(move,gameBoard);
        System.out.println("mängija liikus ruudule" + move);
        updatePlayerPosition(move,1,gameBoard);
        Game.printBoard(gameBoard);
        playerPlaying(move,1,gameBoard);
    }

    private static void updatePlayerPosition(int move, int i, char[][] gameBoard) {
    }


    public static boolean goodMove(int move, char[][] gameBoard) {

        switch (move) {
            case 1:
                if (gameBoard[0][0] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (gameBoard[0][2] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (gameBoard[0][4] == '_') {
                    return true;
                } else {
                    return false;
                }

            case 4:
                if (gameBoard[1][0] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 5:
                if (gameBoard[1][2] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 6:
                if (gameBoard[1][4] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 7:
                if (gameBoard[2][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 8:
                if (gameBoard[2][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 9:
                if (gameBoard[2][4] == ' ') {
                    return true;
                } else {
                    return false;
                }

            default:
                return false;

        }
    }

    public static void randomCoordinate(char[][] gameBoard){
        Random rand = new Random();
        int move = rand.nextInt(9)+1;
        boolean result = goodMove(move, gameBoard);
        updatePlayerPosition(move,2,gameBoard);
    }

    public static boolean gameEnd(char [][] gameBoard){
        int playerResult = 1;
        if(gameBoard[0][0] == 'X'&& gameBoard[0][2] == 'X' && gameBoard [0][4] == 'X' ){
            System.out.println("Player Wins");
            playerResult++;
            return true;
        }
        if(gameBoard[1][0] == 'X'&& gameBoard[1][2] == 'X' && gameBoard [1][4] == 'X' ){
            System.out.println("Player Wins");
            playerResult++;
            return true;
        }
        if(gameBoard[2][0] == 'X'&& gameBoard[2][2] == 'X' && gameBoard [2][4] == 'X' ){
            System.out.println("Player Wins");
            playerResult++;
            return true;
        }
        if(gameBoard[0][0] == 'X'&& gameBoard[1][0] == 'X' && gameBoard [2][0] == 'X' ){
            System.out.println("Player Wins");
            playerResult++;
            return true;
        }
        if(gameBoard[0][2] == 'X'&& gameBoard[1][2] == 'X' && gameBoard [2][2] == 'X' ){
            System.out.println("Player Wins");
            playerResult++;
            return true;
        }
        if(gameBoard[0][4] == 'X'&& gameBoard[1][4] == 'X' && gameBoard [2][4] == 'X' ){
            System.out.println("Player Wins");
            playerResult++;
            return true;
        }
        if(gameBoard[0][0] == 'X'&& gameBoard[1][2] == 'X' && gameBoard [2][4] == 'X' ){
            System.out.println("Player Wins");
            playerResult++;
            return true;
        }
        if(gameBoard[2][0] == 'X'&& gameBoard[1][2] == 'X' && gameBoard [0][4] == 'X' ){
            System.out.println("Player Wins");
            playerResult++;
            return true;
        }
        return false;}
}
