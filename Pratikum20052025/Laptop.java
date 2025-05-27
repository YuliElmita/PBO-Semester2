/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum20052025;

/**
 *
 * @author laptop
 */
public class Laptop extends Elektronik {
    private int ukuranLayar;
    private int kapasitasRAM;

    // Konstruktor default
    public Laptop() {
        super(); // panggil konstruktor Elektronik (opsional)
    }

    // Getter dan Setter untuk ukuranLayar
    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    // Getter dan Setter untuk kapasitasRAM
    public int getKapasitasRAM() {
        return kapasitasRAM;
    }

    public void setKapasitasRAM(int kapasitasRAM) {
        this.kapasitasRAM = kapasitasRAM;
    }
}
