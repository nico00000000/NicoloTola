package NicoloTolaTest13;
import java.util.ArrayList;
import java.util.Scanner;

public class Airlane {
    private ArrayList <cargoPlane> listaCargo;
    private ArrayList <passengerPlane> listaPass;
    void AggiungiCargo(String nome, double carico, int Nposti, double x){
        cargoPlane cargo1 = new cargoPlane(nome, carico, Nposti, x);
        listaCargo.add(cargo1);
    }

    void AggiungiPass(String nome, double carico, int Nposti, int nservizi){
        passengerPlane pass1 = new passengerPlane(nome, carico, Nposti, nservizi);
        listaPass.add(pass1);
    }
    
    void Rimuovi(){
        Scanner ogg = new Scanner(System.in);
        int scelta,s2;
        System.out.println("aereo passeggeri (1) o cargo (2): ");
        scelta = ogg.nextInt();

        System.out.println("inserisci il numero dell'aereo da eliminare: ");
        s2 = ogg.nextInt();
        if(scelta == 1 || scelta == 2){
            if(scelta == 1){
                listaPass.remove(s2);
            }else if (scelta == 2){
                listaCargo.remove(s2);
            }
        }else{
            System.out.println("input errato");
        }
    }

    void cercaPerPosti(){ //ricerca per numero di posti
        Scanner ogg = new Scanner(System.in);
        int scelta;
        System.out.println("inserisci il numero di posti da cercare: ");
    }

    void carcaPerCarico(){ //ricerca per carico massimo
        Scanner ogg = new Scanner(System.in);
        int scelta;
        System.out.println("inserisci la capacità da cercare: ");
    }
}
