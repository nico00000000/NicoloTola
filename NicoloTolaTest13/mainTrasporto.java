package NicoloTolaTest13;
import java.util.Scanner;
public class mainTrasporto {
    public static void main(String[] args){
        menu();
    }

    static void menu(){
        Airlane metodi = new Airlane();
        Scanner ogg = new Scanner(System.in);
        int scelta;
        System.out.println("inserisci cosa fare: ");
        scelta = ogg.nextInt();

        switch (scelta){
            case 1:
            //inserire gli input 
                metodi.AggiungiCargo(null, scelta, scelta, scelta);
                break;
            case 2:
            //input
                metodi.AggiungiPass(null, scelta, scelta, scelta);
                break;
            case 3:
                metodi.Rimuovi();
                break;
            case 4:
            //input
                metodi.carcaPerCarico();
                break;
            case 5:
            //input
                metodi.cercaPerPosti();
                break;
            default:
                System.out.println("input errato");
        }
        ogg.close();
    }
}
