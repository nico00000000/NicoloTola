package Esercizi.es6Marzo;

import java.util.ArrayList;

public class anfibi extends animale{
    private ArrayList<String> nome = new ArrayList<String>();
    ArrayList<Integer> eta = new ArrayList<Integer>(); 
    int Nanimali;

    public void setNome(String nome, Integer eta){
        this.nome.add(nome);
        this.eta.add(eta);
        this.Nanimali ++;
    }

    //getter

    public String getNome(int index){
        return this.nome.get(index);
    }

    public void verso(){
        System.out.println("ciao");
    }

    public void numerovite(){
        nVite = 54;
        System.out.println(nVite);
    }
}