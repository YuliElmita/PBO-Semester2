/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum150425;

/**
 *
 * @author LABP2COMDOSEN
 */
public class HewanDemo {
    public static void main(String[] args){
        ///buat objek
        Hewan hewanumum = new Hewan("Makhluk hidup");
        Kucing kucingku = new Kucing("Bobby");
        Anjing anjingku = new Anjing("Timmy");
        
        hewanumum.tampilkanNama();
        hewanumum.Suara();
        
        System.out.println();
        kucingku.tampilkanNama();
        kucingku.Suara();
        System.out.println();
        anjingku.tampilkanNama();
        anjingku.Suara();
        
    }
}
