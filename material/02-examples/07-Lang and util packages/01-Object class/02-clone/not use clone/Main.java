class A
 {int x;
   A() {}
   A(int x1) {x=x1;}
   void set(int x1) {x=x1;}
  public String toString()
   {return(""+x);
   } 
 }
public class Main
 {public static void main(String [] args)
   {A t = new A(5);
     A h = t;

     System.out.println("h = " + h); //h = 5
     t.set(10);  
     System.out.println("h = " + h); // h = 10

     System.out.println();  
   }
 }
