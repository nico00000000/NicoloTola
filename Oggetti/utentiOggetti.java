package Oggetti;
import java.util.Scanner;
import java.util.ArrayList;

public class utentiOggetti {
    public static void main(String[] args){
        Menu();
    }

    public static void Menu(){
        Scanner ogg = new Scanner(System.in);
        int scelta;

        System.out.println("Scegli che operazione fare:\n1)Registra\n2)Modifica\n3)Elimina\n4)Visualizza\n0)esci\n: ");
        scelta = ogg.nextInt();

        switch(scelta){
            case 1:
                Utente.MenuRegistrazione();
                break;
            case 2:
                //modifica
                break;
            case 3:
                //elimina
                break;
            case 4:
                //visualizza
                break;
            case 0:
                System.exit(0);
            default: 
                System.out.println("input invalido riprova\n");
                Menu();
        }
        ogg.close();
    }
}



class Utente{
    static ArrayList<String> chef = new ArrayList<String>();
    static String chefCapo;
    static ArrayList<String> magazziniere = new ArrayList<String>();

    static void RegUtente(String c){
        chef.add(c);
    }

    static void RegUtente(String cCapo, String passwordCapo){
        if(chefCapo == null){
            chefCapo = cCapo;
        }
        else{
            System.out.println("Il capo è già presente");
        }
        //inserisci la password per cambiare
    }

    static void RegUtente(String m, int nPatentino){
        magazziniere.add(m);
    }

    public static void MenuRegistrazione(){
        Scanner ogg = new Scanner(System.in); //int
        Scanner ogg1 = new Scanner(System.in); //String
        int scelta = 0, np;
        String nome,password;
        System.out.println("Scegli che utente registrare:\n1)Chef\n2)Capo chef\n3)Magazziniere\n0)esci\n: ");
        scelta = ogg.nextInt();
        switch(scelta){
            case 1:
                System.out.println("Inserisci il nome dello chef: ");
                nome = ogg1.nextLine();
                Utente.RegUtente(nome);
                break;
            case 2:
                System.out.println("Inserisci il nome del capo chef: ");
                nome = ogg1.nextLine();
                System.out.println("Inserisci la password del capo chef: ");
                password = ogg1.nextLine();
                Utente.RegUtente(nome, password);
                break;
            case 3:
                System.out.println("Inserisci il nome del capo chef: ");
                nome = ogg1.nextLine();
                System.out.println("Inserisci la password del capo chef: ");
                np = ogg.nextInt();
                Utente.RegUtente(nome, np);
                break;
            case 0:
                System.exit(0);
            default: 
                System.out.println("input invalido riprova\n");
                utentiOggetti.Menu();
        }
        utentiOggetti.Menu();
        ogg.close();
        ogg1.close();
    }
}
