package StampaResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


public class stampaRS{
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
                String query = String.format("select * from italiane");
                
                PreparedStatement stm = myConnection.prepareStatement(query);

                ResultSet rs = stm.executeQuery();

                while(rs.next()){
                    String tableFormat = String.format("ID: %s | Name: %s | CountryCode: %s | District: %s | Population: %s", rs.getString(1),
                                                                                                    rs.getString(2),
                                                                                                    rs.getString(3),
                                                                                                    rs.getString(4),
                                                                                                    rs.getString(5));
                    System.out.println(tableFormat + "\n");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




/*Esercizio:
Usando jdbc recuperare e stampare una view che mostri le città
 italiane presenti nel database world, stampando la view 
sfruttando le informazioni ricavate dai metadati 
(quindi con un metodo di stampa generalizzato).*/
