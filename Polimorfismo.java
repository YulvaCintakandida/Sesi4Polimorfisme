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
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Flowers flowers1 = new Flowers ("Tulip");
        RedFlowers flowers2 = new RedFlowers ("Rose");
        YellowFlowers flowers3 = new YellowFlowers ("Sunflower");
        PinkFlowers flowers4 = new PinkFlowers ("Lotus flower");
        
        flowers1.display();
        flowers2.display();
        flowers3.display();
        flowers4.display();

    }

