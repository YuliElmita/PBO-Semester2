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
public class AksiMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // buat object abru
        Mobil mobilku=new Mobil();
        mobilku.merk="Toyota";
        mobilku.plat="BA 1234 L";
        mobilku.tahun=2004;
        mobilku.warna="Hitam";
        System.out.println("---------------");
        System.out.println("Data Mobil 1 ");
        System.out.println("Merk mobil = "+mobilku.merk);
        System.out.println("Plat mobil = "+mobilku.plat);
        System.out.println("Tahun keluaran = "+mobilku.tahun);
        System.out.println("Warna mobil = "+mobilku.warna);
        ///pemanggilan method
        mobilku.MobilAktif(); //tanpa return
        System.out.println(mobilku.SuaraMobil()); //return
        
    }
    
}
