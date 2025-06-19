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
public interface BisaDinyalakan {
    int DAYA = 100; // dalam watt

    void nyalakan();
    void matikan();
    boolean cekListrik();
}

