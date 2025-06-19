/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pratikumkedua27052025;

/**
 *
 * @author laptop
 */
public class Gitar extends AlatMusik {
    private final int jumlahSenar;

    public Gitar(String nama, String jenis, int jumlahSenar) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    public void mainkan() {
        System.out.println("Memetik gitar " + nama + " dengan " + jumlahSenar + " senar.");
    }

    @Override
    public void stem() {
        System.out.println("Menyetem gitar " + nama + " secara manual.");
    }
    
}
