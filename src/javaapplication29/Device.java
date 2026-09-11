/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import javaapplication29.Item;

/**
 *
 * @author sara
 */
public abstract class Device extends Item {
 private String brand;
    private int warrantyMonths;

    public Device(String name, double price, int availableCopies,String brand, int warrantyMonths) {
        super(name, price, availableCopies); 
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getCategory() {
        return "Device";
    }

    @Override
    public String toString() {
        return super.toString() + " | Brand: " + brand + " | Warranty: " + warrantyMonths + " months";
    }
}
    

