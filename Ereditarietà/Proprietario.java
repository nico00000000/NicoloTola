package Ereditarietà;

public class Proprietario extends Car{
    static String prop = "nico";

    public static void main(String[] args){
        Proprietario myPro = new Proprietario();
        System.out.print(prop + " fa ");
        myPro.honk();    
    }
}
