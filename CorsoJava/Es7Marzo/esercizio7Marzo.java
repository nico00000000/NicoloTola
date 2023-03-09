package Es7Marzo;
import java.util.Scanner;

public class esercizio7Marzo {
    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        Scanner scnInt = new Scanner(System.in);
        Scanner scnDou = new Scanner(System.in);
        Scanner scnStr = new Scanner(System.in);
        int scelta;
        boolean ciclo = true;

        int NdiPorte,AnnoDFab;
        String tipoCarb,Marca, Modello, tipologia;
        double consumoMedio, Cilindrata, Potenza;
        do{
            System.out.println("1 Auto \n2 Moto \nelse esci: ");
            scelta = scnInt.nextInt();
            if(scelta == 1){
                System.out.println("Inserisci il numero delle porte: ");
                NdiPorte = scnInt.nextInt();

                System.out.println("Inserisci il tipo di carburante: ");
                tipoCarb = scnStr.nextLine();

                System.out.println("Inserisci il consumo medio: ");
                consumoMedio = scnDou.nextDouble();

                System.out.println("Inserisci la marca: ");
                Marca = scnStr.nextLine();

                System.out.println("Inserisci il modello: ");
                Modello = scnStr.nextLine();

                System.out.println("inserisci l'anno di fabbricazione: ");
                AnnoDFab = scnInt.nextInt();

                Auto macchina = new Auto(NdiPorte, tipoCarb, consumoMedio, Marca, Modello, AnnoDFab);

                System.out.println("numero di porte: " + macchina.getNdiPorte() + "\ntipo di carburante: " + macchina.getTipoCarb() + "\nConsumo medio: " + macchina.getConsumoMedio() + "\nMarca: " + macchina.getMarca() + "\nModello: " + macchina.getModello() + "\nAnno di fabbricazione: " + macchina.getAnnoDFab());
            }
            if(scelta == 2){
                System.out.println("Inserisci la cilindrata: ");
                Cilindrata = scnDou.nextDouble();

                System.out.println("Inserisci la potenza: ");
                Potenza = scnDou.nextDouble();

                System.out.println("Inserisci la tipologia: ");
                tipologia = scnStr.nextLine();

                System.out.println("Inserisci la marca: ");
                Marca = scnStr.nextLine();

                System.out.println("Inserisci il modello: ");
                Modello = scnStr.nextLine();

                System.out.println("inserisci l'anno di fabbricazione: ");
                AnnoDFab = scnInt.nextInt();

                Moto mymoto = new Moto(Cilindrata, Potenza, tipologia, Marca, Modello, AnnoDFab);

                System.out.println("cilindrata: " + mymoto.getCilindrata() + "\nPotenza: " + mymoto.getPotenza() + "\nTipologia: " + mymoto.getTipologia() + "\nMarca: " + mymoto.getMarca() + "\nModello: " + mymoto.getModello() + "\nAnno di fabbricazione: " + mymoto.getAnnoDFab());

            }else if(scelta != 1 && scelta != 2){
                System.exit(0);
            }

            System.out.println("vuoi continuare? 1");
            scelta = scnInt.nextInt();
            if(scelta != 1){
                ciclo = false;
            }
            else{
                ciclo = true;
            }
        }while(ciclo == true);
        
        scnInt.close();
        scnDou.close();
        scnStr.close();
    }
}

/*
Nella classe "Main", crea almeno due oggetti di tipo "Auto" e due oggetti di tipo "Moto" con valori a tua scelta per le proprietà, 
e stampa le informazioni di ogni veicolo utilizzando i metodi getter. */