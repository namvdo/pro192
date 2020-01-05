/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class Bicycle {
    float price;
    String name;
    public Bicycle(String n, float p){
        this.name = n;
        this.price = p;
    }
    String getName() { return this.name; }
    double getPrice() { return this.price; }
}
