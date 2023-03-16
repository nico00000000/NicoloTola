package TEST.NicoloTolaTest13;

public class Aereo {
    private String nome;
    private int numPosti;
    private double carico;
    
    //getter
    int getNposti(){
        return this.numPosti;
    }

    double getCarico(){
        return this.carico;
    }

    String getNome(){
        return this.nome;
    }

    //setter 

    void setNposti(int numPosti){
        this.numPosti = numPosti;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setCarico(double carico){
        this.carico = carico;
    }

    void Visualizza(){
        
    }

    @Override
    public String toString() {
        return ("nome" + this.nome ); //da finire
    }
}
