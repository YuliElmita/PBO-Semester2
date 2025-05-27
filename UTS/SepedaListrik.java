/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author laptop
 */
public class SepedaListrik extends Sepeda {
    // Atribut khusus Sepeda Listrik
    private int kecepatanMaks;
    private int jarakTempuh;

    // Setter untuk kecepatanMaks
    public void setkecepatanMaks(int kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }

    // Getter untuk kecepatanMaks
    public int getkecepatanMaks() {
        return this.kecepatanMaks;
    }

    // Setter untuk jarakTempuh
    public void setjaraktempuh(int jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    // Getter untuk jarakTempuh
    public int getjaraktempuh() {
        return this.jarakTempuh;
    }
}
