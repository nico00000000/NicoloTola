package Concetti.Metodi;
//import java.util.java;

public class overloading {
    public static int id;
    //fai input e chiama metodi
    public static void main(String[] args){
        overl(1, "ciao");
        overl(22, "ciaoo", "ciaoo");
        overl(22, "ciaoo", "ciaoo", "ciaooo");
    }
    static void overl(int id, String desc){
        System.out.println(id + " " + desc);
    }

    static void overl(int id, String desc, String desc2){
        System.out.println(id + " " + desc + " " + desc2);
    }

    static void overl(int id, String desc1, String desc2, String desc3){
        System.out.println(id + " " + desc1 + " " + desc2 + " " + desc3);
    }
}