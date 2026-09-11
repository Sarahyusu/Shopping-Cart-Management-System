/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sara
 */package javaapplication29;
public class Socks extends Closing {
   private int pairsInPack;  

    public Socks(String name, double price, int availableCopies,int quantity, String size, String color, int pairsInPack) {
        super(name, price, availableCopies,quantity, size, color);
        this.pairsInPack = pairsInPack;
    }
    public int getPairsInPack() {
        return pairsInPack;
    }

    public void setPairsInPack(int pairsInPack) {
        this.pairsInPack = pairsInPack;
    }

   
    @Override
    public String toString() {
        return "[Socks] " + super.toString() + " | Pairs: " + pairsInPack;
    }
}

