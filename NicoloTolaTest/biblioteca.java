package NicoloTolaTest;
import java.util.ArrayList;

public class Biblioteca{
    private ArrayList<String> Libro = new ArrayList<String>();
    private ArrayList<Integer> Ncopie = new ArrayList<Integer>();
    private ArrayList<Integer> Ncip = new ArrayList<Integer>(); //numero copie in prestito
    private int size;
    //getter e setter

    public String GetLibroAt(int x){ //ottieni nome libro
        return Libro.get(x);
    }

    public Integer GetNcopieAt(int x){ //ottieni numero copie
        return Ncopie.get(x);
    }

    public Integer GetNcipAt(int x){ //ottieni numero copie in prestito
        return Ncip.get(x);
    }

    public Integer GetSize(){ //ottieni la dimensione dell'array
        return size;
    }

    //setter

    public void SetLibro(String nomelibro){ //setta il nome del libro
        this. Libro.add(nomelibro);
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

    //setter con indici

    public void SetNcopieAt(int index, int lip){ //setta numero copie con index specifico
        this.Ncopie.set(index, lip);
    }

    public void SetNLipAt(int index, int lip){ //setta numero libri in prestito con index specifico
        this.Ncopie.set(index, lip);
    }

    //elimina elemento

    public void DelLibro(int x){
        this.Libro.set(x, null);
        this.Ncopie.set(x, 0);
        this.Ncip.set(x, 0);
    }
    
}
