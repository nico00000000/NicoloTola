package es9marzo.CalcolatriceTryCatch;

public class calcolatrice {
    double[] risultati = {0,0,0,0};
    int cont = 0;

    double moltiplicazione(double x, double y){
        return x*y;
    }

    double radice(double x){
        return Math.sqrt(x);
    }

    double divisione(double x, double y){
        return x/y;
    }

    void Aggiungi(double ris){
        try {
            risultati[cont] = ris;
        } catch (Exception e) {
            System.out.println("errore array, risultato non aggiunto");
        }finally{
            cont++;
        }

    }
}
