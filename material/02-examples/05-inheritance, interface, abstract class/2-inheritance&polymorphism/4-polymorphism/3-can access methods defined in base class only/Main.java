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
  void fun()
   {System.out.println("This is fun function in super class");
   }
 }
public class Main
 {public static void main(String args[])
   {A t = new B();
    t.display();// display() in B
    // t.fun(); /*Error: cannot find symbol t.fun() */
    System.out.println();
   }
 }
