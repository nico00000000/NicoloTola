package TEST.Test1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.ResultSetMetaData;

public class metodiDB {
    static String nomeDB = "biblioteca";
    static String dbUserName = "root";
    static String password = "root";

    void creaDataB(){
        String url = "jdbc:mysql://localhost:3306";

        try {
            Connection myConnection = DriverManager.getConnection(url, dbUserName, password);
            if(myConnection == null){
                System.out.print("connessione non stabilita");
            }
            else{
                System.out.println("connessione stabilita");
                String query = String.format("create database " + nomeDB + ";");
                
                Statement stm = myConnection.createStatement();
                stm.execute(query);
                System.out.println("database creato\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void inserTabelle(){
        String url = "jdbc:mysql://localhost:3306/" + nomeDB;

        try {
            Connection myConnection = DriverManager.getConnection(url, dbUserName, password);
            if(myConnection == null){
                System.out.print("connessione non stabilita");
            }
            else{
                System.out.println("connessione stabilita");
                
                String query = String.format(
                    "create table autore(" +
                    "Nome varchar(45)," +
                        "annoNascita year," +
                        "annoMorte year," +
                        "nazione varchar(30)," +
                        "primary key(Nome));");

                Statement stm = myConnection.createStatement();
                stm.execute(query);

                String query2 = String.format(
                    "create table libro(" +
                        "titolo varchar(45)," +
                        "autore varchar(45)," +
                        "annoPubblicazione year," +
                        "foreign key (autore) references autore(Nome));");

                Statement stm2 = myConnection.createStatement();
                stm2.execute(query2);
                System.out.println("tabelle aggiunte\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void inserisciLibro(String titolo, String autore, String annoPubb){
        String url = "jdbc:mysql://localhost:3306/" + nomeDB;

        try {
            Connection myConnection = DriverManager.getConnection(url, dbUserName, password);
            if(myConnection == null){
                System.out.print("connessione non stabilita");
            }
            else{
                System.out.println("connessione stabilita");
                
                String query = String.format("insert into libro (titolo, autore, annoPubblicazione) values (" + titolo + "," + autore +"," + annoPubb +";");

                Statement stm = myConnection.createStatement();
                stm.execute(query);

                System.out.println("libro aggiunto\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void inserisciAutore(String nome, String annoN, String annoM, String nazione){
        String url = "jdbc:mysql://localhost:3306/" + nomeDB;

        try {
            Connection myConnection = DriverManager.getConnection(url, dbUserName, password);
            if(myConnection == null){
                System.out.print("connessione non stabilita");
            }
            else{
                System.out.println("connessione stabilita");
                
                String query = String.format("insert into autore (Nome , annoNascita, annoMorte, nazione) values (" + nome + "," + annoN +"," + annoM + "," + nazione + ";");

                Statement stm = myConnection.createStatement();
                stm.execute(query);

                System.out.println("libro aggiunto\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void stampaAutori(){
        String url = "jdbc:mysql://localhost:3306/" + nomeDB;

        try {
            Connection myConnection = DriverManager.getConnection(url, dbUserName, password);
            if(myConnection == null){
                System.out.print("connessione non stabilita");
            }
            else{
                System.out.println("connessione stabilita");
                
                String query = String.format("select autore.Nome from autore");

                Statement stm = myConnection.createStatement();
                ResultSet rs = stm.executeQuery(query);

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
        }
    }

    void stampaLibri(String autore){
        String url = "jdbc:mysql://localhost:3306/" + nomeDB;

        try {
            Connection myConnection = DriverManager.getConnection(url, dbUserName, password);
            if(myConnection == null){
                System.out.print("connessione non stabilita");
            }
            else{
                System.out.println("connessione stabilita");
                
                String query = String.format("select libro.titolo from libro,autore where libro.autore like " + autore + " and libro.autore like autore.Nome");

                Statement stm = myConnection.createStatement();
                ResultSet rs = stm.executeQuery(query);

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
        }
    }
}
