package Oggetti;
public class costruttore {
    int anno;
    String nome, sala;
    public costruttore(String nomeFilm, int annoProd){
        nome = nomeFilm;
        anno = annoProd;
    }

    public costruttore(String nomeFilm, int annoProd, String salaPrem){
        nome = nomeFilm;
        anno = annoProd;
        sala = salaPrem;
    }

    public static void main(String[] args){
        costruttore film1 = new costruttore("sos", 2001);
        costruttore film2 = new costruttore("sos2", 2002, "sala1");
        System.out.println(film1.nome + " " + film1.anno);
        System.out.println(film2.nome + " " + film2.anno + " " + film2.sala);
    }
}
