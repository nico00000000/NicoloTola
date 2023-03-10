package InnerClass.EsLibreria2;
public class libreria {
    private int libroNum;
    
    class libro{
        private String genere;

        //getter

        String getGenere(){
            return this.genere;
        }

        //setter

        void setGenere(String genere){
            this.genere = genere;
        }
    }

    libreria(String Gen){
        libro book = new libro();
        book.genere = Gen;
        this.libroNum++;
    }
}