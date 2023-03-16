package Concetti.Metodi;
import java.util.ArrayList;
import java.util.Scanner;
public class registrazione {
    
    static ArrayList<String>usernames = new ArrayList<String>();
    static ArrayList<String>password = new ArrayList<String>();
    static ArrayList<Integer>age = new ArrayList<Integer>();


    public static void main(String[] args){
        menuIniziale();    
    }

    public static void menuIniziale(){
        Scanner oggetto = new Scanner(System.in);
        int scelta;

        System.out.println("Scegli cosa fare:\n1 registrati\n2 login\n0 esci\n: ");
        scelta = oggetto.nextInt();

        switch(scelta){
            case 1:
                Registrati();
                break;
            case 2: 
                Login();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Input errato, riprova");
                menuIniziale();
        }
        oggetto.close();
    }

    public static void Menu(){
        Scanner oggetto = new Scanner(System.in);
        int scelta;

        System.out.println("Scegli cosa fare:\n1 registrati\n2 modifica\n3 elimina un utente\n4 visualizza\n0 esci\n: ");
        scelta = oggetto.nextInt();

        switch(scelta){
            case 1:
                Registrati();
                break;
            case 2: 
                Modifica();
                break;
            case 0:
                System.exit(0);
            case 3:
                Elimina();
                break;
            case 4:
                Visualizza();
                break;
            default:
                System.out.println("Input errato, riprova");
                Menu();
        }
        oggetto.close();
    }

    public static void Registrati(){
        Scanner oggetto = new Scanner(System.in);
        Scanner oggetto1 = new Scanner(System.in);
        int num;
        String inserimento;

        System.out.println("nome utente: ");
        inserimento = oggetto1.nextLine();
        usernames.add(inserimento);
            
            
        System.out.println("Password: ");
        inserimento = oggetto1.nextLine();
        password.add(inserimento);

        System.out.println("eta: ");
        num = oggetto1.nextInt();
        age.add(num);
        
        System.out.println("vuoi inserire un altro utente?\n1 = si\naltro numero = no\n: ");
        num = oggetto.nextInt();
        if(num == 1){
            Registrati();
        }
        else{
            Menu();
        }

        System.out.println(usernames);
        oggetto.close();
        oggetto1.close();
    }

    public static void Modifica(){
        Scanner oggetto = new Scanner(System.in);
        String user, pass; 

        System.out.println("inserisci il nome utente: ");
        user = oggetto.nextLine();

        System.out.println("Inserisci la password");
        pass = oggetto.nextLine();

        for(int i=0; i <= usernames.size(); i++){
            if(usernames.get(i).equalsIgnoreCase(user) && password.get(i).equals(pass)){
                System.out.println("inserisci il nuovo nome utente: ");
                user = oggetto.nextLine();
                usernames.set(i, user);

                System.out.println("Inserisci la nuova password");
                pass = oggetto.nextLine();
                password.set(i, pass);

            }
        }


        oggetto.close();
    }

    public static void Elimina(){
        Scanner oggetto = new Scanner(System.in);
        String user, pass; 

        System.out.println("inserisci il nome utente da eliminare: ");
        user = oggetto.nextLine();

        System.out.println("Inserisci la password: ");
        pass = oggetto.nextLine();

        for(int i=0; i <= usernames.size(); i++){
            if(usernames.get(i).equalsIgnoreCase(user) && password.get(i).equals(pass)){
                usernames.remove(i);
                password.remove(i);
                age.remove(i);
            }
        }


        oggetto.close();
    } 
    
    public static void Visualizza(){
        
        for(int i=0; i <= usernames.size(); i++){
            System.out.println("Username: " + usernames.get(i) + "Eta: " + age.get(i));
        }
    }

    public static void Login(){
        Scanner oggetto = new Scanner(System.in);
        String user, pass; 
        int flag = 0;

        System.out.println("inserisci il nome utente: ");
        user = oggetto.nextLine();

        System.out.println("Inserisci la password");
        pass = oggetto.nextLine();

        for(int i=0; i <= usernames.size(); i++){
            if(usernames.get(i).equalsIgnoreCase(user) && password.get(i).equals(pass)){
                Menu();
                flag = 1;
            }
        }
        if(flag != 1){
            System.out.println("utente non trovato");
            menuIniziale();
        }
        else{
            Menu();
        }
        oggetto.close();
    } 
}
