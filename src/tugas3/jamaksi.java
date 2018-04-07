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
       System.out.println("Bahan \t:"+jt.getBahanjamtangan());
       jt.throttle();
       
       jamdinding jd = new jamdinding();
       jd.setMerk("Seiko");
       jd.setWarna("Hijau");
       jd.setHarga(10000);
       jd.setBahanjamdinding("Polypropylene Plastic");
       jd.setFungsijamdinding("Sebagai Penunjuk Waktu dan Penghias Dinding");
       jd.cetakinfo();
       System.out.println("Bahan \t:"+jd.getBahanjamdinding());
       System.out.println("Fungsi \t:"+jd.getFungsijamdinding());
       
       jamweker jw = new jamweker();
       jw.setMerk("Quartz");
       jw.setWarna("Biru");
       jw.setHarga(8000);
       jw.setBahanjamweker("Stainless");
       jw.setFungsijamweker("Sebagai Penghias Meja");
       jw.setTenagajamweker("Baterai atau Listrik");
       jw.cetakinfo();
       System.out.println("Bahan \t:"+jw.getBahanjamweker());
       System.out.println("Fungsi \t:"+jw.getFungsijamweker());
       System.out.println("Tenaga \t:"+jw.getTenagajamweker());
    }
}
