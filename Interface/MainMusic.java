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
public class MainMusic {
    public static void main(String[] args) {
        Gitar gitar = new Gitar("Gitar Klasik", "Petik", 6);
        Keyboard keyboard = new Keyboard("Yamaha PSR", "Elektronik", true);

        System.out.println("--- Info Gitar ---");
        gitar.info();
        gitar.mainkan();
        gitar.stem();

        System.out.println();

        System.out.println("--- Info Keyboard ---");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();
    }
}

