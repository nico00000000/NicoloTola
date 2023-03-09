package es9marzo.GestioneErrori;

public class err2 {
    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("accesso negato devi avere 18 anni");
        }else{
            System.out.println("hai eseguito l'accesso");
        }
    }

    public static void main(String[] args){
        checkAge(15);
    }
}
