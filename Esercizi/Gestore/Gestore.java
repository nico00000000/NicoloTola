package Esercizi.Gestore;
import java.util.ArrayList;
public class Gestore {
    ArrayList<String> valori = new ArrayList<String>();
    int size = valori.size();

    void ConvertiDouble(Double x){
        String y = x.toString();
        valori.add(y);
    }

    void ConvertiInt(Integer x){
        String y = x.toString();
        valori.add(y);
    }

    void Visualizza(){
        for(int i =0; i<size; i++){
            System.out.println(valori.get(i));
        }
    }
}
