/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum110325;

/**
 *
 * @author LABP2COMDOSEN
 */
public class Kendaraan {
    String jenis;
    String merk;
    int tahun;
    String warna;
    
    //constructor
    public Kendaraan(String j,String m, int t, String w){
        this.jenis=j;
        this.merk=m;
        this.tahun=t;
        this.warna=w;
    }
    //method tanpa parameter
    public void InfoKendaraan(){
        System.out.println("\n\t DATA KENDARAAN");
        System.out.println("Jenis kendaraan = "+jenis);
        System.out.println("Merk kendaraan  = "+merk);
        System.out.println("Warna kendaraan = "+warna);
        System.out.println("Tahun keluaran  = "+tahun);
    }
    // method dengan parameter
    public void CekHarga(int harga){
        System.out.println("Harga sewa kendaraan Rp "+harga);
    }
    
    public void CekKendaraan(int v){
       if(v<20)
           System.out.println("Lebih baik jalan saja");
        else if(v<=40)
           System.out.println("Kendaraan anda Slow");
       else if(v<=60)
           System.out.println("Kecepatannya Medium");
       else if(v<=85)
           System.out.println("Kecepatannya Fast");
       else
           System.out.println("Racinng!!!!!");
    }
            
            
    
    
}
