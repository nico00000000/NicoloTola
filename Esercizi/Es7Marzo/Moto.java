package Esercizi.Es7Marzo;

class Moto extends Veicolo{
    double Cilindrata, Potenza;
    String tipologia;
    
    Moto(double Cilindrata, double Potenza, String tipologia, String Marca, String Modello, int AnnoDFab){
        super(Marca, Modello, AnnoDFab);
        this.Cilindrata = Cilindrata;
        this.Potenza = Potenza;
        this.tipologia = tipologia;
    }

    //getter 

    double getCilindrata(){
        return this.Cilindrata;
    }

    double getPotenza(){
        return this.Potenza;
    }

    String getTipologia(){
        return this.tipologia;
    }

    //setter 
    
    void setCilindrata(double Cilindrata){
        this.Cilindrata = Cilindrata;
    }

    void setPotenza(double Potenza){
        this.Potenza = Potenza;
    }

    void setTipologia(String tipologia){
        this.tipologia = tipologia;
    }
}

/*Definisci una sottoclasse "Moto" che estenda la classe "Veicolo" e che contenga le seguenti proprietà:
Cilindrata
Tipologia (sportiva, stradale, etc.)
Potenza
Per ogni classe, definisci il costruttore e i metodi getter e setter per ogni proprietà.*/