/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import javaapplication29.Discount;

/**
 *
 * @author sara
 */

public class Printer extends Device implements Discount {
    private boolean isColor;   

    public Printer(String name, double price, int availableCopies,
                   String brand, int warrantyMonths, boolean isColor) {
        super(name, price, availableCopies, brand, warrantyMonths);
        this.isColor = isColor;
    }

    public boolean isColor() {
        return isColor;
    }

    public void setColor(boolean isColor) {
        this.isColor = isColor;
    }

    @Override
    public String toString() {
        return "[Printer] " + super.toString() + " | Color: " + (isColor ? "Yes" : "No");
    }
   @Override
    public double getDiscount() {
    return  getPrice()*0.15; 
    }
}
