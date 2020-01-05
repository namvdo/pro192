/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class Motor {
    String brandName;
    double price;
    public Motor(){}
    public Motor(String brand, double p){
        this.brandName = brand;
        this.price = p;
    }
    public String getBrandName() { return this.brandName; }
    public double getPrice() { return this.price; }
    public String toString() { return this.brandName + " " + this.price; }
}
class VNMotor extends Motor{
    String series;
    public VNMotor() {}
    public VNMotor(String brandName, String series, double price){
        super(brandName, price);
        this.series =  series;
    }
    public String toString() {
        return this.brandName + " " + this.series + " " + this.price;
    }
    public double getSalePrice(){
        if(price < 3000){
            return price - (price * 0.05);
        }else{
            return price - (price * 0.1);
        }
    }
}
