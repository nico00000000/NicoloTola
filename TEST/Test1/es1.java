package TEST.Test1;

public class es1 {
    
    public static void main(String[] args){
        metodiDB crea = new metodiDB();
        menuDB mymenu = new menuDB();
        crea.creaDataB();
        crea.inserTabelle();
        mymenu.menu();
    }
}

