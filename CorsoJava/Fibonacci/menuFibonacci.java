package Fibonacci;
import java.util.Scanner;
public class menuFibonacci {
    
    public void Menu(){
        Scanner oggetto = new Scanner(System.in);
        Scanner oggetto1 = new Scanner(System.in);
        MetodiFibonacci ogg1 = new MetodiFibonacci();
        int s,num;
        boolean ciclo = true;
        do{    
            System.out.println("Inserisci 1 per stampare 2 per cercare un numero e 3 per uscire: ");
            s = oggetto.nextInt();
            switch(s){
                case 1:
                    System.out.println("inserisci quanti numeri della sequenza vuoi visualizzare: ");
                    num = oggetto1.nextInt();
                    ogg1.Stampanum(num);
                    break;
                case 2:
                    System.out.println("inserisci quale numero vuoi trovare: ");
                    num = oggetto1.nextInt();
                    ogg1.Cercanum(num);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("input errato riprova");
                    System.exit(0);
            }
            System.out.println("vuoi continuare?: 1 si 2 no ");
            s = oggetto.nextInt();
            if(s == 2 || s == 1){
               if(s==2){
                ciclo = false;
                //return; il return esce dal ciclo
               }
               if(s==1){
                ciclo = true;
               } 
            }
            else{
                System.out.println("input errato");
                System.exit(0);
            }
        }while(ciclo == true);

        oggetto.close();
        oggetto1.close();
    }
}
