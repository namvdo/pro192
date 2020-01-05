/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class Moto {
    String name, color;
    double price;
    public Moto() {}
    public Moto(String n, String c, double p){
        this.name = n;
        this.color = c;
        this.price = p;
    }
    private String getName() {
        return this.name;
    }
    private double getPrice() {
        return this.price;
    }
    private String getColor() {
        return this.color;
    }
    public String toString() {
        return this.name + " " + this.price + " " + this.color;
    }
}
