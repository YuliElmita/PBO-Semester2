/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan27052025;

/**
 *
 * @author laptop
 */
public class EWallet implements Pembayaran {
    private final String namaWallet;

    public EWallet(String namaWallet) {
        this.namaWallet = namaWallet;
    }

    @Override
    public void bayar(double jumlah) {
        System.out.println("Pembayaran sebesar Rp" + jumlah + " melalui e-wallet " + namaWallet);
    }
}