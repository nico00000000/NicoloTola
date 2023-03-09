package PrimoMarzo;
import java.util.Scanner;
import java.util.ArrayList;

public class es103Login{
    //DA FINIRE
    public static void main(String[] args){
        Menu();
    }

    public static void Menu(){
        int scelta;
        Scanner ogg = new Scanner(System.in);

        System.out.println("1 Registrati\n2 Login");
        scelta = ogg.nextInt();

        switch(scelta){
            case 1:
                UtenteClass.Registrati();
                break;
            case 2:
                UtenteClass.Login();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("errore input sbagliato");
                Menu();
        }
        ogg.close();
    }
}

class UtenteClass{
    static ArrayList<String> nomeUtente = new ArrayList<String>();
    static ArrayList<Integer> id = new ArrayList<Integer>();
    static ArrayList<String> password = new ArrayList<String>();
    static ArrayList<Double>  budget = new ArrayList<Double>();

    public static void Login(){
        Scanner ogg = new Scanner(System.in);
        Scanner ogg1 = new Scanner(System.in);
        String nom, pass;
        boolean found = false;
        int scelta;

        System.out.println("inserisci il nome utente: ");
        nom = ogg.nextLine();

        System.out.println("inserisci la password: ");
        pass = ogg.nextLine();

        for(int x=0; x<nomeUtente.size(); x++){
            if(nomeUtente.get(x) == nom && password.get(x)==pass){
                found = true;
                budget.set(x, Math.random()*20);
            }
        }
        if(found != true){
            System.out.println("Utente non trovato, torna al menu");
            es103Login.Menu();
        }

        //continua il programma
        System.out.println("1 Ordina\n0 Esci");
        scelta = ogg1.nextInt();

        switch(scelta){
            case 1:
                Ordina();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("errore input sbagliato");
                es103Login.Menu();
        }

    }

    public static void Registrati(){
        Scanner ogg = new Scanner(System.in);
        Scanner ogg1 = new Scanner(System.in);
        String nom, pass;
        int scelta;
        boolean found = false;

        System.out.println("inserisci il nome utente: ");
        nom = ogg.nextLine();

        System.out.println("inserisci la password: ");
        pass = ogg.nextLine();

        //controllo nome utente
        for(int x=0; x<nomeUtente.size(); x++){
            if(nomeUtente.get(x) == nom){
                found = true;
            }
        }
        if(found != true){
            nomeUtente.add(nom);
            id.add(nomeUtente.size());
            password.add(pass);
            budget.add(Math.random()*20);
            System.out.println("utente registrato");
        }
        else{
            System.out.println("nome utente già presente");
        }

        //continua il programma
        System.out.println("1 Ripeti\n0 Esci");
        scelta = ogg1.nextInt();

        switch(scelta){
            case 1:
                Registrati();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("errore input sbagliato");
                es103Login.Menu();
        }
    }

    public static void Ordina(){
        
    }
    
}