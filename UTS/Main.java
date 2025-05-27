/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author laptop
 */
public class Main {
    public static void main(String[] args) {
        // Mobil
        Mobil mobil = new Mobil();
        mobil.setJmlRoda(4);
        mobil.setWarna("Merah");
        mobil.setBahanBakar("Bensin");
        mobil.setkapasitasMesin(1500);
        System.out.println("Mobil:");
        System.out.println("Jumlah Roda: " + mobil.getJmlRoda());
        System.out.println("Warna: " + mobil.getWarna());
        System.out.println("Bahan Bakar: " + mobil.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + mobil.getkapasitasMesin() + " cc");
        System.out.println();

        // Sepeda
        Sepeda sepeda = new Sepeda();
        sepeda.setJmlRoda(2);
        sepeda.setWarna("Biru");
        sepeda.setjmlSadel("1");
        sepeda.setjmlGir(6);
        System.out.println("Sepeda:");
        System.out.println("Jumlah Roda: " + sepeda.getJmlRoda());
        System.out.println("Warna: " + sepeda.getWarna());
        System.out.println("Jumlah Sadel: " + sepeda.getjmlSadel());
        System.out.println("Jumlah Gir: " + sepeda.getjmlGir());
        System.out.println();

        // Truk
        Truk truk = new Truk();
        truk.setJmlRoda(6);
        truk.setWarna("Kuning");
        truk.setMuatanMaks(10000);
        System.out.println("Truk:");
        System.out.println("Jumlah Roda: " + truk.getJmlRoda());
        System.out.println("Warna: " + truk.getWarna());
        System.out.println("Muatan Maks: " + truk.getMuatanMaks() + " kg");
        System.out.println();

        // Taksi
        Taksi taksi = new Taksi();
        taksi.setJmlRoda(4);
        taksi.setWarna("Putih");
        taksi.setTarifAwal(7000);
        taksi.setTarifPerKm(4500);
        System.out.println("Taksi:");
        System.out.println("Jumlah Roda: " + taksi.getJmlRoda());
        System.out.println("Warna: " + taksi.getWarna());
        System.out.println("Tarif Awal: Rp" + taksi.getTarifAwal());
        System.out.println("Tarif per KM: Rp" + taksi.getTarifPerKm());
        System.out.println();

        // Sepeda Listrik
        SepedaListrik sl = new SepedaListrik();
        sl.setJmlRoda(2);
        sl.setWarna("Hijau");
        sl.setjmlSadel("1");
        sl.setjmlGir(5);
        sl.setkecepatanMaks(45);
        sl.setjaraktempuh(60);
        System.out.println("Sepeda Listrik:");
        System.out.println("Jumlah Roda: " + sl.getJmlRoda());
        System.out.println("Warna: " + sl.getWarna());
        System.out.println("Jumlah Sadel: " + sl.getjmlSadel());
        System.out.println("Jumlah Gir: " + sl.getjmlGir());
        System.out.println("Kecepatan Maks: " + sl.getkecepatanMaks() + " km/jam");
        System.out.println("Jarak Tempuh: " + sl.getjaraktempuh() + " km");
    }
}