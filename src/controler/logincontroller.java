/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package controler;

import Model.DBSeach;
import View.LoginView;
import View.MainmenuView;
import java.sql.ResultSet;



public class logincontroller {
    
   public static void login(String usname,String pas){
        
        try {
            
            String username = null;
            String password = null;
            
            ResultSet rs = new DBSeach().searchLoggin(usname);
            
            while (rs.next()){
            
                username = rs.getString("username");
                password = rs.getString("password");
            }
            if(username !=null && password !=null){
                Object pass;
                if (password.equals(pas)) {

            
            //if(username.equals(usname) && password.equals(pas)){
            
            System.out.println("Login Succesfull");
            
            LoginView.getFrames()[0].dispose();
            
            new MainmenuView().setVisible(true);
           
            }
            
            }
        } catch (Exception e) {
        }
        
        
    }
}
*/