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
public class Hewan {
    protected String nama;
    
    public Hewan(String nama){
        this.nama=nama;
    }
    
    public void Suara(){
        System.out.println("Suara Hewan ....");
    }
    
    public void tampilkanNama(){
        System.out.println("Nama hewan "+nama);
    }
    
    
}
