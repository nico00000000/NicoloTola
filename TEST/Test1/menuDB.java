package TEST.Test1;
import java.util.Scanner;
public class menuDB {
    void menu(){
        metodiDB meto = new metodiDB();
        int scelta;
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        String str1,str2,str3,str4;

        System.out.println("scegli cosa fare:\n1 inserisci un libro\n2 inserisci un autore\n3 stampa tutti gli autori\n4 stampa i libri di un autore\n: ");
        scelta = scn.nextInt();

        switch(scelta){
            case 1:
                System.out.println("inserisci il nome del libro: ");
                str1 = scn2.nextLine();

                System.out.println("inserisci il nome del libro: ");
                str2 = scn2.nextLine();
                
                System.out.println("inserisci il nome del libro: ");
                str3 = scn2.nextLine();
                
                meto.inserisciLibro(str1, str2, str3);
                break;
            case 2:
                System.out.println("inserisci il nome del libro: ");
                str1 = scn2.nextLine();

                System.out.println("inserisci il nome del libro: ");
                str2 = scn2.nextLine();
                
                System.out.println("inserisci il nome del libro: ");
                str3 = scn2.nextLine();

                System.out.println("inserisci il nome del libro: ");
                str4 = scn2.nextLine();
                meto.inserisciAutore(str1, str2, str3, str4);
                break;
            case 3:
                meto.stampaAutori();
                break;
            case 4:
                System.out.println("inserisci il nome del libro: ");
                str1 = scn2.nextLine();
                meto.stampaLibri(str1);
                break;
            default:
                System.out.println("input errato");
                System.exit(0);
        }
        scn.close();
        scn2.close();

    }
}
