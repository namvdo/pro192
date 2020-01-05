/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author Kudo
 */
public class DessertItem {
   String name;
   public DessertItem(String name){
       this.name = name;
   }

    

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
