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
public class PesawatDemo {

    public static void main(String[] args) {
      Pesawat p = new Pesawat("Boeing",2015,true,120);
      p.cetak();

      System.out.println("Setelah reset");
      p.reset("Airbus",2020,false,200);
      p.cetak();      
        
    }
    
}
