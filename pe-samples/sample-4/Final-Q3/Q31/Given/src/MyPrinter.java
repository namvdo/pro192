
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author macbook
 */
public class MyPrinter implements IPrinter{
    @Override
    public void f1(List <Printer> a, double price){
        Iterator <Printer> it = a.iterator();
        while(it.hasNext()){
            double x = it.next().getPrice();
            if(x <= price){
                it.remove();
            }
        }
    }
    
    public int f2(List <Printer> a, String name){
        int count = 0;
        
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                count++;
            }
        }
        return count;
        
    }
}
