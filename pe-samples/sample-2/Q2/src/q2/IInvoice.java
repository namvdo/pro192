/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.util.ArrayList;

/**
 *
st * @author Kudo
 */
public interface IInvoice {
     public String f1(ArrayList<Invoice> a, int st);        
   
    /*
     * calculate and return number of books in the list "a" which
     * have price greater than or equals to the given price (given
     * price as input parameter)
     */
    public int f2(ArrayList<Invoice> a);
}
