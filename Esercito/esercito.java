package Esercito;
import java.util.ArrayList;
public class esercito extends forzeSpeciali{
    private int Nsoldati;

    ArrayList <soldato> sold = new ArrayList<soldato>();

    public int getNsoldati() {
        return this.Nsoldati;
    }

    public void setNsoldati(int nsoldati) {
        this.Nsoldati = nsoldati;
    }

    public void inserisciSoldato(soldato ogg){
        sold.add(ogg);
        this.Nsoldati ++;
    }

    //metodi

    public void gradiSpeciali(int nsoldato){
        if(sold.get(nsoldato).getForzeSpec()){

        }
        else{
            System.out.println("impossibile accedere a questo metodo.");
        }
    }

    public void annoDiInizio(int nsoldato){
        if(sold.get(nsoldato).getForzeSpec()){
            
        }
        else{
            System.out.println("impossibile accedere a questo metodo.");
        }
    }

    public void specializzazione(int nsoldato){
        if(sold.get(nsoldato).getForzeSpec()){
            
        }
        else{
            System.out.println("impossibile accedere a questo metodo.");
        }
    }   


}