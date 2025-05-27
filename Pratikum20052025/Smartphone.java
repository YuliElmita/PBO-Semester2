/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum20052025;

/**
 *
 * @author laptop
 */
public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;

    // Konstruktor default
    public Smartphone() {
        super();
    }

    // Getter dan Setter untuk kapasitasBaterai
    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    // Getter dan Setter untuk jumlahKamera
    public int getJumlahKamera() {
        return jumlahKamera;
    }

    public void setJumlahKamera(int jumlahKamera) {
        this.jumlahKamera = jumlahKamera;
    }
}
