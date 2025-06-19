/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author Indri Rahmayuni
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String transmisi;

    public Mobil(String merk, int tahun, int jumlahPintu, String transmisi) {
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
        this.transmisi = transmisi;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public String getTransmisi() {
        return transmisi;
    }

    public void setTransmisi(String transmisi) {
        this.transmisi = transmisi;
    }

    @Override
    public void nyalakan() {
        System.out.println("Mobil " + merk + " dinyalakan dengan kunci.");
    }

    @Override
    public void matikan() {
        System.out.println("Mobil " + merk + " dimatikan.");
    }

    @Override
    public void info() {
        System.out.println("Mobil " + merk + ", Tahun " + tahun + ", " +
                jumlahPintu + " pintu, Transmisi: " + transmisi);
    }

    @Override
    public void periksaKondisi() {
        System.out.println("Periksa oli, rem, dan tekanan ban mobil " + merk + ".");
    }

    @Override
    public void servis() {
        System.out.println("Mobil " + merk + " dijadwalkan servis setiap 10.000 km.");
    }
}

