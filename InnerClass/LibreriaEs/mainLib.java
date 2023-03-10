package InnerClass.LibreriaEs;
import java.util.Scanner;

class Libreria {
    int Nlibri;
    
    class Libro{
        String Genere;
    }

    void addLibro(){
        System.out.println("Inserisci il nome del libro: ");
    }

}

public class mainLib{
    public static void main(String[] args){
        Libreria libre = new Libreria();
        Libreria.Libro book = libre.new Libro();
        //da finire
    }
}
