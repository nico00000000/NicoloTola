package InnerClass.EsLibreria2;
public class libreria {
    private int libroNum;
    class libro{
        private static String genere;

        //getter

        String getGenere(){
            return libro.genere;
        }

        //setter

        void setGenere(String genere){
            libro.genere = genere;
        }
    }
    libreria(String Gen){
        libro.genere = Gen;
        this.libroNum++;
    }
    //override del metodo di default toString  
    @Override
    public String toString() {
        return ("Genere: " + libro.genere + "\nNumero di libri: " + this.libroNum + "\n");
   }
}