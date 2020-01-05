package q1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
 public class Candy extends DessertItem {
    double price;
    double weight;
    

    public Candy(String name, double price, double weight) {
        super(name);
        this.price = price;
        this.weight = weight;
    }

    public double getCost() {
        double cost = price * weight;
        if(name.startsWith("c") || name.startsWith("C")){
            return Math.ceil(cost);
        }else{
            return Math.floor(cost);
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.price + " " + this.weight;
    }
    
}
