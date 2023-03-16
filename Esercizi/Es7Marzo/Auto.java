package Esercizi.Es7Marzo;

public class Auto extends Veicolo{
    private int NdiPorte;
    private String tipoCarb;
    private double consumoMedio;
    
    Auto(int NdiPorte, String tipoCarb, double consumoMedio, String Marca, String Modello, int AnnoDFab){
        super(Marca, Modello, AnnoDFab);
        this.NdiPorte = NdiPorte;
        this.tipoCarb = tipoCarb;
        this.consumoMedio = consumoMedio;
    }

    //getter
    
    int getNdiPorte(){
        return this.NdiPorte;
    }

    double getConsumoMedio(){
        return this.consumoMedio;
    }

    String getTipoCarb(){
        return this.tipoCarb;
    }

    //setter 
    
    void setNdiPorte(int NdiPorte){
        this.NdiPorte = NdiPorte;
    }

    void setConsumoMedio(double consumoMedio){
        this.consumoMedio = consumoMedio;
    }

    void setTipoCarb(String tipoCarb){
        this.tipoCarb = tipoCarb;
    }
    
}

/*Definisci una sottoclasse "Auto" che estenda la classe "Veicolo" e che contenga le seguenti proprietà:
Numero di porte
Tipo di carburante
Consumo medio di carburante per 100 km */