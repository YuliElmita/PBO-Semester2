/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan27052025;

/**
 *
 * @author laptop
 */
    public class TransferBank implements Pembayaran {
    private String namaBank;

    public TransferBank(String namaBank) {
        this.namaBank = namaBank;
    }

    @Override
    public void bayar(double jumlah) {
        System.out.println("Pembayaran sebesar Rp" + jumlah + " melalui transfer bank " + namaBank);
    }
}

