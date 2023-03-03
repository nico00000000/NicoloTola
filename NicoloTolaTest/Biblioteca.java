package NicoloTolaTest;
import java.util.ArrayList;

public class Biblioteca{
    private ArrayList<String> Libro = new ArrayList<String>();
    private ArrayList<Integer> Ncopie = new ArrayList<Integer>();
    private ArrayList<Integer> Ncip = new ArrayList<Integer>(); //numero copie in prestito
    private int size;
    //getter e setter

    public String GetLibroAt(int x){
        return Libro.get(x);
    }

    public Integer GetNcopieAt(int x){
        return Ncopie.get(x);
    }

    public Integer GetNcipAt(int x){
        return Ncip.get(x);
    }

    public Integer GetSize(){
        return size;
    }

    //setter

    public void SetLibro(String nomelibro){
        this.Libro.add(nomelibro);
    }

    public void SetNcopie(int lip){ //lip = libri in prestito
        this.Ncopie.add(lip);
    }

    public void NLip(int ncip){ //NLip = numero libri in prestito
        this.Ncip.add(ncip);
    }

    public void SetSize(){
        this.size = Libro.size();
    }

    //metodi biblioteca

    public void prestaLibro(){
        
    }

    public void restituisciLibro(){
        
    }

    public void aggiungiLibro(){
        
    }
    
    public void rimuoviLibro(){
        
    }
}
