/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package method_thowexception;

/**
 *
 * @author Phan Ha
 */
 import java.io.*;
public class throw_error_final {
static void testException()
{try {
     System.out.println("ABC1");
   int i=0;
float t;
     if(i==0)
         throw new Error();//Exception();
     t=1/i;
     System.out.println("ABC2");
     System.out.println("ABC3");
    }
    catch(Exception e) {System.out.println("Exception");}
    finally {System.out.println("finally1");}
    System.out.println("last1");  

}
public static void main(String [] args)
{testException();
System.out.println();
}
}
    

