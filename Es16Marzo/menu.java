package Es16Marzo;
import java.util.Scanner;

public class menu {
    
    void Menu(){
        utente ut;
        int scelta, eta, anniesp;
        Scanner scn = new Scanner(System.in), scn2 = scn, scn3 = scn;
        boolean ciclo = false;
        String nome, pass; 
        char s2;

        do{
            System.out.println("Scegli cosa fare: ");
            scelta = scn.nextInt();
                //if scelta == ? do
                System.out.println("Inserisci il tuo nome: ");
                nome = scn3.nextLine();

                System.out.println("Inserisci l'età: ");
                eta = scn.nextInt();

                System.out.println("Inserisci gli anni di esperienza: ");
                anniesp = scn.nextInt();

                System.out.println("Inserisci una password: ");
                pass = scn3.nextLine();

                ut = new utente(nome, pass, eta, anniesp);

                //inserisci nell'array
                
            System.out.println("Vuoi continuare? y/n ");
            s2 = scn2.next().charAt(0);
            if(s2 == 'y' || s2 == 'n'){
                if(s2 == 'y'){
                    ciclo = true;
                }else if(s2 == 'n'){
                    ciclo = false;
                }
            }
            else{
                System.out.println("input errato");
            }

        }while(ciclo);
    }
}
