/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



/**
 *
 * @author LAHIRU LAKSHAN
 */
public class DBConnection {

    
    public static Connection connect(){
          Connection conn = null;
          
          try{
              Class.forName("com.mysql.jdbc.Driver");
              conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
          } catch (Exception e){
              JOptionPane.showMessageDialog(null, e);
          }
          
          return conn;
    
}
    
    
    
 /*static Connection conn;
 static Statement stat = null;

 public static Statement getStatementConnection() {
 try {
//Establish the connection
 String url = "jdbc:mysql://localhost:3306/hotel";
 conn = DriverManager.getConnection(url, "root", "");
//Create the connection
 stat = conn.createStatement();

 } catch (Exception e) {
 e.printStackTrace();
 }
 return stat;
 }
 //Close the connection
public static void closeCon() throws SQLException {
 conn.close();
 }*/
    
    
 }
