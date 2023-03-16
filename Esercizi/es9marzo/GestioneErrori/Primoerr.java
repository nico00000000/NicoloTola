package Esercizi.es9marzo.GestioneErrori;
import java.util.Scanner;

public class Primoerr {
    public static void main(String[] args){
        try{
            int[] myNumbers = {1,2,3,4};
            Scanner ogg = new Scanner(System.in);
            int var;
            var = ogg.nextInt();
            System.out.println(myNumbers[var]);
        } catch(Exception e){
            System.out.println("Qualcosa non va");
        }finally{
            System.out.println("il try catch è finito");
        }
    }    
}
