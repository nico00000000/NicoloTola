package Esercizi.Es16Marzo;
import java.util.ArrayList;

public class utente {
    private String username;
    private String password;
    private int eta;
    private int anniEsp;

    String getUsername(){
        return this.username;
    }

    String getPassword(){
        return this.password;
    }

    int getEta(){
        return this.eta;
    }

    int getAnniEsp(){
        return this.anniEsp;
    }

    utente(String username, String password, int eta, int anniEsp){
        this.username = username;
        this.password = password;
    }

    class admin extends utente{
        private ArrayList <utente> listaUser = new ArrayList<utente>();

        admin(){
            super(username = "nico", password = "nico13", eta = 20, anniEsp = 333);
        }

        void addUser(utente u){
            listaUser.add(u);
        }

        void cercaLavoratori(){
            //scorri array e metti gli utenti in un altro array se sono adatti
        }
    
    }
}
