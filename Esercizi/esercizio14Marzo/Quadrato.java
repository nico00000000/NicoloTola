package Esercizi.esercizio14Marzo;

public class Quadrato extends Shape {
    double lato;

    double getLato(){
        return this.lato;
    }
    
    double getArea(){
        double Area = lato * lato;
        return Area;
    }

    double getPerimetro(){
        double Perimetro = lato * 4;
        return Perimetro;
    }
    
}
