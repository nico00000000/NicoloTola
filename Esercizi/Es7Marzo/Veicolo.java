package Esercizi.Es7Marzo;

class Veicolo{
    String Marca, Modello;
    int AnnoDFab;

    Veicolo(String Marca, String Modello, int AnnoDFab){
        this.Marca = Marca;
        this.Modello = Modello;
        this.AnnoDFab = AnnoDFab;
    }

    //getter 

    String getMarca(){
        return this.Marca;
    }

    String getModello(){
        return this.Modello;
    }

    int getAnnoDFab(){
        return this.AnnoDFab;
    }

    //setter

    void setMarca(String Marca){
        this.Marca = Marca;
    }

    void setModello(String Modello){
        this.Modello = Modello;
    }

    void setAnnoDFab(int AnnoDFab){
        this.AnnoDFab = AnnoDFab;
    }
}

/*Definisci una classe "Veicolo" che contenga le seguenti proprietà:
Marca
Modello
Anno di fabbricazione
 */