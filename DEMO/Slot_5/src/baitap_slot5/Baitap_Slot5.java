/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_slot5;

/**
 *
 * @author PhạmVinhTiến
 */
public class Baitap_Slot5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println("(For loop) Even number from 2 to 10: ");
        
        for(int i=1; i<=10;i++){
            if ( i%2 ==0) {
                System.out.println(i);
            }
        }
    int n = 2;
        System.out.println("(While loop) Even number from 2 to 10: ");
        while (n <= 10) {
            System.out.println(n);
            n += 2;
        }
    }

        
    }
   