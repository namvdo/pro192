/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class MyHouse implements House{
    int price;
    String address;
    public MyHouse(int price, String address){
        this.price = price;
        this.address = address;
    }
    public double getPricetoUSD() { return (double)this.price / 23000; }
    public String getCode() { 
        if(address.matches("\\d+")){
            return address.substring(0, 3);
        }
        return address.substring(address.length() - 3);
    }
    
}
