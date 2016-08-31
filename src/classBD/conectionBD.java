/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classBD;

import addressbook.NewJFrame;
import addressbook.NewJInternalFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adrian
 */
public class conectionBD {
    
    private Connection connection = null;
    private Statement statement = null;
    private Statement statementByID = null;
    private Statement statementGeneric = null;
    private Statement statementCheck = null;
    private Statement statementLast = null;
    private Statement statementNext = null;
    private Statement statementDelete = null;
    private ResultSet rs = null;
    private int numberOfRows;  
    private int lastContact;
    
    //Constructor
    public conectionBD(){        
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:src/db/contacts");
            connection.setAutoCommit(false);
            statement = connection.createStatement();            
        } catch (SQLException ex) {
            Logger.getLogger(conectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void dropDataBase(){
        try {
            statement.executeUpdate("drop table if exists contacts");
            statement.executeUpdate("CREATE TABLE \"contacts\" (\n" +
                    "    \"id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n" +
                    "    \"name\" TEXT NOT NULL,\n" +
                    "    \"surname\" TEXT NOT NULL,\n" +
                    "    \"address\" TEXT NOT NULL,\n" +
                    "    \"country\" TEXT NOT NULL\n" +
                    ")");
            connection.commit();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(conectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertNewContact(int id, String name, String surname, String address, String country){
        
        String sql = "INSERT INTO contacts (id,name,surname,address,country) "
                    + "VALUES ("+id+", '" + name + "', '" + surname + "', '" + address + "', '" + country +"');";
        System.out.println("THE SQL IS "+sql);
        try {
            statement.executeUpdate(sql);
            connection.commit();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int checkDataBase(){         
        try {
            //PROBANDO AKI
            statementCheck = connection.createStatement();
            //PROBANDO AKI
            
            rs = statementCheck.executeQuery("SELECT COUNT(*) FROM contacts");
            if(rs.getString(1).equals(""+0)){                
                numberOfRows = 1;
            }else{
                numberOfRows = (Integer.parseInt(rs.getString(1))+1);
            }       
        } catch (SQLException ex) {
            Logger.getLogger(NewJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numberOfRows;
    }
    
    public ResultSet queryNextRegister(int id){    
        try {
            statementNext = connection.createStatement();
            String sql = "SELECT * FROM contacts WHERE id > " + id + " LIMIT 1;";                     
            rs = statementNext.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(conectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;    
    }
    
    public ResultSet queryPreviousRegister(int id){
        try {
            statementNext = connection.createStatement();
            String sql = "SELECT * FROM contacts WHERE id < " + id + " LIMIT 1;";                     
            rs = statementNext.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(conectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    
    public int selectLastContact (){
        try {
            rs = statementLast.executeQuery("SELECT * FROM contacts ORDER BY id DESC LIMIT 1;");
            lastContact=Integer.parseInt(rs.getString("id"));
        } catch (SQLException ex) {
            Logger.getLogger(conectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("LAST CONTACT IS "+lastContact);
        return lastContact;
    }
    
    
    public ResultSet genericQuery(){
        try {
            rs = statementGeneric.executeQuery("SELECT * FROM contacts");
        } catch (SQLException ex) {
            Logger.getLogger(conectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet queryById(int id){
        
        try {
            statementByID = connection.createStatement();
            rs = statementByID.executeQuery("SELECT * FROM contacts WHERE ID ="+id);
        } catch (SQLException ex) {
            Logger.getLogger(conectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void update(String name, String surname, String address, String country, int id){
        String sql = "UPDATE contacts set NAME ='" + name + "', SURNAME ='"+surname+"', ADDRESS = '"+address+ "', COUNTRY = '"+country+"' where ID = " + id +";";
        try {
            statement.executeUpdate(sql);
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(conectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(int id){
        String sql = "DELETE FROM contacts WHERE ID = " + id + ";";
        try {
            statementDelete = connection.createStatement();
            statementDelete.executeUpdate(sql);
            connection.commit();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(conectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
        
}
    
    
    

