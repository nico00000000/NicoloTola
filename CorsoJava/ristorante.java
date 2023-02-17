import java.util.Scanner;

public class ristorante{
    //dichiaro gli array e la lunghezza iniziale fuori in modo che siano globali e accessibili dalle funzioni
    static String[] nomepiatti = {"pasta al pesto", "carbonara"};
    static String[] ingredientipiatti = {"pasta e pesto", "guanciale, uova, pecorino, pasta"};
    static int[] prezzi = {15, 500};
    static int[] disponibilita = {10, 20};
    static int lunghezzainiziale = nomepiatti.length;
    public static void main(String[] args){
        Menu();
    }

    public static void Menu(){
        Scanner oggetto = new Scanner(System.in);
        int scelta;

        System.out.println("Scegli cosa fare: \n0 esci\nCompra: 1\nVedi: 2\nAggiungi: 3\nTorna al menu: 4\n: ");
        scelta = oggetto.nextInt();

        switch(scelta){
            case 0:
                System.exit(0);
                break;
            case 1:
                Compra();
                break;
            case 2:
                Vedi();
                break;
            case 3:
                Aggiungi();
                break;
            case 4:
                Menu();
                break;
            default:
                System.out.println("Input invalido, riprova");
                Menu();
        }
        oggetto.close();
    }

    public static void Compra(){
        Scanner oggetto = new Scanner(System.in);
        int scelta; 
        for(int i=0; i<nomepiatti.length; i++){
            System.out.println("il piatto numero: " + i +" è:\n");
            System.out.println(nomepiatti[i] + "\ngli ingredienti sono: " + ingredientipiatti[i] +  "\nIl prezzo è: " + prezzi[i] + "\nne rimangono: "  + disponibilita[i] + "\n");
            System.out.println("inserisci il numero del piatto per ordinarlo oppure -1 per tornare al menu: ");
            scelta = oggetto.nextInt();
            //controlla se la scelta è di uscire
            if(scelta != -1){
                //controlla se la scelta è un piatto o un errore
                if(scelta > nomepiatti.length){
                    System.out.println("Input invalido");
                    Menu();
                }
                //controlla la disponibilita del piatto e se si può ordinare la diminuisce di uno
                else if(disponibilita[scelta]>0){
                    System.out.println("Piatto ordinato.");
                    disponibilita[scelta] = disponibilita[scelta]-1;
                    Menu(); //torna al menu
                }
                else if(disponibilita[scelta]<=0){
                    System.out.println("Piatto esaurito.");
                    Menu();
                }
            }
            //se la scelta è -1 esce
            else if(scelta == -1){
                Menu();
            }
            
        }
        oggetto.close();
    }

    public static void Vedi(){
        for(int i=0; i<nomepiatti.length; i++){
            //se la disponibilità è 0 non viene mostrato in quanto non disponibile
            if(disponibilita[i]!=0){    
                System.out.println("il piatto numero: " + i +" è:\n");
                System.out.println(nomepiatti[i] + "\ngli ingredienti sono: " + ingredientipiatti[i] +  "\nIl prezzo è: " + prezzi[i] + "\nne rimangono: "  + disponibilita[i] + "\n");
            }
        }
        Menu(); //ritorna al menu per non termiare
    }

    public static void Aggiungi(){
        Scanner oggetto = new Scanner(System.in);
        Scanner oggetto1 = new Scanner(System.in);
        int scelta;
        String password = "1234", passwordUser;
        System.out.println("Inserisci la password: "); 
        passwordUser = oggetto.nextLine();
        //controlla la password che ho settato ma per qualche motivo chiude il programma
        if(passwordUser == password){
            System.out.println("Vuoi resettare=1 o aggiungere un piatto=2?: ");
            scelta = oggetto1.nextInt();
            switch(scelta){
                case 1:
                    AggiungiPiatto();
                    break;
                case 2:
                    Resetta();
                    break;
                default:
                    System.out.println("Input invalido, riprova");
                    Menu();
            }
        }
        else{
            System.out.println("Password errata riprova");
            Menu(); //richiama il menu (non richiama aggiungi per riprovare la password perchè non ci sarebbe modo di uscire senza conoscere la password)
        }
        oggetto.close();
        oggetto1.close();
    }
        //funzione per aggiungere un piatto
        public static void AggiungiPiatto(){
            Scanner oggetto = new Scanner(System.in);
            Scanner oggetto1 = new Scanner(System.in);
            Scanner oggetto2 = new Scanner(System.in);
            Scanner oggetto3 = new Scanner(System.in);
            Scanner oggetto4 = new Scanner(System.in);
            boolean i=true;
            int scelta, lunghezza;
            while(i == true){
                lunghezza = nomepiatti.length;
                System.out.println("inserisci il nome del piatto: ");
                nomepiatti[lunghezza+1] = oggetto.nextLine();
                System.out.println("inserisci gli ingredienti del piatto: ");
                ingredientipiatti[lunghezza+1] = oggetto1.nextLine();
                System.out.println("inserisci il prezzo del piatto: ");
                prezzi[lunghezza+1] = oggetto3.nextInt();
                System.out.println("inserisci quanti piatti ci sono disponibili: ");
                disponibilita[lunghezza+1] = oggetto3.nextInt();

                System.out.println("piatto inserito");

                System.out.println("vuoi aggiungere un altro piatto?: 1= si 2= no: ");
                scelta = oggetto2.nextInt();
                switch(scelta){
                case 1:
                    System.out.println("aggiungi un altro piatto: \n");
                    break;
                case 2:
                    i = false;
                    break;
                default:
                    System.out.println("Input invalido, torna al menu");
                    Menu();
                }               
            }
            oggetto.close();
            oggetto1.close();
            oggetto2.close();
            oggetto3.close();
            oggetto4.close();
        }
        /*funzione che prende la lunghezza iniziale e la confronta con quella attuale e scorre l'array fino a raggiungere
         la lunghezza iniziale e setta tutti gli elementi a null o 0 fino a raggiungere quelli di base
         e lo fa solo se la lunghezza attuale è diversa da quella iniziale.*/
        public static void Resetta(){
            int lunghezzaAttuale = nomepiatti.length;
            if(lunghezzaAttuale == lunghezzainiziale){
                System.out.println("Non sono stati aggiunti elementi.");
                Menu();
            }
            else{    
                for(int i=lunghezzaAttuale; i !=lunghezzainiziale; i--){
                    nomepiatti[i]=null;
                    ingredientipiatti[i]=null;
                    prezzi[i]=0;
                    disponibilita[i]= 0;
                }
            }
        }
    
}