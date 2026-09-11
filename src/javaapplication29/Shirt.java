
package javaapplication29;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sara
 */
public class Shirt extends Closing implements Discount {
    private String material;
    
    public Shirt(String name, double price, int availableCode,int quantity, String size, String color,String material) {
        super(name, price, availableCode,quantity, size, color);this.material= material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
 @Override
    public String toString() {
        return "[Shirt] " + super.toString() + " | Material: " + material;
    }

    @Override
    public double getDiscount() {
    return  getPrice()*0.30; 
    }

}
