package Esercizi.es9marzo.primoes;
import java.util.ArrayList;

public class Ordinazione extends Piatto{
    ArrayList <Ordinazione> Ordini;
    int taglia = Ordini.size();
    private double totPrezzo;
    private double Prezzo;

    Ordinazione(String Chef, String Ingredienti, double Prezzo){
        super(Chef, Ingredienti);
        addPrezzo(Prezzo);
    }

    //getter
    double getPrezzo(){
        return this.Prezzo;
    }

    double getTotprezzo(){
        return totPrezzo;
    }

    //setter
    void addPrezzo(double Prezzo){
        this.Prezzo = Prezzo;
    }
}
