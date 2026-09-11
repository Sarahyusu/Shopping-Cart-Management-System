/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;
/**
 *
 * @author sara
 */

    public class Projector extends Device {
    private int lumens;

    public Projector(String name, double price, int availableCopies,
                     String brand, int warrantyMonths, int lumens) {
        super(name, price, availableCopies, brand, warrantyMonths);
        this.lumens = lumens;
    }

    public int getLumens() {
        return lumens;
    }

    public void setLumens(int lumens) {
        this.lumens = lumens;
    }

    @Override
    public String toString() {
        return "[Projector] " + super.toString() + " | Lumens: " + lumens;
    }
}

