package Esercizi.es9marzo.primoes;

public class Piatto{
    private String Chef, Ingredienti;

    Piatto(String Chef, String Ingredienti){
        this.Chef = Chef;
        this.Ingredienti = Ingredienti;
    }

    //getter

    String getChef(){
        return this.Chef;
    }

    String getIngredienti(){
        return this.Ingredienti;
    }

    //setter senza indice

    void addChef(String Chef){
        this.Chef = Chef;
    }

    void addIngredienti(String Ingredienti){
        this.Ingredienti = Ingredienti;
    }
}
