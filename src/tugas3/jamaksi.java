/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Ndunh
 */
public class jamaksi {
    public static void main(String[] args) {
       jam j = new jam();

       j.setMerk("Rolex");
       j.setWarna("Hitam");
       j.setHarga(3000);
       //gak bisa j.setbahanjamtangan();
       
       j.cetakinfo();
       
       System.out.print("Merknya \t");
       System.out.println(j.getMerk());
       System.out.print("Warnanya \t");
       System.out.println(j.getWarna());
       System.out.print("Harganya \t");
       System.out.println(j.getHarga());
       
       jamtangan jt = new jamtangan();
       jt.setMerk("Guess");
       jt.setWarna("Merah");
       jt.setHarga(5000);
       jt.setBahanjamtangan("Plastik");
       jt.cetakinfo();
       System.out.println("bahan \t:"+jt.getBahanjamtangan());
       jt.throttle();
    }
}
