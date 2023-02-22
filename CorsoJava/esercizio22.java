import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class esercizio22 {
    //dati utente
    static ArrayList<String>usernames = new ArrayList<String>();
    static ArrayList<Integer>budget = new ArrayList<Integer>();

    //dati piatti
    static ArrayList<String>nomepiatto = new ArrayList<String>();
    static ArrayList<String>ingredienti = new ArrayList<String>();
    static ArrayList<Integer>prezzi = new ArrayList<Integer>();
    static ArrayList<Integer>disp = new ArrayList<Integer>();
    //DA FINIRE
    public static void main(String[] args){
        Entra();
    }

    static void Entra(){
        Scanner oggetto = new Scanner(System.in);
        String inser;
        double soldiMax;
        int soldi2;

        System.out.println("Inserisci il nome utente: ");
        inser = oggetto.nextLine();
        usernames.add(inser);

        soldiMax = Math.random()*60;
        soldi2 = (int) soldiMax;
        budget.add(soldi2);
        
        Menu();
    }

    static void Menu(){
        Scanner oggetto = new Scanner(System.in);
        int scelta;

        System.out.println("Scegli quale servizio usare:\n1 ordina\n2 modifica\n3 visualizza\n4 esci");
        scelta = oggetto.nextInt();

        switch(scelta){
            case 1:
                Ordina();
                break;
            case 2:
                Modifica();
                break;
            case 3:
                Visualizza();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("input invalido");
                Menu();
        }
        oggetto.close();
    }

    static void Ordina(){
        int scelta,nutente,tempnum, temp, temp2;
        Scanner oggettoU = new Scanner(System.in);
        Scanner oggetto = new Scanner(System.in);

        System.out.println("inserisci il numero del tuo nome utente");
        nutente = oggettoU.nextInt();
        System.out.println("Inserisci il numero del piatto da ordinare: ");
        scelta = oggetto.nextInt();
        if(scelta <= usernames.size() || scelta >= 0){
            if(budget.get(nutente)>prezzi.get(scelta)){
                tempnum = disp.get(scelta);
                tempnum--;
                disp.set(scelta, tempnum);
                temp = budget.get(nutente);
                temp2 = prezzi.get(scelta);
                budget.set(nutente, temp - temp2);
                System.out.println("Piatto ordinato");
                Menu();
            }
        }
    }

    static void Visualizza(){
        int cont = 0;
        for (String i : nomepiatto) {
            System.out.println("Il piatto numero "+cont);
            cont++;
            System.out.println(i); 
            for(String x : ingredienti){
                System.out.println(x);
                for(Integer y : prezzi){
                    System.out.println(y); 
                } 
            }
        }
    }

    static void Modifica(){
        int scelta;
        Scanner oggetto = new Scanner(System.in);

        System.out.println("Vuoi 1-eliminare un piatto 2-aggiungere un piatto 3-modificare un piatto\n: ");
        scelta = oggetto.nextInt();
        switch(scelta){
            case 1:
                Elimina();
                break;
            case  2:
                AggiungiPiatto();
                break;
            case 3:
                ModificaPiatto();
                break;
            default:
                System.out.println("Input errato");
                Modifica();
        }
    }

    static void Elimina(){
        Scanner oggetto = new Scanner(System.in);
        int scelta;

        System.out.println("inserisci il numero del piatto da eliminare");
        scelta = oggetto.nextInt();

        if(scelta <= usernames.size() || scelta >= 0){
            nomepiatto.remove(scelta);
            ingredienti.remove(scelta);
            prezzi.remove(scelta);
            disp.remove(scelta);
            System.out.println("Piatto eliminato");
        }
    }
    
    static void ModificaPiatto(){
        Scanner oggetto = new Scanner(System.in);
        Scanner oggetto1 = new Scanner(System.in);
        String inser;
        int num;
        int scelta;
        System.out.println("Inserisci il numero del piatto da modificare");
        scelta = oggetto.nextInt();
        if(scelta <= usernames.size() || scelta >= 0){
            System.out.println("Inserisci il numero del piatto da modificare");
            inser = oggetto.nextLine();
            nomepiatto.set(scelta, inser);
            
            System.out.println("Inserisci il numero del piatto da modificare");
            inser = oggetto.nextLine();
            ingredienti.set(scelta, inser);
            
            System.out.println("Inserisci il numero del piatto da modificare");
            num = oggetto1.nextInt();
            prezzi.set(scelta, num);
            
            System.out.println("Inserisci il numero del piatto da modificare");
            num = oggetto1.nextInt();
            disp.set(scelta, num);
            System.out.println("Piatto eliminato");
        }
    }

    static void AggiungiPiatto(){
        int y;
        String inser;
        Scanner oggetto = new Scanner(System.in);
        Scanner oggetto1 = new Scanner(System.in);
        
        System.out.println("Inserisci il nome del piatto: ");
        inser = oggetto.nextLine();
        nomepiatto.add(inser);
        
        System.out.println("Inserisci gli ingredienti: ");
        inser = oggetto.nextLine();
        ingredienti.add(inser);

        System.out.println("Inserisci il numero di piatti disponibili: ");
        y = oggetto1.nextInt();
        disp.add(y);

        System.out.println("Inserisci il prezzo del piatto: ");
        y = oggetto.nextInt();
        prezzi.add(y);

        System.out.println("piatto inserito correttamente.");
    }
}