package TEST.NicoloTolaTest;
import java.util.Scanner;

public class MetodiBiblioteca {
    //metodi biblioteca
    static Biblioteca bib = new Biblioteca();
    
    public static void prestaLibro(){
        Scanner ogg = new Scanner(System.in);
        int l,temp;
        Visualizza();
        System.out.println("Inserisci il numero del libro che vuoi prendere in prestito");
        l = ogg.nextInt();
        //decrementa numero copie
        if(bib.GetNcopieAt(l)!=null && bib.GetNcopieAt(l)>0){
            temp = bib.GetNcipAt(l);
            bib.SetNcopieAt(l,temp--);
            //incrementa numero copie in prestito
            temp = bib.GetNcipAt(l);
            bib.SetNLipAt(l,temp++);

            System.out.println("libro preso in prestito");
        }
        else{
            System.out.println("il libro non è disponibile");
        }
        MenuBiblioteca.Menu();
        ogg.close();
    }

    public static void restituisciLibro(){
        Scanner ogg = new Scanner(System.in);
        int l,temp;

        Visualizza();

        System.out.println("Inserisci il numero del libro da restituire");
        l = ogg.nextInt();
        //controlla se il libro esiste e se è stato preso in prestito almeno una volta, se si incrementa il numero delle copie e decrementa quello delle copie in prestito
        if(bib.GetNcopieAt(l)!=null && bib.GetNcipAt(l)>0){
            temp = bib.GetNcipAt(l);
            bib.SetNcopieAt(l,temp++);
            //decerementa numero copie in prestito
            temp = bib.GetNcipAt(l);
            bib.SetNLipAt(l,temp--);

            System.out.println("libro restituito");
        }
        else{
            System.out.println("il libro non è disponibile");
        }
        MenuBiblioteca.Menu();
        ogg.close();
    }

    public static void aggiungiLibro(){
        Scanner ogg = new Scanner(System.in);
        Scanner ogg1 = new Scanner(System.in);
        String l;
        int ln;
        System.out.println("Inserisci il nome del libro da aggiungere: ");
        l = ogg.nextLine();
        bib.SetLibro(l);

        System.out.println("Inserisci il numero di libri disponibili: ");
        ln = ogg.nextInt();
        bib.SetNcopie(ln);

        bib.NLip(0); //la setto a 0 perchè essendo stata appena inserita è impossibile che ne siano già stati dati in prestito
        
        System.out.println("Libro aggiunto");  

        MenuBiblioteca.Menu();
        ogg.close();
        ogg1.close();
    }
    
    public static void rimuoviLibro(){
        Scanner ogg = new Scanner(System.in);
        int l;

        Visualizza();

        System.out.println("Inserisci il numero del libro da eliminare: ");
        l = ogg.nextInt();

        bib.DelLibro(l);
        
        System.out.println("libro eliminato");
        MenuBiblioteca.Menu();
        ogg.close();
    }

    public static void Visualizza(){
        bib.SetSize();
        int size = bib.GetSize();

        for(int i = 0; i < size; i++){
            System.out.println("Il libro numero: " + i + "è: " + bib.GetLibroAt(i) + "\n");
        }
    }
}
