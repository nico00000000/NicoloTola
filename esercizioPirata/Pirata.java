package esercizioPirata;

public class Pirata extends Persona {
    String nome;

    Pirata(String nome){
        super(nome);  
        this.nome = nome;
    }
    //super.nome
    void saluta(){
        System.out.println("ciao sono un pirata");
    }

    String getNome(){
        return this.nome;
    }
}
