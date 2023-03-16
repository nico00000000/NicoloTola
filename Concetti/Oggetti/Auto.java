package Concetti.Oggetti;
public class Auto{
    public static void main(String[] args){
        Auto ogg1 = new Auto();
        Auto ogg2 = new Auto();

        ogg1.VelMax(3);
        ogg2.VelMax(3, "urbana");
    }

    public void VelMax(int x){
        System.out.println("La velocità massima è: " + x + "\n");
    }

    public void VelMax(int x, String s){
        System.out.println("La velocità massima è: " + x + " nel tipo di strada: " + s + "\n");
    }
}