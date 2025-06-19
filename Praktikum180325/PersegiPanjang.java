/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum180325;

/**
 *
 * @author LABP2COMDOSEN
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public static int jumlahObjek = 0;
    
    public PersegiPanjang(){
        jumlahObjek++;
    }    
    public PersegiPanjang(int pjbaru, int lbrbaru){
        panjang = pjbaru;
        lebar = lbrbaru;
        jumlahObjek++;
    } 
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
    public int getLuas(){
        return panjang*lebar;
    }
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
}
