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
public class VehicleEnkapsulasi {
    private double load;
    private double maxLoad;    
    public VehicleEnkapsulasi(){
        
    }
    public VehicleEnkapsulasi(double maxLoad){ //konstruktor
        this.maxLoad = maxLoad;
    }
    public void setMaxLoad(double maxLoad){
        this.maxLoad = maxLoad;
    }            
    public double getLoad(){ 
        return load;
    }    
    public double getMaxLoad(){
        return maxLoad;
    }    
    public boolean addLoad(double weight){
        if((load+weight)<=maxLoad){
            this.load = this.load+weight;
            return true;
        }else //load+weight>maxLoad
            return false;
        //endif
    }
}
