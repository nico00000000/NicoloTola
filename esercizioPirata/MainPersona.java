package esercizioPirata;

public class MainPersona {
    public static void main(String[] args){
        Pirata pir = new Pirata("nico");
        pir.saluta();
        System.out.println("il mio nome e': " + pir.getNome());
    }
}
