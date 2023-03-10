package StampaResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


public class esercizio1{
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/world";
        String dbUserName = "root";
        String password = "root";

        //String DB_DRIVER = "com.mysql.jdbc.Driver"; ovvero il connector
        try {
            Connection myConnection = DriverManager.getConnection(url, dbUserName, password);
            if(myConnection == null){
                System.out.print("connessione non stabilita");
            }
            else{
                System.out.println("connessione stabilita");
                String query = String.format("select * from world.city");
                
                PreparedStatement stm = myConnection.prepareStatement(query);
                ResultSet rs = stm.executeQuery();

                ResultSetMetaData metad = rs.getMetaData();
                int NumColonne = metad.getColumnCount();
                String NomeColonne;

                while(rs.next()){
                    for(int i= 1; i <= NumColonne; i++){
                        NomeColonne = metad.getColumnName(i);
                        System.out.print(NomeColonne + " | " + rs.getString(i) + " | ");
                    }
                    System.out.println("\n");
               }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            System.out.println();
        }
    }
}
