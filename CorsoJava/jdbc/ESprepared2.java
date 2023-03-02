import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ESprepared2{ //da finire con: scegliere se mostrare il nome della nazione a cui fa riferimento il code
    public static void main(String[] args){    
        Scanner ogg = new Scanner(System.in); //string
        Scanner ogg1 = new Scanner(System.in); //int
        int x,y;
        String scelta, sceltaOrd = null;
        String url = "jdbc:mysql://localhost:3306/world";
        String dbUserName = "root";
        String password = "root";
        //String DB_DRIVER = "com.mysql.jdbc.Driver" ovvero il connector
    
       

        try {
            Connection myConnection = DriverManager.getConnection(url, dbUserName, password);
            if(myConnection == null){
                System.out.print("connessione non stabilita");
            }
            else{
                
                System.out.println("connessione stabilita");
                
                System.out.println("Inserisci il countryCode: ");
                scelta = ogg.nextLine();
                
                System.out.println("Inserisci la popolazione minima: ");
                x = ogg1.nextInt();

                System.out.println("Vuoi visualizzare in ordine 1 crescente o 2 decrescente?: ");
                x = ogg1.nextInt();
                switch(x){
                    case 1:
                        sceltaOrd = "asc";
                        break;
                    case 2: 
                        sceltaOrd = "desc";
                        break;
                    default:
                        System.out.println("input errato addio");
                        System.exit(0);
                }

                String query = String.format("SELECT city.Name, city.Population, city.CountryCode" +
                " FROM world.city" + 
                " WHERE city.CountryCode = ? AND city.Population >= ? " +
                "ORDER BY city.Name " + sceltaOrd + " ;");
                
                PreparedStatement stm = myConnection.prepareStatement(query);

                stm.setString(1, scelta);
                stm.setInt(2, x);

                ResultSet rs = stm.executeQuery();

                System.out.println("Vuoi visualizzare il nome della città?\n1 si\n2 no\n: ");
                x = ogg1.nextInt();
                switch(x){
                    case 1:
                        while(rs.next()){
                            String tableFormat = String.format("Name: %s | Popolazione: %s | CountryCode: %s", rs.getString(1),
                                                                                                        rs.getString(2),
                                                                                                        rs.getString(3));
                            System.out.println(tableFormat + "\n");
                        }
                        break;
                    case 2: 
                        while(rs.next()){
                            String tableFormat = String.format("Popolazione: %s | CountryCode: %s",
                                                                                                        rs.getString(2),
                                                                                                        rs.getString(3));
                            System.out.println(tableFormat + "\n");
                        }
                        break;
                    default:
                        System.out.println("input errato addio");
                        System.exit(0);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        ogg.close();
        ogg1.close();
    }
}