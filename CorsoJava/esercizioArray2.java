import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class esercizioArray2 {

    static Integer[] numeri = {1,2,3,4};
    
    static String[] stringhe = {"ciao"};
    
    public static void main(String[] args){
        Menu();
    }

    public static void Menu(){
        int scelta,s2;
        Scanner oggetto1 = new Scanner(System.in);
        Scanner oggetto = new Scanner(System.in);

        System.out.println("Scegli quale visualizzare:\n1 numeri\n2 stringhe\n: ");
        scelta = oggetto.nextInt();
        switch(scelta){
            case 1:
                for(int i = 0; i < numeri.length; i++){
                    System.out.println(numeri[]);
                }
                break;
            case 2:
                for(int i = 0; i < numeri.length; i++){
                    System.out.println(numeri[]);
                }
                break;
            default:
                System.out.println("input invalido, riprova");
                System.exit(0);
        }
    }

    public static void Aggiungi(){
        int s2,num;
        String parola;
        Scanner oggetto = new Scanner(System.in);
        System.out.println("Scegli a quale array aggiungere elementi:\n1 numeri\n2 stringhe\n: ");
        s2=oggetto.nextInt();

        switch(s2){
            case 1:
                System.out.println("Aggiungi un numero: ");
                num = oggetto.nextInt();
                ArrayList<Integer> lista1 = new ArrayList<Integer>(Arrays.asList(numeri));
                lista1.add(num);

                numeri = arrayList.toArray(numeri);
                break;
            case 2:
                System.out.println("Aggiungi una parola: ");
                parola = oggetto.nextLine();
                ArrayList<String> lista2 = new ArrayList<String>(Arrays.asList(stringhe));
                lista2.add(parola);
                stringhe = arrayList.toArray(stringhe);
                break;
            default:
                System.out.println("input invalido, riprova");
                Menu();
        }
        Menu();
    }
}