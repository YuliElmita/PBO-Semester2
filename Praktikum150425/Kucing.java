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
public class Kucing extends Hewan{
    public Kucing(String nama){
        super(nama);
    }
    
    @Override
    public void Suara(){
       System.out.println(nama+" bersuara : Meong!!!" );
    }
    
}
