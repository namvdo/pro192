class A
 {int x = 5;
  void display()
   {System.out.println(" x = " + x);
   }
 }
class B extends A
 {int x = 100;
  void display()
   {System.out.println(" x = " + x);
   }

 }
public class Main
 {public static void main(String args[])
   {A t = new B();
    t.display();// display() in B
    System.out.println();
   }
 }
