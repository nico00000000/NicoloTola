package Esercizi.esercizioPirata;

public class Persona {
    private String nome;

    Persona(String nome){
        this.nome = nome;
    }
    void saluta(){
        System.out.println("ciao");
    }

    //getter

    String getNome(){
        return this.nome;
    }
}
