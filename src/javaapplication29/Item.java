/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sara
 */
public abstract class Item {

    private static int totalItemsCreated = 0;
    private String name;
    private double Price;
    private int availableCopies;

    public Item() {
        this("", 0.0, 0);
    }

    public Item(String name, double price, int availableCode) {
        this.Price = price;
        this.availableCopies = availableCode;
        this.name = name;
        totalItemsCreated++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double Price) throws Exception {
       if (Price < 0) {
        throw new Exception("Price cannot be negative!");
    }
    this.Price = Price;
    }

    public double getPrice() {
        return Price;
    }

    public void setAvailableCopies(int availableCode) throws Exception {
       if (availableCode < 0) {
        throw new Exception("Available copies cannot be negative!");
    }
    this.availableCopies = availableCode;
}
    
    public int getAvailableCopies() {
        return availableCopies;
    }

    public boolean sell() throws Exception {
       if (availableCopies <= 0) {
        throw new Exception("Out of stock! Cannot buy this item: " + name);
    }
    availableCopies--;
    return true;
    }

    public void returnItem() {
        availableCopies++;
    }

    public static int getTotalItemsCreated() {
        return totalItemsCreated;
    }

    public abstract String getCategory();

    @Override
    public String toString() {
        return name + " | $" + Price + " | Copies: " + availableCopies;

    }
}
