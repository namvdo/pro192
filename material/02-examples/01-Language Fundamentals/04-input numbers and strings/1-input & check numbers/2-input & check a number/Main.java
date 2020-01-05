import java.util.*;
public class Main
 {public static void main(String [] args)
   {Scanner t = new Scanner(System.in);
    int k;
    String s;
    while(true)
     {try {
        System.out.print("Enter k = ");
        k = t.nextInt();
       } catch(Exception e)
          {System.out.println(e.getMessage());
             System.out.println("Data is invalid, please reenter!");
            continue;
           }
      break;
     }
    System.out.println("An integer entered is " + k);
    System.out.println();  

   }
 }
