public class esempioOggetti {
    int x = 55; 
    boolean y = false;
    
    public static void main(String[] args){
        esempioOggetti myObj = new esempioOggetti();
        esempioOggetti myObj1 = new esempioOggetti();

        //booleani 
        esempioOggetti myObjBool = new esempioOggetti();
        esempioOggetti myObjBool1 = new esempioOggetti();
        myObj1.x = 25;

        if(myObj.x < 50){
            myObjBool.y = false;
        }
        else{
            myObjBool.y = true;
        }

        if(myObj1.x < 50){
            myObjBool1.y = false;
        }
        else{
            myObjBool1.y = true;
        }

        System.out.println(myObj.x);
        System.out.println(myObjBool.y);
        
        System.out.println(myObj1.x);
        System.out.println(myObjBool1.y);
    }
}
