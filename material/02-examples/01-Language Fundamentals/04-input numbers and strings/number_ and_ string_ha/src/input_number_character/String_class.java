/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_number_character;
import java.util.Scanner;
/**
 *
 * @author Phan Ha
 */
public class String_class {
  public static void main(String[] args) throws Exception
   {String s = new String("0123456");
    System.out.println(s);
    System.out.println("s.charAt(3) is " + s.charAt(2));
    System.out.println("ABC1".compareTo("ABC"));
    //Chuỗi con
    System.out.println("0123456".substring(3));
    System.out.println("0123456".substring(3,6));
    System.out.println();
    String s3=" How are you";
    String delim= "[\\s]+";
    Scanner s4=new Scanner(s3);
    s4.useDelimiter(delim);
    while (s4.hasNext()) System.out.println(s4.next());
    }
}
