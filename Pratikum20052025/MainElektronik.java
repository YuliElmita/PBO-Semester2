/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum20052025;

/**
 *
 * @author laptop
 */

public class MainElektronik {
    public static void main(String[] args) {
        // Laptop
        Laptop laptop = new Laptop();
        laptop.setMerek("Asus");
        laptop.setTahunProduksi(2022);
        laptop.setGaransi(2);
        laptop.setUkuranLayar(15);
        laptop.setKapasitasRAM(16);

        System.out.println("Laptop:");
        System.out.println("Merek: " + laptop.getMerek());
        System.out.println("Tahun Produksi: " + laptop.getTahunProduksi());
        System.out.println("Garansi: " + laptop.getGaransi() + " tahun");
        System.out.println("Ukuran Layar: " + laptop.getUkuranLayar() + " inch");
        System.out.println("Kapasitas RAM: " + laptop.getKapasitasRAM() + " GB");
        System.out.println();

        // Smartphone
        Smartphone smartphone = new Smartphone();
        smartphone.setMerek("Samsung");
        smartphone.setTahunProduksi(2023);
        smartphone.setGaransi(1);
        smartphone.setKapasitasBaterai(5000);
        smartphone.setJumlahKamera(4);

        System.out.println("Smartphone:");
        System.out.println("Merek: " + smartphone.getMerek());
        System.out.println("Tahun Produksi: " + smartphone.getTahunProduksi());
        System.out.println("Garansi: " + smartphone.getGaransi() + " tahun");
        System.out.println("Kapasitas Baterai: " + smartphone.getKapasitasBaterai() + " mAh");
        System.out.println("Jumlah Kamera: " + smartphone.getJumlahKamera());
        System.out.println();

        // Gaming
        Gaming gaming = new Gaming();
        gaming.setMerek("Alienware");
        gaming.setTahunProduksi(2021);
        gaming.setGaransi(3);
        gaming.setKartuGrafis("NVIDIA RTX 3080");
        gaming.setRefreshRate(144);

        System.out.println("Gaming PC:");
        System.out.println("Merek: " + gaming.getMerek());
        System.out.println("Tahun Produksi: " + gaming.getTahunProduksi());
        System.out.println("Garansi: " + gaming.getGaransi() + " tahun");
        System.out.println("Kartu Grafis: " + gaming.getKartuGrafis());
        System.out.println("Refresh Rate: " + gaming.getRefreshRate() + " Hz");
        System.out.println();

        // Smartwatch
        Smartwatch smartwatch = new Smartwatch();
        smartwatch.setMerek("Apple");
        smartwatch.setTahunProduksi(2024);
        smartwatch.setGaransi(1);
        smartwatch.setUkuranLayar(1);
        smartwatch.setTahanAir(true);

        System.out.println("Smartwatch:");
        System.out.println("Merek: " + smartwatch.getMerek());
        System.out.println("Tahun Produksi: " + smartwatch.getTahunProduksi());
        System.out.println("Garansi: " + smartwatch.getGaransi() + " tahun");
        System.out.println("Ukuran Layar: " + smartwatch.getUkuranLayar() + " inch");
        System.out.println("Tahan Air: " + (smartwatch.isTahanAir() ? "Ya" : "Tidak"));
    }
}
