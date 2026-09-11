
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
public abstract class Closing extends Item {

    private String size;
    private String color;
    public Closing(String name, double price, int availableCopies,int quatity,String size,String color){
    super(name,price,availableCopies);this.color=color;this.size=size;}

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
   @Override
 public String getCategory() {
        return "Clothing";
}
 @Override
    public String toString() {
        return super.toString() + " | Size: " + size + " | Color: " + color;
    }

}