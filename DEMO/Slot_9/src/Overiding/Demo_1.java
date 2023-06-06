/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overiding;

/**
 *
 * @author PhạmVinhTiến
 */
public class Demo_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        r.setValue(5);
        System.out.println(r.toString());
        r.setValue(10, 20);
        System.out.println(r.toString());
        Box b= new Box();
        b.set(5, 10, 20);
        System.out.println(b.toString());
    }
    
}
