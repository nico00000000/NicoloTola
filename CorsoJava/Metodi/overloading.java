//import java.util.java;

public class overloading {
    public static int id;
    //fai input e chiama metodi
    public static void main(String[] args){
        overloading(1, "ciao");
        overloading(22, "ciaoo", "ciaoo");
        overloading(22, "ciaoo", "ciaoo", "ciaooo");
    }
    public static void overloading(int id, String desc){
        System.out.println(id + " " + desc);
    }

    public static void overloading(int id, String desc, String desc2){
        System.out.println(id + " " + desc + " " + desc2);
    }

    public static void overloading(int id, String desc1, String desc2, String desc3){
        System.out.println(id + " " + desc1 + " " + desc2 + " " + desc3);
    }
}