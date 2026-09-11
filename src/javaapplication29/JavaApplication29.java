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
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Shirt shirt     = new Shirt("White Shirt", 39.99, 10, 2, "M", "White", "Cotton");
        Socks socks     = new Socks("Sport Socks", 9.99, 10, 1, "L", "Black", 3); // تعديل 09.99 إلى 9.99
        Hat hat         = new Hat("Baseball Cap", 19.99, 10, 3, "One Size", "Blue", "Baseball");

        Printer printer = new Printer("Office Printer", 199.99, 5, "HP", 12, true);
        LapTop laptop   = new LapTop("ThinkPad", 999.00, 3, "Lenovo", 24, 16);
        Projector proj  = new Projector("Home Projector", 599.00, 4, "Epson", 36, 3000);

        System.out.println("=== Initial stock ===");
        System.out.println(shirt.getName()   + " → " + shirt.getAvailableCopies());
        System.out.println(socks.getName()   + " → " + socks.getAvailableCopies());
        System.out.println(hat.getName()     + " → " + hat.getAvailableCopies());
        System.out.println(printer.getName() + " → " + printer.getAvailableCopies());
        System.out.println(laptop.getName()  + " → " + laptop.getAvailableCopies());
        System.out.println(proj.getName()    + " → " + proj.getAvailableCopies());

        Cart cart = new Cart();
        cart.addItem(shirt);
        cart.addItem(socks);
        cart.addItem(hat);
        cart.addItem(printer);
        cart.addItem(laptop);
        cart.addItem(proj);

        cart.displayCart();
        System.out.println("Total price: $" + cart.getTotalPrice());

        System.out.println("\n=== Returning Socks ===");
        cart.removeItem(socks);
        cart.displayCart();

        System.out.println("=== Final stock ===");
        System.out.println(shirt.getName()   + " __ " + shirt.getAvailableCopies());
        System.out.println(socks.getName()   + " __ " + socks.getAvailableCopies());
        System.out.println(hat.getName()     + " __ " + hat.getAvailableCopies());
        System.out.println(printer.getName() + " __ " + printer.getAvailableCopies());
        System.out.println(laptop.getName()  + " __ " + laptop.getAvailableCopies());
        System.out.println(proj.getName()    + " __ " + proj.getAvailableCopies());
    }
}