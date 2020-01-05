/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_number_character;

/**
 *
 * @author Phan Ha
 */
public class Box {public static void main(String args[])
   { Integer x = 15,k; // Boxing
     int y = x;// Unboxing

     System.out.println( " y = " + y);
     k=new Integer(34);
     System.out.println( " k = " + k);
     
     System.out.println( k.compareTo(34));
     k=Integer.compare(3, 2);
     System.out.println( k);
    
   } 
 }
