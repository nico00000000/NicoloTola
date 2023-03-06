package es6.es6Marzo;

import java.util.ArrayList;

public class roditori extends animale{
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
        System.out.println("squit");
    }

    public void numerovite(){
        nVite = 4;
        System.out.println(nVite);
    }
}