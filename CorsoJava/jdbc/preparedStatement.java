import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class preparedStatement{
    public static void main(String[] args){    
        /* 
        * NON FUNZIONA
        */
        String url = "jdbc:mysql://localhost:3306/world";
        //String DB_DRIVER = "com.mysql.jdbc.Driver" ovvero il connector
    
       

        try {
            Connection myConnection = DriverManager.getConnection(url, "root", "root");
            myConnection = DriverManager.getConnection(url, "root", "root");
            if(myConnection == null){
                System.out.print("connessione non stabilita");
            }
            else{
                System.out.println("connessione stabilita");
                String query = String.format("select country.Name," + 
                " case when country.Population > ? then 'la superficie è maggiore di 100.000' when country.Population < ? then ' la superficie è minore di 100.000' else 'la superficie è 100.000' end," + 
                " ifnull(country.IndepYear, 'nessun indepyear') from country;");
                PreparedStatement stm = myConnection.prepareStatement(query);
                stm.setInt(1, 100000);

                ResultSet rs=stm.executeQuery(query);

                while(rs.next()){
                    String tableFormat = String.format("Name: %s | Superficie: %s | IndepYear: %s", rs.getString(1),
                                                                                                    rs.getString(2),
                                                                                                    rs.getString(3));
                    System.out.println(tableFormat + "\n");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
