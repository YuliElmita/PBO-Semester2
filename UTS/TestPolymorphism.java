/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author laptop
 */
class Kendaraan {
    public void bergerak() {
        System.out.println("Kendaraan bergerak");
    }
}

class Mobil extends Kendaraan {
    @Override
    public void bergerak() {
        System.out.println("Mobil berjalan di jalan raya");
    }
}

class Truk extends Kendaraan {
    @Override
    public void bergerak() {
        System.out.println("Truk mengangkut barang");
    }
}

class Sepeda extends Kendaraan {
    @Override
    public void bergerak() {
        System.out.println("Sepeda dikayuh oleh pengendara");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        // Polymorphism: reference kelas induk, objek kelas anak
        Kendaraan k1 = new Mobil();
        Kendaraan k2 = new Truk();
        Kendaraan k3 = new Sepeda();

        // Panggil method bergerak() yang di override di subclass
        k1.bergerak();  // Output: Mobil berjalan di jalan raya
        k2.bergerak();  // Output: Truk mengangkut barang
        k3.bergerak();  // Output: Sepeda dikayuh oleh pengendara

        System.out.println();

        // Bisa juga simpan dalam array kendaraan
        Kendaraan[] daftarKendaraan = {k1, k2, k3};

        for (Kendaraan k : daftarKendaraan) {
            k.bergerak();
        }
    }
}
