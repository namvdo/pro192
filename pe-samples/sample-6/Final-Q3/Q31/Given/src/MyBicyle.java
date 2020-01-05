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
public class MyBicyle implements IBicycle{
    public void f1(List<Bicycle> a){
        Collections.sort(a, new Comparator<Bicycle>() {
            public int compare(Bicycle a, Bicycle b){
                if(a.getPrice()  < b.getPrice()) return -1;
                else if(a.getPrice() > b.getPrice()) return 1;
                else return 0;
            }
        });
        a.remove(0);
    }
    public int f2(List<Bicycle> a, String name){
        Iterator <Bicycle> x = a.iterator();
        int count = 0;
        while(x.hasNext()){
            if(x.next().getName().toLowerCase().contains(name.toLowerCase())){
                count++;
            }
        }
        return count;
    }
}
