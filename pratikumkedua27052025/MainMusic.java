/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikumkedua27052025;

/**
 *
 * @author laptop
 */
public class MainMusic {
    public static void main(String[] args) {
        System.out.println("---info Gitar---");
        Gitar gitar = new Gitar("Yamaha F310", "Akustik", 6);
        gitar.info();
        gitar.stem();
        gitar.mainkan();

        System.out.println("---KEYBOARD---");
        Keyboard keyboard = new Keyboard("Casio CT-X700", "Digital");
        keyboard.info();
        keyboard.cekListrik(); 
        keyboard.nyalakan();
        keyboard.stem();
        keyboard.mainkan();
        keyboard.matikan();
    }
}


