/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author LAHIRU LAKSHAN
 */
public class deleteDatail {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void delete(int id){
        
        con = DBConnection.connect();
        
        try{
            String sqlquery = "DELETE FROM details WHERE number = '"+id+"' ";
            pst = con.prepareStatement(sqlquery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "DELETED");
        }catch (Exception e){
          //  JOptionPane.showMessageDialog(null, "DELETED");
        }
    }
    
    
}
