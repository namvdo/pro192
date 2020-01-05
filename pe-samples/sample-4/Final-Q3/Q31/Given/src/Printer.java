/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class Printer {
    double price;
    String name;
    public Printer() {}
    public Printer(String name, double price){
        this.price = price;
        this.name = name;
    }
    public String getName() { return this.name; }
    public double getPrice() { return this.price; }
    public String toString() { return this.name + " " + this.price; }
}
