import java.util.Scanner;
public class classePiatto {
    public static void main(String[] args){

    }
    public static void Menu(){
        Scanner ogg = new Scanner(System.in);
        int scelta;

        System.out.println("Scegli cosa fare:\n1 inserimento\n2 stampa valore\n3 crea utente\n4randomizza il budget\0 esci\n: ");
        scelta = ogg.nextInt();
        switch(scelta){
            case 1:

                break;
            case 2: 

                break;
            case 3:

                break;
            case 4:

                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("input invalido riporova: ");
                Menu();

        }

        ogg.close();
    }
}

class UtenteC{
    String Utente;
    int budget = (int)Math.random()*100; 
}

class Conto{
    int contoTotale, contoMomentaneo;
}

class Piatto{
    String nome,tipo;
    int prezzo;
}
