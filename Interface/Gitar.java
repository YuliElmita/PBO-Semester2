/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Indri Rahmayuni
 */
public class Gitar extends AlatMusik {
    private int jumlahSenar;

    public Gitar(String nama, String jenis, int jumlahSenar) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    public void mainkan() {
        System.out.println(nama + " dipetik dengan " + jumlahSenar + " senar.");
    }

    @Override
    public void stem() {
        System.out.println("Menyetem gitar " + nama + " secara manual.");
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }
}

