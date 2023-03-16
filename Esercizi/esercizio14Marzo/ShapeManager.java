package Esercizi.esercizio14Marzo;
import java.util.ArrayList;

public class ShapeManager {
    ArrayList <Shape> lista = new ArrayList<Shape>();
    
    void addShape(Shape oggetto){
        lista.add(oggetto);
    }

    void getShape(){
        int x = 0;
        for (Shape shape : lista) {
            System.out.println(lista.get(x));
            x++;
        }
    }

    @Override
    public String toString() {
        // da finire con gli elementi da 
        return ("sos");
    }

    double getTotalArea(){
        double ris = 0;
        int x = 0;
        for (Shape shape : lista) {
            ris =+ lista.get(x).getArea();
            x++;
        }
        return ris;
    }

    double getTotalPerimetro(){
        double ris = 0;
        int x = 0;
        for (Shape shape : lista) {
            ris =+ lista.get(x).getPerimetro();
            x++;
        }
        return ris;
    }

    //getshape restituisce la lista
    //getTotalArea restituisce l'area totale della lista
    //getTotalPerimetro restituisce il perimetro totale della lista

}
