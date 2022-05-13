import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kirjutage transpordivahend, mille kohta soovite infot");
        Scanner vastus = new Scanner(System.in);
        String Sõiduk = vastus.nextLine();

        if(Objects.equals(Sõiduk, "Auto")){
            Auto auto = new Auto();
            auto.maa();
            auto.mugav();
        }
        if(Objects.equals(Sõiduk, "Buss")){
            Buss buss = new Buss();
            buss.maa();
        }
    }
}
