import java.util.*;
public class Main
 {public static void main(String [] args)
   {Random r = new Random();
    int n, i, k;double x;
    n = 3; 
    System.out.println(" Using Random class with nextInt(n) method:");
    for(i=0;i<n;i++)
      { k = r.nextInt(100); // Choose value from 0 to 99
        System.out.println(k);
      }
    System.out.println(" Using Math.random() method:");
    for(i=0;i<n;i++)
      { x = Math.random(); // Choose a value in the interval [0,1) 
        System.out.println(x);
      }
    System.out.println();
   }
 }

