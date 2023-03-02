public class fibonacci {    
    public static void main(String[] args){
        connectFibonacci conn = new connectFibonacci("jdbc:mysql://localhost:3306/fibonacci", "root", "root");
        menuFibonacci myMenu = new menuFibonacci();
        conn.CreaConnessione();
        myMenu.Menu();
    }
}
