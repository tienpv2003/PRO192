/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multiple_Interface;

/**
 *
 * @author PhạmVinhTiến
 */
public class Television implements VNRemote, ChinaRemote{

    @Override
    public void onDevice() {
        System.out.println("on TV");
       //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void offDevice() {
        System.out.println("off TV");
       //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void increaseVolumn(){
        System.out.println("incease Volumn");
    }
    @Override
    public void descVolumn(){
        System.out.println("descease Volumn");
    }    
    public static void main(String[] args) {
        VNRemote remote = new Television();
        remote.setLock();
        remote.onDevice();
        remote.offDevice();
        VNRemote.setTimer(10000);
        System.out.println("TV remote's price: "+ VNRemote.price);
        System.out.println("TV Remote has: "+ VNRemote.MAXofButtons + " buttons");
    }
}
