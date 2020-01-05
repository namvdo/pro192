/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_number_character;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Phan Ha
 */
public class Systerm_in_read 
{public static void main(String args[]) throws IOException 
   {char ch;
    System.out.print("\n Enter a character = ");
    ch = (char) System.in.read();
    System.out.println(" A charater entered is: " + ch);
   }
 }
