/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class MyMoto extends Moto{
    String series;
    public MyMoto(String series, String name, String color, double price){
        super(name, color, price);
        this.series = series;
    }
    public double getSalePrice(){
        if(series.indexOf('a') == series.length() - 1 || series.indexOf('A') == series.length() - 1){
            return price - (price * 0.05);
        }
        return price - price * 0.1;
    }
    public String toString(){
        return this.price + ' ' + this.color + ' ' + this.series;
    }
}
