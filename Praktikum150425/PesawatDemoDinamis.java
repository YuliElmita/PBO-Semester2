/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum150425;

import java.util.Scanner;

public class PesawatDemoDinamis {
    
      

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int i,jumlah,tahunProduksi,muatan;
       boolean mesin;
       String nama;
       String namaMax; //pesawat dengan muatan max
       int besar; //untuk menampung pswt muatan max
       System.out.print("Masukkan banyak pesawat = ");
       jumlah=input.nextInt();
       input.nextLine();
       
       //deklarasi array
       Pesawat[] daftarPesawat= new Pesawat[jumlah];
       
       //isi array
       for(i=0;i<jumlah;i++){
           System.out.println("Input pesawat ke "+(i+1));
           System.out.print("Nama pesawat = ");
           nama=input.nextLine();
           System.out.print("Tahun produksi = ");
           tahunProduksi=input.nextInt();
           System.out.print("Menggunakan mesin ? (true /false) = ");
           mesin=input.nextBoolean();
           System.out.print("Kapasitas muatan penumpang maksimum = ");
           muatan= input.nextInt();
           
           input.nextLine();
           
           daftarPesawat[i]=new Pesawat(nama,tahunProduksi,mesin,muatan);
           
       }   
       System.out.println("\n\n DATA PESAWAT \n\n");
       System.out.println("Data Pesawat ke 1 adalah");
       daftarPesawat[0].cetak();
       System.out.println();
       besar = daftarPesawat[0].getMuatan();
       namaMax= daftarPesawat[0].getNama();
       
       for(i=1;i<jumlah;i++){
           System.out.println("Data Pesawat ke "+(i+1)+ " adalah");
           daftarPesawat[i].cetak();
           if(daftarPesawat[i].getMuatan()>besar){
               besar=daftarPesawat[i].getMuatan();
               namaMax=daftarPesawat[i].getNama();
           }          
           System.out.println();
       }
       
       System.out.println("Pesawat dengan muatan terbanyak adalah "+namaMax);
       System.out.println("dengan kapasitas maksimum "+besar+ " orang");
       
        
    }
    
}
