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
public class Vehicle {
    public double load;
    public double maxLoad;
    
    public Vehicle(double maxLoad){ //konstruktor
        this.maxLoad = maxLoad;
    }    
    public double getLoad(){ 
        return load;
    }    
    public double getMaxLoad(){
        return maxLoad;
    }
}
