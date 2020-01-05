import java.util.Scanner;
class Main
 {public static void main(String args[])
   {
     Double x = 1.23456878;
     String s = String.format("%.2f",x);
     System.out.println("x = " + s);
     System.out.printf("x = %.2f\n",x);
     System.out.println();
   }
 }
