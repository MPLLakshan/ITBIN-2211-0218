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
public class updateData {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void update(int num, String name, int ph, String rs){
        
        con = DBConnection.connect();
        
        try {
            String sqlquery = "UPDATE details SET number = '"+num+"', name = '"+name+"', phoneNum = '"+ph+"', resev = '"+rs+"' WHERE number = '"+num+"' ";
            pst = con.prepareStatement(sqlquery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULY");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
