package Concetti.Oggetti;
import java.util.ArrayList;
import java.util.Scanner;
public class generatoreSquadra {
    public static void main(String[] args){
        Menu();
    }

    public static void Visualizza(){
        Giocatori ogg = new Giocatori();
        Dirigenza ogg1 = new Dirigenza();
        
        for(int i=0; i< ogg.Dirigenti.size(); i++){
            System.out.println("Il dirigente n " + i + "è: " + ogg.Dirigenti.get(i));
        }

        for(int i=0; i< ogg1.titolari.size(); i++){
            System.out.println("Il titolare n " + i + "è: " + ogg1.titolari.get(i));
        }

        for(int i=0; i< ogg1.riserve.size(); i++){
            System.out.println("la riserva n " + i + "è: " + ogg1.riserve.get(i));
        }

        System.out.println("Il boss è: " + ogg.boss);

        //Dirigenti titolari riserve boss
    }

    public static void Menu(){
        int scelta;
        
        Scanner oggetto = new Scanner(System.in); //int
        System.out.println("vuoi iniziare o uscire?\n1)inizia\n2)esci\n3)visualizza i dati\n: ");
        scelta = oggetto.nextInt();
        switch(scelta){
            case 1:
                Squadra.InserimentoDati(); //"The static method immettiDati() from the type esercizioMacchina should be accessed in a static way",
                break;
            case 2:
                System.exit(0);
            case 3:
                Visualizza();
            default:
                System.out.println("errore input invalido");
                System.exit(0);

        }
        oggetto.close();
    }

}

class Squadra{
    public static void InserimentoDati(){
        Giocatori gioc = new Giocatori();
        Dirigenza dir = new Dirigenza();
        String inp;
        Scanner oggetto1 = new Scanner(System.in);
        Scanner oggetto = new Scanner(System.in); //int
        int scelta = 0;
        do{
            System.out.println("inserisci il nome del titolare: ");
            inp = oggetto1.nextLine();
            dir.titolari.add(inp);
            System.out.println("Vuoi aggiungerne un altro?\n0)no\nelse continua\n: ");
            scelta = oggetto.nextInt();
        }
        while(scelta != 0);

        scelta = 0;
        do{
            System.out.println("inserisci il nome della riserva: ");
            inp = oggetto1.nextLine();
            dir.riserve.add(inp);
            System.out.println("Vuoi aggiungerne un altra?\n0)no\nelse continua\n: ");
            scelta = oggetto.nextInt();
        }
        while(scelta != 0);
        
        scelta = 0;
        do{
            System.out.println("inserisci il nome del dirigente: ");
            inp = oggetto1.nextLine();
            gioc.Dirigenti.add(inp);
            System.out.println("Vuoi aggiungerne un altro?\n0)no\nelse continua\n: ");
            scelta = oggetto.nextInt();
        }
        while(scelta != 0);

        System.out.println("inserisci il nome del boss: ");
        inp = oggetto1.nextLine();
        gioc.boss = inp;
        
        generatoreSquadra.Menu();

        oggetto.close();
        oggetto1.close();

    } 
}

class Giocatori{
    ArrayList<String> Dirigenti = new ArrayList<String>();
    String boss;
}

class Dirigenza{
    ArrayList<String> titolari = new ArrayList<String>();
    ArrayList<String> riserve = new ArrayList<String>();
}

