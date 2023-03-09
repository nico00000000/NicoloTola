package Gestore;
import java.util.Scanner;

public class mainGest {
    public static void main(String[] args){
        Scanner ogg1 = new Scanner(System.in);
        Scanner ogg2 = new Scanner(System.in);
        Gestore gest = new Gestore();
        int x;
        double y;
        System.out.println("inserisci un int: ");
        x = ogg2.nextInt();
        System.out.println("inserisci un double: ");
        y = ogg2.nextDouble();

        gest.ConvertiInt(x);
        gest.ConvertiDouble(y);

        gest.Visualizza();

        ogg1.close();
        ogg2.close();
    }
}
