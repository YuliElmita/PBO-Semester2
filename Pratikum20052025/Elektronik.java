/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum20052025;

/**
 *
 * @author laptop
 */
public class Elektronik {
    private String merek;
    private int tahunProduksi;
    private int garansi;

    // Konstruktor default
    public Elektronik() {
        // Bisa diisi default values jika perlu
    }

    // Getter dan Setter untuk merek
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    // Getter dan Setter untuk tahunProduksi
    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    // Getter dan Setter untuk garansi
    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

}