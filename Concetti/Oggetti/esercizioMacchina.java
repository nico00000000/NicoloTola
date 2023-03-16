package Concetti.Oggetti;
import java.util.Scanner;
public class esercizioMacchina {
    public static void main(String[] args){
        Menu();
    }

    public static void Menu(){
        int scelta;
        
        Scanner oggetto = new Scanner(System.in); //int
        System.out.println("vuoi iniziare o uscire?\n1)inizia\n2)esci\n: ");
        scelta = oggetto.nextInt();
        switch(scelta){
            case 1:
                Macchina.immettiDati(); //"The static method immettiDati() from the type esercizioMacchina should be accessed in a static way",
                break;
            case 2:
                System.exit(0);
            default:
                System.out.println("errore input invalido");
                System.exit(0);

        }
        oggetto.close();
    }
}

class Macchina{
    public static void immettiDati(){
        String targa;
        Freni freno1 = new Freni();
        Motore mot1 = new Motore();
        Scanner oggetto = new Scanner(System.in); //int
        Scanner oggetto1 = new Scanner(System.in); //string
        Scanner oggetto2 = new Scanner(System.in); //double
        
        System.out.println("inserisci la targa della macchina: ");
        targa = oggetto1.nextLine();
                
        System.out.println("inserisci la cilindrata della macchina: ");
        mot1.cilindrata = oggetto2.nextDouble();
                
        System.out.println("inserisci il numero di pistoni della macchina: ");
        mot1.pistoni = oggetto.nextInt();

        System.out.println("inserisci la potenza frenante della macchina: ");
        freno1.potenzaFrenante = oggetto2.nextDouble();
                
        System.out.println("inserisci il numero di elementi: ");
        freno1.nElementi = oggetto.nextInt();

        System.out.println("La targa è: " + targa + "\nLa cilindrata è: " + mot1.cilindrata + "\nHa " + mot1.pistoni + " pistoni\nLa potenza frenante è: " + freno1.potenzaFrenante + "\nIl numero di elementi: " + freno1.nElementi + "\n\n");

        esercizioMacchina.Menu();
        
        oggetto.close();
        oggetto1.close();
        oggetto2.close();
    }
}

class Motore{
    double cilindrata;
    int pistoni;
}

class Freni{
    double potenzaFrenante;
    int nElementi;
}
