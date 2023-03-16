package Concetti.Oggetti;

public class getEset{
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public static void main(String[] args){
        getEset ogg = new getEset();
        
        ogg.setName("nico");
        System.out.println(ogg.getName());
    }
}