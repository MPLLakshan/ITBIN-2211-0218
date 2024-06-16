/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

/**
 *
 * @author LAHIRU LAKSHAN
 */
public class deleteControl {
    
    public void delete(int id){
        
        new Model.deleteDatail().delete(id);
        
    }
    
}
