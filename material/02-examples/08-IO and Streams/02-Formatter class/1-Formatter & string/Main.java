import java.util.*;
class Main
 {public static void main(String args[])
   {StringBuilder sb = new StringBuilder();
    Formatter f = new Formatter(sb);
    int a = 1234;
    int b = 5;
    f.format("PI is %25.18f!", Math.PI);
    System.out.println(sb);//The output is: PI is 3.141592653589793000!
   }
 }