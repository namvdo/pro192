/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;
import java.util.*;
/**
 *
 * @author Kudo
 */
public class Invoice implements Comparable <Invoice>, Comparator<Invoice>{
    String name;
    int total;

    public Invoice(String name, int total) {
        this.name = name;
        this.total = total;
    }

    public String getName() {
        return this.name;
    }

    public int getTotal() {
        return this.total;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String toString() {
        return this.name + " " + this.total;
    }

    @Override
    public int compare(Invoice a, Invoice b) {
        return a.getName().compareTo(b.getName());
    }
    
 
    public int compareTo(Invoice x){
        return this.getTotal() - x.getTotal();
    }


}
