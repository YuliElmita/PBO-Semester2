/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum20052025;

/**
 *
 * @author laptop
 */
class Elektronik {
    protected String merek;

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void info() {
        System.out.println("Ini adalah perangkat elektronik.");
    }
}

class Laptop extends Elektronik {
    @Override
    public void info() {
        System.out.println("Laptop: " + merek);
    }
}

class Smartphone extends Elektronik {
    @Override
    public void info() {
        System.out.println("Smartphone: " + merek);
    }
}

class Gaming extends Elektronik {
    @Override
    public void info() {
        System.out.println("Gaming PC: " + merek);
    }
}

class Smartwatch extends Elektronik {
    @Override
    public void info() {
        System.out.println("Smartwatch: " + merek);
    }
}

public class Main {
    public static void main(String[] args) {
        Elektronik[] perangkat = {
            new Laptop(), new Smartphone(), new Gaming(), new Smartwatch()
        };

        perangkat[0].setMerek("Asus");
        perangkat[1].setMerek("Samsung");
        perangkat[2].setMerek("Alienware");
        perangkat[3].setMerek("Apple");

        for (Elektronik e : perangkat) {
            e.info();  // Polymorphism di sini
        }
    }
}
