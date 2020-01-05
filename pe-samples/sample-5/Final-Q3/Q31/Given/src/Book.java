
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class Book implements Comparable<Book>{
    float price;
    String name;
    public Book(){}
    public Book(String name, float price){
        this.name = name;
        this.price = price;
    }
    String getName() {
        return this.name;
    }
    float getPrice(){
        return this.price;
    }
    public String toString() {
        return this.name + " " + this.price;
    }
    public int compareTo(Book x){
        if(this.getPrice() < x.getPrice()){
            return - 1;
        }else if(this.getPrice() > x.getPrice()){
            return 1;
        }else{
            return 0;
        }
    }
    
}
