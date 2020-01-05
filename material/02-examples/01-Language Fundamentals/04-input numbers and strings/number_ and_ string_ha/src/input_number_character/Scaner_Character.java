/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_number_character;
import java.util.*;
/**
 *
 * @author Phan Ha
 */
public class Scaner_Character {public static void main(String args[])
   {Scanner s = new Scanner(System.in);
    char ch,b; String a;
    System.out.print("\n Enter a character = ");
    a = s.next();
    ch = a.charAt(0);
    System.out.println(" A charater entered is: " + ch);
  Character ch1 = new Character('a');
  System.out.println(" A charater entered is: " + ch1);
 
   }
 }
