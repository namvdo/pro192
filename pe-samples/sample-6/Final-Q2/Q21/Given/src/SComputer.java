/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class SComputer extends Computer {
    String series;
    public SComputer(String s, String n, String c, double p){
        super(n, c, p);
        this.series = s;
    }
    public double getSalePrice() {
        if(series.charAt(series.length() - 1) == 'A' || series.charAt(series.length() - 1) == 'a'){
            return price - price * 0.05;
        }
        return price - price * 0.1;
    }
    public String toString() { return this.name + "\t" + this.price + "\t" + this.color + "\t" + this.series;}
}
