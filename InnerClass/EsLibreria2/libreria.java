package InnerClass.EsLibreria2;

import java.util.ArrayList;

public class libreria {
    private int libroNum;
    private ArrayList<libro> list = new ArrayList<libro>();

    public ArrayList<libro> getLibri() {
        return list;
    }

    public void aggiungiLibro(libro lib) {
        list.add(lib);
    }

    void setLibroNum(){
        this.libroNum++;
    }

    class libro{
        private String genere;

        libro(String genere){
            this.genere = genere;
        }

        //getter

        String getGenere(){
            return this.genere;
        }

        //setter

        void setGenere(String genere){
            this.genere = genere;
        }

        @Override
        public String toString() {
            return ("Genere: " + this.genere);
        }
    }
    
}