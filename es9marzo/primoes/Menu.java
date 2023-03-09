package es9marzo.primoes;
import java.util.Scanner;

public class Menu {
    public void menuscelta(){    
        Scanner ogg = new Scanner(System.in);
        int scelta;
        System.out.println("Inserisci cosa fare\n1 crea Piatto\n2 ordina\n3 esci e vedi il conto\n: ");
        scelta = ogg.nextInt();

        switch(scelta){
            case 1: 
                AggiungiPiatto();
                break;
            case 2:
                Ordina();
                break;
            case 3:
                Esci();
                break;
            default:
                System.out.println("input errato riprova");
                menuscelta();
        }
    }

    public void Esci(){

        System.out.println("Il prezzo totale è: ");
    }

    public void Ordina(){
        Scanner sca = new Scanner(System.in);
        int numpiatto;


        
        System.out.println("inserisci il numero del piatto da ordinare: ");
        numpiatto = sca.nextInt();


    }

    public void AggiungiPiatto(){
        Scanner sca = new Scanner(System.in);
        Scanner sca1 = new Scanner(System.in);
        String nomeChef, Ingredienti;
        double Prezzo;
        boolean ciclo = true;
        int scelta;
        do{
            System.out.println("inserisci il nome dello chef");
            nomeChef = sca.nextLine();

            System.out.println("inserisci gli ingredienti");
            Ingredienti = sca.nextLine();

            System.out.println("inserisci il prezzo");
            Prezzo = sca1.nextDouble();
            
            Ordinazione ord = new Ordinazione(nomeChef ,Ingredienti, Prezzo);
            ord.Ordini.add(ord);

            System.out.println("Il piatto è stato inserito correttamente\nVuoi continuare 1?");
            scelta = sca1.nextInt();

            if(scelta != 1){
                menuscelta();
            }else{
                AggiungiPiatto();
            }

        }while(ciclo == true);
    }
}
