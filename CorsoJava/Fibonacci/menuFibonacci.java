package Fibonacci;
import java.util.Scanner;
public class menuFibonacci {
    
    public void Menu(){
        Scanner oggetto = new Scanner(System.in);
        MetodiFibonacci ogg1 = new MetodiFibonacci();
        int s;
        System.out.println("Inserisci 1 per stampare 2 per cercare un numero e 3 per uscire: ");
        s = oggetto.nextInt();
        switch(s){
            case 1:
                ogg1.Stampanum();
                break;
            case 2:
                ogg1.Cercanum();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("input errato riprova");
                Menu();
        }
        oggetto.close();
    }
}
