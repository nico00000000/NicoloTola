package InnerClass.EsLibreria2;
import java.util.ArrayList;
import java.util.Scanner;

public class MainLibreria{
    public static void main(String[] args){
        menu();
    }
    static void menu(){
        Scanner ogg = new Scanner(System.in);
        Scanner ogg1 = new Scanner(System.in);
        int scelta, numero;
        String genereL, username, password;
        utenteLibreria user = new utenteLibreria("nico", "pass");

        ArrayList<libreria> list = new ArrayList<libreria>();
        
        while(true){
        System.out.print("inserisci cosa fare:\n1 inserisci un libro\n2 prendi un libro\n0 esci\n: ");
        scelta = ogg.nextInt();

        switch(scelta){
            case 1:
                try{
                    System.out.println("inserisci il genere del libro: ");
                    genereL = ogg1.nextLine();
                    list.add(new libreria(genereL));
                }catch(Exception e){
                    System.out.println("errore nell'inserimento dei dati");
                }
                break;
            case 2:
                System.out.println("inserisci il nome utente: ");
                username = ogg1.nextLine();
                System.out.println("inserisci la password: ");
                password = ogg1.nextLine();

                //aggiungi visualizza con indice

                for (libreria l : list) {
                    System.out.println(list.get(0));
                }
                try{
                    if(user.getNome().equals(username) && user.getPassword().equals(password)){
                        System.out.println("inserisci il numero del libro da prendere in prestito: ");
                        genereL = ogg1.nextLine();

                    }    
                }catch(Exception e){
                        System.out.println("errore nella prenotazione");
                }
                       
                }
        }
    }
    }