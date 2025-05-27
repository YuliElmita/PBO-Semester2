/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan27052025;

/**
 *
 * @author laptop
 */
public class Main {
    public static void main(String[] args) {
        Pembayaran transfer = new TransferBank("BCA");
        Pembayaran ewallet = new EWallet("Dana");
        Pembayaran kartuKredit = new KartuKredit("Budi", "1234-5678-9876-5432");

        transfer.bayar(1000000);
        ewallet.bayar(250000);
        kartuKredit.bayar(500000);
    }
}