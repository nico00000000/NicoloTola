package InnerClass;

class Classefuori {
    int x = 10;

    class Classedentro{
        int y = 5;
    }
    }
    
    public class MainInner{
        public static void main(String[] args){
            Classefuori Fuori = new Classefuori();
            Classefuori.Classedentro Dentro = Fuori.new Classedentro();
            System.out.println(Dentro.y + Fuori.x);
        }
    }
