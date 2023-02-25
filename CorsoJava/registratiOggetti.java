import java.util.Scanner;
import java.util.ArrayList;

class utenti{
    static ArrayList<String> password = new ArrayList<String>(); //esempio di oggetto static in una classe e come va chiamato al di fuori
    ArrayList<String> nomeUtente = new ArrayList<String>();
}

public class registratiOggetti {
    public static void main(String[] args){
        Scanner oggetto = new Scanner(System.in);
        Scanner oggetto1 = new Scanner(System.in);
        Scanner oggetto2 = new Scanner(System.in);
        utenti obj = new utenti(); 
        boolean s = true;
        int scelta;
        String inp;
        while(s){
            System.out.println("Inserisci il nome utente: ");
            inp = oggetto.nextLine();
            obj.nomeUtente.add(inp);

            System.out.println("Inserisci la password: ");
            inp = oggetto1.nextLine();
            utenti.password.add(inp);

            System.out.println("continuare? ");
            scelta = oggetto2.nextInt();
            if(scelta == 0){
                s = false;
            }
            else{
                s = true;
            }
        }
        oggetto.close();
        oggetto1.close();
        oggetto2.close();
        System.out.println(obj.nomeUtente + "\n" + utenti.password);
    }
}
