import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class esercizioJdbc {
    public static void main(String[] args){    
        /* 
        * aggiungi fibonacci
        */
        String url = "jdbc:mysql://localhost:3306/world";
        //String DB_DRIVER = "com.mysql.jdbc.Driver" ovvero il connector
    
        Connection myConnection = null;

        try {
            myConnection = DriverManager.getConnection(url, "root", "root");
            if(myConnection == null){
                System.out.print("connessione non stabilita");
            }
            else{
                System.out.println("connessione stabilita");
            
            //prova query
            //String query = String.format("SELECT * FROM city WHERE CountryCode LIKE 'ITA' AND Name LIKE 'Roma';");
            String query = String.format("select country.Name," + 
            " case when country.Population > 100000 then 'la superficie è maggiore di 100.000' when country.Population < 100000 then ' la superficie è minore di 100.000' else 'la superficie è 100.000' end," + 
            " ifnull(country.IndepYear, 'nessun indepyear') from country;");
            Statement stm = myConnection.createStatement();
            ResultSet rs=stm.executeQuery(query);

            while(rs.next()){
                String tableFormat = String.format("Name: %s | Superficie: %s | IndepYear: %s", rs.getString(1),
                                                                                                    rs.getString(2),
                                                                                                    rs.getString(3));
                
                /*String tableFormat = String.format("ID: %s | Name: %s | CountryCode: %s | District: %s | Population: %s", rs.getString(1),
                                                                                                                        rs.getString(2),
                                                                                                                        rs.getString(3),
                                                                                                                        rs.getString(4),
                                                                                                                        rs.getString(5));
                    
                */
                
                /*
                System.out.print(rs.getString(1));
                System.out.print(rs.getString(2));
                System.out.print(rs.getString(3));
                System.out.print(rs.getString(4));
                System.out.print(rs.getString(5));*/

                System.out.println(tableFormat + "\n");
            }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
