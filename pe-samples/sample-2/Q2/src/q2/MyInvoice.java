/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class MyInvoice implements IInvoice {
    @Override
    public String f1(ArrayList<Invoice> a, int st) {
        if (st == 1) {
            Collections.sort(a, new Comparator<Invoice>() {
                public int compare(Invoice v1, Invoice v2) {
                    return v1.getName().toLowerCase().compareTo(v2.getName().toLowerCase());
                }
            });
            return a.get(1).getName();
        } else if (st == 2) {
            Collections.sort(a);
            return a.get(1).getName();
        }
        return null;
    }

    @Override
    public int f2(ArrayList<Invoice> a) {
        Collections.sort(a);
        int highestAmount = a.get(a.size() - 1).getTotal();
        int secondMax = a.get(0).getTotal();
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).getTotal() > secondMax && a.get(i).getTotal() < highestAmount){
                secondMax = a.get(i).getTotal();
            }
        }
        Iterator <Invoice> i = a.iterator();
        while(i.hasNext()){
            int s = i.next().getTotal();
            if(s == highestAmount || s == secondMax){
                i.remove();
            }
        }
        int total = 0;
        for(int j = 0; j < a.size(); j++){
            total += a.get(j).getTotal();
        }
        return total;
    };


}
