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
public class updateController {
    
    public void update(int num, String name, int ph, String rs){
       
        new Model.updateData().update(num, name, ph, rs);
    }
    
    
}
