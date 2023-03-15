package Esercito;
import java.util.Scanner;

public class inputUser {

    int insInt(String messaggio){
        Scanner scn = new Scanner(System.in);
        int scelta;
        System.out.println(messaggio);
        scelta = scn.nextInt();
        scn.close();
        return scelta;
    }

    String insString(String messaggio){
        Scanner scn = new Scanner(System.in);
        String str;
        System.out.println(messaggio);
        str = scn.nextLine();
        scn.close();
        return str;
    }

    boolean insBool(String messaggio){
        Scanner scn = new Scanner(System.in);
        boolean bol = false;
        int scelta;
        System.out.println(messaggio + "1 true 2 falso");
        scelta = scn.nextInt();
        switch(scelta){
            case 1:
                bol = true;
                break;
            case 2:
                bol = false;
                break;
            default:
                System.out.println("input errato");
                insBool(messaggio);
        }
        scn.close();
        return bol;
    }
}
