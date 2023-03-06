package es6.es6Marzo;
import java.util.Scanner;

public class registratore {
    static felini fel1 = new felini();
    static canidi can1 = new canidi();
    static anfibi anf1 = new anfibi();
    static roditori rod1 = new roditori();

    public static void main(String[] args){
        addAnimale();
    }

    public static void addAnimale(){
        Scanner inserimento = new Scanner(System.in);
        Scanner inserimento2 = new Scanner(System.in);
        Scanner scanNome = new Scanner(System.in);
        int scelta, s2, eta;
        String nome;
        boolean ciclo = true;
        System.out.println("vuoi entrare 1 o uscire 2: ");
        scelta = inserimento.nextInt();
        if(scelta != 1){
            if(scelta == 2){
                System.out.println("addio");
                System.exit(0);
            }
        }

        fel1.numerovite();

        do{
            System.out.println("Che tipo di animale hai portato?: ");
            scelta = inserimento.nextInt();
            System.out.println("Come si chiama?: ");
            nome = scanNome.nextLine();
            System.out.println("Quanti anni ha?: ");
            eta = inserimento.nextInt();
            switch (scelta) {  
                case 1:
                    fel1.setNome(nome, eta);
                    break;
                case 2:
                    can1.setNome(nome, eta);
                    break;
                case 3:
                    anf1.setNome(nome, eta);
                    break;
                case 4:
                    rod1.setNome(nome, eta);
                    break;
                default:
                    System.out.println("input errato");
                    System.exit(0);
                    break;
                }
            System.out.println("vuoi continuare? 0 no else si");
            s2 = inserimento2.nextInt();
            if(s2 != 0){
                ciclo = true;
            }
            else{
                ciclo = false;
            }
        }while(ciclo == true);
        visualizza();
        inserimento.close();
        inserimento2.close();
        scanNome.close();
    }    

    public static void visualizza(){
        System.out.println("Oggi sono arrivati " + fel1.Nanimali + " felini. \n");
        for(int i = 0; i<=fel1.Nanimali-- ;i ++){
           System.out.println("il felino n "+ i + " si chiama "+ fel1.getNome(i) + " e ha " + fel1.eta.get(i) + " anni " + "\n");
        }

        System.out.println("Oggi sono arrivati " + can1.Nanimali + " canidi. \n");
        for(int i = 0; i<can1.Nanimali-- ;i ++){
            System.out.println("il canide n "+ i + " si chiama "+ can1.getNome(i) + " e ha " + can1.eta.get(i) + " anni " + "\n");
        }

        System.out.println("Oggi sono arrivati " + anf1.Nanimali + " anfibi. \n");
        for(int i = 0; i<anf1.Nanimali-- ;i ++){
            System.out.println("l'anfibio n "+ i + " si chiama "+ anf1.getNome(i) + " e ha " + anf1.eta.get(i) + " anni " + "\n");
        }
       
        System.out.println("Oggi sono arrivati " + rod1.Nanimali + " roditori. \n");
        for(int i = 0; i<rod1.Nanimali-- ;i ++){
            System.out.println("il roditore n "+ i + " si chiama "+ rod1.getNome(i) + " e ha " + rod1.eta.get(i) + " anni " + "\n");
        }
    }
}
