/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum040325;
import java.util.Scanner;
import java.util.Random;
  /**
 *
 * @author LABP2COMDOSEN
 */
public class Array2DRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int M[][], N[][],Hasil[][];
        int i,j,b,k,b2,k2;
        Scanner in=new Scanner(System.in);
        Random random=new Random();
        System.out.print("Masukkan jumlah baris matriks 1 = ");
        b=in.nextInt();
        System.out.print("Masukkan jumlah kolom matriks 1 = ");
        k=in.nextInt();
        M=new int[b][k];
        System.out.print("Masukkan jumlah baris matriks 2 = ");
        b2=in.nextInt();
        System.out.print("Masukkan jumlah kolom matriks 2 = ");
        k2=in.nextInt();
        N=new int[b2][k2];
        ///mengisi array 2 d secara random
        System.out.println("===Isi Matriks 1 ==");
        for(i=0;i<b;i++){
            for(j=0;j<k;j++){
                M[i][j]=random.nextInt(100)+1;
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
        
         System.out.println("===Isi Matriks 2 ==");
        for(i=0;i<b2;i++){
            for(j=0;j<k2;j++){
                N[i][j]=random.nextInt(100)+1;
                System.out.print(N[i][j]+"\t");
            }
            System.out.println();
        }
        
        if(b==b2 && k==k2){
            Hasil=new int[b][k];
            System.out.println("===Hasil Penjumlahan Matriks== ");
            for(i=0;i<b;i++){
                for(j=0;j<k;j++){
                    Hasil[i][j]=M[i][j]+N[i][j];
                    System.out.print(Hasil[i][j]+"\t");
                }
                System.out.println();
            }
            
        }
        else{
            System.out.println("Ukuran matriks beda, tidak bisa dijumlahkan");
        }
            
    }
    
}
