package es9marzo.CalcolatriceTryCatch;
import java.util.Scanner;

public class MenuCalc {
    Scanner scn = new Scanner(System.in);
    Scanner scn1 = new Scanner(System.in);
    calcolatrice calc = new calcolatrice();
    int scelta;
    double x,y;
    boolean ciclo;
    void menu(){
        System.out.println("Inserisci cosa fare\nMoltiplicazione 1\nRadice 2\nDivisione 3\nesci 0\n: ");
        scelta = scn.nextInt();

        switch(scelta){
            case 1:
                try{
                    System.out.println("inserisci il dividendo: ");
                    y = scn1.nextDouble();

                    System.out.println("inserisci il divisore: ");
                    x = scn1.nextDouble();
                    System.out.println(calc.moltiplicazione(y,x));
                } catch (Exception e) {
                    System.out.println("errore nell'input");    
                }
                break;
            case 2:
                try{
                    System.out.println("inserisci n: ");
                    y = scn1.nextDouble();
                    System.out.println(calc.radice(y));
                } catch (Exception e) {
                    System.out.println("errore nell'input");    
                }
                break;
            case 3:
                try{
                    System.out.println("inserisci n1: ");
                    y = scn1.nextDouble();

                    System.out.println("inserisci n2: ");
                    x = scn1.nextDouble();

                    System.out.println(calc.moltiplicazione(x,y));
                } catch (Exception e) {
                    System.out.println("errore nell'input");    
                }
                break;
                
            default:
                System.out.println("Input errato");
                System.exit(0);
        }

        System.out.println("vuoi continuare? 1: ");
        scelta = scn.nextInt();
        if(scelta != 1){
            System.exit(0);
        }
        else {
            menu();
        }
    }    
}
