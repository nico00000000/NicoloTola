package Fibonacci;
import java.util.Scanner;
public class MetodiFibonacci {
    public void Stampanum(){
        Scanner oggetto = new Scanner(System.in);
        int numero, n2 = 1, n1 = 0 ,n = 0;

        System.out.println("inserisci quanti numeri della sequenza vuoi visualizzare: ");
        numero = oggetto.nextInt();

        for(int i = 0; i<numero; i++){
            n = n1+n2;
            n1 = n2;
            n2 = n;
            System.out.println(n);
        }
        oggetto.close();
    }

    public void Cercanum(){
        Scanner oggetto = new Scanner(System.in);
        int numero,flag = 0 , n2 = 1, n1 = 0 ,n = 0;
        System.out.println("inserisci quale numero vuoi trovare: ");
        numero = oggetto.nextInt();
        while(n<=numero && flag != 1){
                n = n1+n2;
                n1 = n2;
                n2 = n;
                //stampa solo se è il numero che cerco
                if(n==numero){
                    System.out.println("Numero trovato: " + n);
                    flag = 1;
                }
            }
        if(flag!=1){
            System.out.println("Numero non trovato.");
            //Menu();
        }
        oggetto.close();
    }
}
