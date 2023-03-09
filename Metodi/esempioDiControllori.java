package Metodi;
import java.util.Scanner;
public class esempioDiControllori {
    public static void main(String[] args){
        int sceltapp;
        System.out.println("scegli il servizio");
        Scanner oggetto = new Scanner(System.in);
        sceltapp = oggetto.nextInt();
        oggetto.close();

        switch (sceltapp){
            case 1:
                calcolatrice();
            case 2:
                calendario();
        }
    }
    //commento github
    static void calcolatrice(){    
        int scelta;
        int numero1, numero2;
        
        System.out.println("Inserisci il primo numero");
        Scanner myObj2 = new Scanner(System.in);
        numero1 = myObj2.nextInt();
        
        System.out.println("Inserisci il secondo numero");
        Scanner myObj3 = new Scanner(System.in);
        numero2 = myObj3.nextInt();

        System.out.println("scegli che operazione fare\n1) addizione\n2) sottrazione\n3) moltiplicazione\n4)modulo");
        Scanner myObj = new Scanner(System.in);
        scelta = myObj.nextInt();
        
        switch (scelta){
            case 1:
                System.out.println("il risultato è: " + addizione(numero1, numero2));
            case 2:
                System.out.println("il risultato è: " + sottrazione(numero1, numero2));
            case 3:
                System.out.println("il risultato è: " + moltiplicazione(numero1, numero2));
            case 4:
                System.out.println("il risultato è: " + modulo(numero1, numero2));
        }
        
        myObj.close();
        myObj2.close();
        myObj3.close();
    }

    static int addizione(int n1, int n2){
        int risultato;
        risultato = n1 + n2;
        return risultato;
    }

    static int sottrazione(int n1, int n2){
        int risultato;
        risultato = n1 - n2;
        return risultato;
    }

    static int moltiplicazione(int n1, int n2){
        int risultato;
        risultato = n1 * n2;
        return risultato;
    }

    static int modulo(int n1, int n2){
        int risultato;
        risultato = n1 % n2;
        return risultato;
    }

    static void calendario(){
        System.out.println("calendario");
    } 
}