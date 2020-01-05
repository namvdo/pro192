class A  implements Cloneable
 {int x;
   A() {}
   A(int x1) {x=x1;}
   void set(int x1) {x=x1;}
  public String toString()
   {return(""+x);
   } 
  public Object clone() throws CloneNotSupportedException
   {return super.clone();
   }
 }
public class Main
 {public static void main(String [] args)
   {A t = new A(5);
     A h = null;
     try {h = (A) t.clone();} catch(CloneNotSupportedException e) {}

     System.out.println("h = " + h); // h = 5
     t.set(10);  
     System.out.println("h = " + h); // h = 5

     System.out.println();  
   }
 }
