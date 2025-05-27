/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan27052025;

/**
 *
 * @author laptop
 */
public class KartuKredit implements Pembayaran {
    private String namaPemilik;
    private String nomorKartu;

    public KartuKredit(String namaPemilik, String nomorKartu) {
        this.namaPemilik = namaPemilik;
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void bayar(double jumlah) {
        System.out.println("Pembayaran sebesar Rp" + jumlah + " menggunakan kartu kredit milik " + namaPemilik);
    }
}