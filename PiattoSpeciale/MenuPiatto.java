package PiattoSpeciale;
import java.util.Scanner;
public class MenuPiatto {
    public static void ScegliMenu(){
        int scelta;
        Scanner ogg = new Scanner(System.in);

        System.out.println("Scegli cosa fare\n1 visualizza ingredienti normali\n2 aggiungi ingredienti speciali\n: ");
        scelta = ogg.nextInt();

        switch(scelta){
            case 1:
                VediIngredienti();
                break;
            case 2:
                MenuSpeciale();
                break;
            default:
                System.out.println("Input errato");
                System.exit(0);
        }
        ogg.close();
    }

    public static void VediIngredienti(){
        PiattoSpecialeClass ogg = new PiattoSpecialeClass();
        //inizializza array
        ogg.ingredientiNormali.add("pane");
        ogg.ingredientiNormali.add("robas");
        //scorri array
        for (int i=0; i<ogg.ingredientiNormali.size(); i++) {
            System.out.println("Gli ingredienti sono: " + ogg.ingredientiNormali.get(i) + "\n");
        }

        System.out.println("\n Ingredienti speciali\n");
        ogg.setSize();
        int size = ogg.getSize();
        for (int i=0; i<size; i++){
            System.out.println("Gli ingredienti sono: " + ogg.getIS(i) + "\n");
        }
    }

    public static void MenuSpeciale(){
        PiattoSpecialeClass ogg = new PiattoSpecialeClass();
        //inizializza array
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        String inp;
        boolean scelta = true;
        int z;

        do {
            System.out.println("Inserisci l'ingrediente: ");
            inp = scn.nextLine();
            ogg.setIS(inp);
            System.out.println("Vuoi continuare? 1 si 2 esci: ");
            z = scn1.nextInt();
            switch(z){
                case 1:
                    scelta = true;
                    break;
                case 2:
                    scelta = false;
                    break;
                default:
                    System.out.println("input errato");
                    MenuSpeciale();
            }
        } while (scelta != false);
        scn.close();
        scn1.close();
        
        //visualizza

        ogg.setSize();
        int size = ogg.getSize();

        for (int i=0; i<size; i++){
            System.out.println("Gli ingredienti sono: " + ogg.getIS(i) + "\n");
        }
    }
}
