/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pratikumkedua27052025;

/**
 *
 * @author laptop
 */
public class Keyboard extends AlatMusik implements BisaDinyalakan {
    private boolean dayaTersambung;

    public Keyboard(String nama, String jenis) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }

    @Override
    public void nyalakan() {
        if (cekListrik()) {
            System.out.println(nama + "dinyalakan.");
        } else {
            System.out.println(nama + "tidak bisa dinyalakan.");
        }
    }

    @Override
    public void matikan() {
        System.out.println(nama + "dimatikan.");
    }

    @Override
    public boolean cekListrik() {
        return dayaTersambung;
    }

    @Override
    public void mainkan() {
            System.out.println(nama + "dimainkan dengan menekan tuts.");
        }

    @Override
    public void stem() {
        System.out.println("keyboard " + nama + " distem digital melalui aplikasi.");
    }
}
