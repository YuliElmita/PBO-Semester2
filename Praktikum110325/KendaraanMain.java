/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum110325;

import java.util.Scanner;

/**
 *
 * @author LABP2COMDOSEN
 */
public class KendaraanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String jenis;
        String merk;
        String warna;
        int thn;
        int harga;
        int kecepatan;
        
        System.out.print("Masukkan jenis kendaraan = ");
        jenis=in.nextLine();
        System.out.print("Masukkan merk kendaraan = ");
        merk=in.nextLine();      
        System.out.print("Tahun keluaran = ");
        thn=in.nextInt();
        in.nextLine(); // pemebrsihan line utk string berikutnya
        System.out.print("Warna kendaraan = ");
        warna=in.nextLine();
        System.out.print("Harga Sewa Kendaraan = ");
        harga=in.nextInt();
        System.out.print("Kecepatan kendaraan / jam = ");
        kecepatan=in.nextInt();
        
        
        // objek baru -- class Kendaraan
        Kendaraan kend =new Kendaraan(jenis,merk,thn,warna);
        kend.InfoKendaraan();
        kend.CekHarga(harga);
        kend.CekKendaraan(kecepatan);
        System.out.println();
        
     
    }
    
}
