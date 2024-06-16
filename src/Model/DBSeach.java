/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author LAHIRU LAKSHAN
 */
public class DBSeach {
    
    
    
    
    public boolean check(String userName, String password) {
        Connection conn = DBConnection.connect();
        if (conn != null) {
            String sql = "SELECT * FROM login WHERE username = ? AND password = ?";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, userName);
                pst.setString(2, password);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    return true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
    
    
    
    
    
    
    
    
   /* Connection conn = null;
    ResultSet rs = null;
    PreparesStatement pst = null;
    
    
    public ResultSet searchLoggin(String usName){
        
        try {
            
           
            
            conn = DBConnection.connect();
            
            String name = usName;
            
            rs = conn.executeQuery("SELECT * FROM login WHERE username = '"+name+"'");
        } catch (Exception e) {
            
            //Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return rs;
    
   
}*/
}
