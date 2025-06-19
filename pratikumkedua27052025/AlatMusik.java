/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pratikumkedua27052025;

/**
 *
 * @author laptop
 */
    public abstract class AlatMusik {
    protected String nama;
    protected String jenis;

    public AlatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void info() {
        System.out.println("Nama Alat Musik : " + nama);
        System.out.println("Jenis           : " + jenis);
    }

    public abstract void mainkan();
    public abstract void stem();
}


