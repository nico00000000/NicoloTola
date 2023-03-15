package Esercito;

public class soldato extends esercito{
    private String nome;
    private int annoDiNascita;
    private boolean forzeSpec;

    //setter
    
    public void setAnnoDiNascita(int annoDiNascita) {
        this.annoDiNascita = annoDiNascita;
    }

    public void setForzespec(boolean forzeSpec) {
        this.forzeSpec = forzeSpec;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //getter

    public int getAnnoDiNascita(){
        return this.annoDiNascita;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean getForzeSpec(){
        return this.forzeSpec;
    }

    soldato(String nome, int annoDiNascita, boolean forzeSpec){
        this.nome = nome;
        this.annoDiNascita = annoDiNascita;
        this.forzeSpec = forzeSpec;
    }
}
