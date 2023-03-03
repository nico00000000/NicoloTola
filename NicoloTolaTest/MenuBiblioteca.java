package NicoloTolaTest;
import java.util.Scanner;
public class MenuBiblioteca{
    
    public static void Menu(){
        //MetodiBiblioteca ogg = new MetodiBiblioteca();
        Scanner sca = new Scanner(System.in);
        int scelta;

        System.out.println("Scegli cosa fare:\n1 aggiungi\n2 restituisci\n3 presta\n4 rimuovi\n0 esci\n: ");
        scelta = sca.nextInt();

        switch(scelta){
            case 1:
                MetodiBiblioteca.aggiungiLibro();
                break;
            case 2:
                MetodiBiblioteca.restituisciLibro();
                break;
            case 3:
                MetodiBiblioteca.prestaLibro();
                break;
            case 4: 
                MetodiBiblioteca.rimuoviLibro();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("input errato riprova");
                Menu();
        }
        sca.close();        
    }
}