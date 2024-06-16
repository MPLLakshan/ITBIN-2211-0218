/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LAHIRU LAKSHAN
 */
public class adModel {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addProduct(int number, String name, int ph, String resv){
   con = DBConnection.connect();
        
        try {
            String sqlquery = "INSERT INTO details (number, name, phoneNum, resev ) VALUES (?, ?, ?, ?)";
            pst = con.prepareStatement(sqlquery);
          
            pst.setInt(1, number);
            pst.setString(2, name);
            pst.setInt(3, ph);
            pst.setString(4, resv);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULY");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
       public void addProduct1(String number, String name, String ph, String resv){
   con = DBConnection.connect();
        
        try {
            String sqlquery = "INSERT INTO hoteldetails (roomnumber, keynumber, price, type ) VALUES (?, ?, ?, ?)";
            pst = con.prepareStatement(sqlquery);
          
            pst.setString(1, number);
            pst.setString(2, name);
            pst.setString(3, ph);
            pst.setString(4, resv);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULY");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
