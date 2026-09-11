/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.ArrayList;
/**
 *
 * @author sara
 */
public class Cart {
  private ArrayList<Item> items;
      private static int cartItemCount = 0; 
    public Cart (){
    this.items = new ArrayList<Item> ();
  
}
    public void addItem(Item item) throws Exception {
        if (item.sell()) {    
            items.add(item);
            cartItemCount++;
}
    }
     public void removeItem(Item item) {
        if (items.remove(item)) {
            item.returnItem();           
            cartItemCount--;

}
     }
      public void displayCart() {
        System.out.println("_____Cart______");
        if (items.isEmpty()) {
            System.out.println("Cart is empty");
        } else {
            for (Item item : items) {
                System.out.println(item); 
            }
        }
        System.out.println("Items in cart : " + items.size());
        System.out.println("Total items in carts  : " + cartItemCount);
        System.out.println("Total objects created : " + Item.getTotalItemsCreated());
        
    }

    public double getTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();   
        }
        return total;
    }
}
