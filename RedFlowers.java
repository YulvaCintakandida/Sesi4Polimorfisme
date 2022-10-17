/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author HP 14S
 */
public class RedFlowers extends Flowers {
    String type = "Red";
    
    RedFlowers (String nama){
        super(nama);
        
    }
    
 
    void display (){
            super.display();
            System.out.println ("Type \t: " + this.type);
    }
     
}
