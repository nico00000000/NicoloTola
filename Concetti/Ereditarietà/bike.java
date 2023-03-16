package Concetti.Ereditarietà;

public class bike extends Veicolo { //override metodo da veicolo
    public void honk(){
        System.out.println("honk2");
    }

    public static void main(String[] args){
        bike moto = new bike();
        moto.honk();
    }
}
