import java.util.*;
public class fibonacci {    

    public static void main(String[] args){
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
}
