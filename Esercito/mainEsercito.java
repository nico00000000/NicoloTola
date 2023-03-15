package Esercito;
public class mainEsercito {
    static inputUser inp = new inputUser();
    static soldato sol;
    static esercito es = new esercito();
    public static void main(String[] args) {
        menu();
    }

    static void menu(){
        int scelta = inp.insInt("Scegli cosa fare");
        String nome;
        boolean spec;
        int anno;
    //IMPLEMENTA UTILIZZO DEI METODI DI FORZESPECIALI
        switch (scelta) {
            case 1:
                nome = inp.insString("inserisci il nome: ");
                spec = inp.insBool("Fai parte delle forze speciali? ");
                anno = inp.insInt("Inserisci l' anno di nascita: ");
                sol = new soldato(nome, anno, spec);
                //if spec == true inserisci il resto dei dati
                break;

            case 2:
                System.out.println(es.getNsoldati());
                break;

            case 3:
                
                break;
            case 0:
                System.out.println("\nfine del programma");
                System.exit(0);
            default:
                System.out.println("input errato riprova");
                break;
        }
    }
}
