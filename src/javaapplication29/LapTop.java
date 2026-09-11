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
public class LapTop extends Device {
    private int ramGB;  

    public LapTop(String name, double price, int availableCopies,
                  String brand, int warrantyMonths, int ramGB) {
        super(name, price, availableCopies, brand, warrantyMonths);
        this.ramGB = ramGB;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    @Override
    public String toString() {
        return "[Laptop] " + super.toString() + " | RAM: " + ramGB + " GB";
    }
}

    

