package StampaResultSet;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


public class stampaRS{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/world";
        String dbUserName = "root";
        String password = "root";
        String nomeCitta, distretto, distrettoConfronto, nomeCittaTrovata, countryC;
        int cont=0, popolazione;
        boolean trovato = false;

        //String DB_DRIVER = "com.mysql.jdbc.Driver"; ovvero il connector
        try {
            Connection myConnection = DriverManager.getConnection(url, dbUserName, password);
            if(myConnection == null){
                System.out.print("connessione non stabilita");
            }
            else{
                System.out.println("connessione stabilita");
                String query = String.format("select * from world.city where city.CountryCode like 'ITA'");
                
                PreparedStatement stm = myConnection.prepareStatement(query);
                ResultSet rs = stm.executeQuery();
                ResultSetMetaData metad = rs.getMetaData();
                
                while(cont < 10){
                    System.out.println("Inserisci il nome della citta' da inserire: ");
                    nomeCitta = scn.nextLine();
                    System.out.println("Inserisci il distretto della citta' da inserire: ");
                    distretto = scn.nextLine();
                    distrettoConfronto = rs.getString("District");

                    rs.beforeFirst();
                    while (rs.next()) {
                        nomeCittaTrovata = rs.getString("Name");
                        if (nomeCittaTrovata.equalsIgnoreCase(nomeCitta)) {
                            if(distrettoConfronto.equalsIgnoreCase(distretto)){
                                trovato = true;
                            }  
                            break;
                        }
                    }

                    if (trovato) {
                        System.out.println("La città esiste già in questo distretto.");
                    }else{
                        System.out.println("Inserisci il country code della città:");
                        String countryCode = scn.nextLine();
                        System.out.println("Inserisci la popolazione:");
                        popolazione = scn1.nextInt();

                        rs.moveToInsertRow();
                        rs.updateString("Name", nomeCitta);
                        rs.updateString("CountryCode", countryCode);
                        rs.updateString("District", distretto);
                        rs.updateInt("Population", popolazione);
                        rs.insertRow();
                        rs.moveToCurrentRow();
                        System.out.println("La città è stata aggiunta.");
                    }
                    cont++;
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
