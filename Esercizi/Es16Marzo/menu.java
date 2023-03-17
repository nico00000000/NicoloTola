package Esercizi.Es16Marzo;
import java.util.Scanner;

import Esercizi.Es16Marzo.utente.admin;

public class menu {
    
    void Menu(){
        utente ut;
        
        utente admin = new utente(null, null, 0, 0);
        admin ut2 = admin.new admin();
        
        int scelta, eta, anniesp;
        Scanner scn = new Scanner(System.in), scn2 = scn, scn3 = scn;
        boolean ciclo = false;
        String nome, pass; 
        char s2;

        do{
            System.out.println("Scegli cosa fare: ");
            scelta = scn.nextInt();
            switch(scelta){
                case 1:
                    System.out.println("Inserisci il tuo nome: ");
                    nome = scn3.nextLine();

                    System.out.println("Inserisci l'età: ");
                    eta = scn.nextInt();

                    System.out.println("Inserisci gli anni di esperienza: ");
                    anniesp = scn.nextInt();

                    System.out.println("Inserisci una password: ");
                    pass = scn3.nextLine();

                    ut = new utente(nome, pass, eta, anniesp);

                    //ut2 va inizializzata
                    //ut2.addUser(ut); 

                    //inserisci nell'array
                    break;
                case 2:
                    //login da admin
                    System.out.println("Inserisci il nome: ");
                    nome = scn3.nextLine();
                    System.out.println("Inserisci la password: ");
                    pass = scn3.nextLine();

                    if(nome.equals(ut2.getUsername()) && pass.equals( ut2.getPassword())){
                        //chiama i metodi da admin
                        //cerca utenti per lavoro
                        
                    }
                    else{
                        System.out.println("Errore, non sei admin");
                    }
                    break;
                case 3:
                    //login come user 
                    //lavora utente.faix()
                    break;

            }
            System.out.println("Vuoi continuare? y/n ");
            s2 = scn2.next().charAt(0);
            if(s2 == 'y' || s2 == 'n'){
                if(s2 == 'y'){
                    ciclo = true;
                }else if(s2 == 'n'){
                    ciclo = false;
                }
            }
            else{
                System.out.println("input errato");
            }

        }while(ciclo);
        scn.close();
        scn2.close();
        scn3.close();
    }
}
