import java.util.Scanner;
public class metodiTipizzati {
    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        Scanner oggetto = new Scanner(System.in);
        int scelta;
        System.out.println("1 intero\n2 doppio\n3 stringa\n4 booleano\nesci con qualsiasi altro numero\n: ");
        scelta = oggetto.nextInt();
        switch(scelta){
            case 1:
                System.out.println(intero());
                break;
            case 2:
                System.out.println(doppio());
                break;
            case 3:
                System.out.println(stringa());
                break;
            case 4:
                System.out.println(booleanoV());
                break;
            default:
                System.out.println("Esco dal programma");
                System.exit(0);
        }
        oggetto.close();
    }

    public static  int intero(){
        int x;
        Scanner oggetto = new Scanner(System.in);
        System.out.println("input: ");
        x = oggetto.nextInt();
        oggetto.close();
        return x;
    }

    public static  double doppio(){
        double x;
        Scanner oggetto = new Scanner(System.in);
        System.out.println("input: ");
        x = oggetto.nextDouble();
        oggetto.close();
        return x;
    }

    public static String stringa(){
        String x;
        Scanner oggetto = new Scanner(System.in);
        System.out.println("input: ");
        x = oggetto.nextLine();
        oggetto.close();
        return x;
    }

    public static boolean booleanoV(){
        boolean x;
        int scelta;
        Scanner oggetto = new Scanner(System.in);
        System.out.println("input 1 = vero\nogni altro numero = falso: ");
        scelta = oggetto.nextInt();
        if(scelta == 1){
            x = true;
        }
        else x = false;
        oggetto.close();
        return x;
    }
}
