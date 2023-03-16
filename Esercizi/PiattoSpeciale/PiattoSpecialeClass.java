package Esercizi.PiattoSpeciale;
import java.util.ArrayList;
public class PiattoSpecialeClass{
    //panino speciale
    private ArrayList<String> ingredientiSpeciali = new ArrayList<String>();
    private ArrayList<String> prezziSpeciali = new ArrayList<String>();
    private ArrayList<Double> prezzi = new ArrayList<Double>();
    private int size;

    //panino di sesamo
    public ArrayList<String> ingredientiNormali = new ArrayList<String>();
    public ArrayList<String> prezziNormali = new ArrayList<String>();

    public int getSize(){
        return size;
    }

    public void setSize(){
        size = ingredientiSpeciali.size();
    }

    public double getPrezzo(int x){
        return prezzi.get(x);
    }

    public void setPrezzo(double x){
        prezzi.add(x);
    }

    public String getIS(int x){
        return ingredientiSpeciali.get(x);
    }

    public void setIS(String ing){
        this.ingredientiSpeciali.add(ing);
    }

    public String getPS(int x){
        return prezziSpeciali.get(x);
    }

    public void setPS(String pr){
        this.prezziSpeciali.add(pr);
    }
}