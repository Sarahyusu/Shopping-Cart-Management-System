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
public class Hat extends Closing {
  private String Style ;
public Hat (String name, double price, int availableCopies,int quantity, String size,String color,String style){
        super(name,price,availableCopies,quantity,size,color);this.Style=style;}

    public void setStyle(String Style) {
        this.Style = Style;
    }

    public String getStyle() {
        return Style;
    }
 @Override
    public String toString() {
        return "[Hat] " + super.toString() + " | Style: " + Style;
    }

}




