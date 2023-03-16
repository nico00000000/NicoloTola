package Concetti.InnerClass.EsLibreria2;
import java.util.Scanner;

public class MainLibreria extends libreria{
    static libreria myLibreria = new libreria();
    static libreria.libro libroSalva;
    public static void main(String[] args){
        menu();
    }
    static void menu(){
        Scanner ogg = new Scanner(System.in);
        Scanner ogg1 = new Scanner(System.in);
        int scelta;
        boolean ciclo = true;
        String genereL, username, password;
        
        utenteLibreria user = new utenteLibreria("nico", "pass");

        while(ciclo){
            System.out.print("inserisci cosa fare:\n1 inserisci un libro\n2 prendi un libro\n0 esci\n: ");
            scelta = ogg.nextInt();

            switch(scelta){
                case 1:
                    try{
                        System.out.println("inserisci il genere del libro: ");
                        genereL = ogg1.nextLine();
                        libroSalva = myLibreria.new libro(genereL);
                        myLibreria.aggiungiLibro(libroSalva);
                        myLibreria.setLibroNum();
                    }catch(Exception e){
                        System.out.println("errore nell'inserimento dei dati");
                    }
                    break;
                case 2:
                    System.out.println("inserisci il nome utente: ");
                    username = ogg1.nextLine();
                    System.out.println("inserisci la password: ");
                    password = ogg1.nextLine();
                        
                    try{
                        if(user.getNome().equals(username) && user.getPassword().equals(password)){
                            System.out.println("inserisci il numero del libro da prendere in prestito: ");
                            scelta = ogg.nextInt();
                            System.out.println(myLibreria.getLibri().get(scelta));
                            //System.out.println(list.get(scelta));
                        }else{
                            System.out.println("password o username errati");
                        }
                    }catch(Exception e){
                            System.out.println("errore nella prenotazione: " + e);
                    }
                    break;
                case 0:
                        System.exit(0);
                }
                
                System.out.println("vuoi continuare? ");
                scelta = ogg.nextInt();
                if(scelta != 0){
                    ciclo = true;
                }
                else{
                    ciclo = false;
                }
            }

        ogg.close();
        ogg1.close();
    }
}