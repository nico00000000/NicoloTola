package Fibonacci;
public class MetodiFibonacci {
    public void Stampanum(int numero){
        int n2 = 1, n1 = 0 ,n = 0;

        for(int i = 0; i<numero; i++){
            n = n1+n2;
            n1 = n2;
            n2 = n;
            System.out.println(n);
        }
    }

    public void Cercanum(int numero){
        int cont = 0, flag = 0 , n2 = 1, n1 = 0 ,n = 0;
        while(n<=numero && flag != 1){
                n = n1+n2;
                n1 = n2;
                n2 = n;
                cont++;
                //stampa solo se è il numero che cerco
                if(n==numero){
                    System.out.println("Numero trovato in posizione: " + cont);
                    flag = 1;
                }
            }
        if(flag!=1){
            System.out.println("Numero non trovato.");
            //Menu();
        }
    }

    public void InputFibonacci(String messaggio, int scelta){

    }
}
