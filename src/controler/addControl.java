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
public class addControl {
    
    public void products(int number, String name, int ph, String resv){
        new Model.adModel().addProduct(number, name, ph, resv);
    }
    
    public void products1(String number, String name, String ph, String resv){
        new Model.adModel().addProduct1(number, name, ph, resv);
    }
    
    
    
}
