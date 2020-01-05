/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_number;
import java.util.*;
/**
 *
 * @author Phan Ha
 */
public class Scanner_Number
{public static void main(String args[])
   {Scanner t = new Scanner(System.in); 
     int k; float x; double y;
     System.out.print("Enter k = ");
     k = t.nextInt();
     System.out.print("Enter x = ");
     x = t.nextFloat();
     System.out.print("Enter y = ");
     y = t.nextDouble();

     System.out.println("k = " + k + ", x = " + x + ", y = " + y);

     System.out.println();
   }
 }
