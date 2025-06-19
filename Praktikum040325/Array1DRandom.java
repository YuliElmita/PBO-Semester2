/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum040325;

/**
 *
 * @author LABP2COMDOSEN
 */
import java.util.Scanner;
import java.util.Random;
public class Array1DRandom {
    public static void main(String[] args) {
        int A[],n,i;
        int banyak=0;
        int jumlah=0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Masukkan banyak data : ");
        n = in.nextInt();
        A = new int[n]; //A ukuran n
        System.out.println("===Data Anda===");
        for(i=0;i<n;i++)
        {
            A[i] = rand.nextInt(100)+1;
            System.out.print(A[i]+"\t");
        }
        System.out.println();
        System.out.println("===Data Array Bernilai Genap===");
        for(i=0;i<n;i++)
        {
            ///seleksi
            if(A[i]%2==0){
                System.out.print(A[i]+"\t");
                banyak++; //banyak=banyak+1
                jumlah=jumlah+A[i];//jumlah+=A[i]
            }                
        }
        System.out.println("\nBanyak angka genap = "+banyak);
        System.out.println("Jumlah angka genap = "+jumlah);
        
    }    
}
