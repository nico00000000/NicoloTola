package Esercizi.lezione15;
    
interface Animal{
    public void animalSound();
    public void sleep();
}

class Pig implements Animal{
    public void animalSound(){
        System.out.println("wee");
    }

    public void sleep(){
        System.out.println("zzz");
    }
}

public class esinterfaccia {
    public static void main(String[] args) {
        Pig mypig = new Pig();
        mypig.animalSound();
        mypig.sleep(); 
    }
}

