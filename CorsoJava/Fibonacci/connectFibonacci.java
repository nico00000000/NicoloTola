package Fibonacci;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class connectFibonacci{
    //TODO: Singleton
    //connessione db fibonacci
    //url db fibonacci
    //driver manager
    //password db
    //statement statico con query
    //esecuzione query
    //funzione che collega con il mainFibonacci

    private String myUrl;
    private String myUser;
    private String myPassword;

    public connectFibonacci(String url, String username, String password){
        myUrl = url;
        myUser = username;
        myPassword = password; 
    }

    public Connection CreaConnessione(){
        try {
            Connection conn = DriverManager.getConnection(myUrl, myUser, myPassword);
            System.out.println(conn != null ? "Connessione riuscita" : "Connessione non riuscita");
            return conn;
        } 
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
