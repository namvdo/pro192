/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class MyMoto {
    double price;
    String address;
    int quantity;
    public MyMoto(double p, String a, int q){
        this.price = p;
        this.address = a;
        this.quantity = q;
    }
    public double getMoney() {
        double x;
        if(address.charAt(0) == 'C' || address.charAt(0) == 'c'){
            x = Math.ceil(price * quantity);
        }else{
            x = Math.floor(price * quantity);
        } 
        return x;
    }
    public String getCode(){
        String sub = address.substring(0, 3);
        if(sub.matches("\\d+")){
            return sub;
        }else{
            return address.substring(address.length() - 3);
        }
        
    }
    public String toString(){
        return this.price + " " + this.address + " " + this.quantity;
    }
}
