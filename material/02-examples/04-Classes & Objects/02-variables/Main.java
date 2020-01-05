class A
 {int k; // member variable: created and destroyed with the class instance.
  static int x; /* class (static) variable: created upon class load and destroyed on class unload. Only one copy of the variable independent of class instantiation. */
final int r = 50; // constant
  void fun()
   {int y; /* automatic variable (method local variables) created upon entry into the method and destroyed at method termination. NOT automatically initialized. */
    y = 5;
    System.out.println("y = " + y);
   }
 }
class Main
 {public static void main(String args[])
   {A t = new A();
     t.k = 10;
     A.x = 20;
     System.out.println("t.k = " + t.k + ", A.x = " + A.x); // t.k = 10, A.x = 20
     System.out.println("t.r = " + t.r); // t.2 = 50
     // t.r = 50; /*ERROR*/
     t.x = 40; 
     System.out.println("t.x = " + t.x + ", A.x = " + A.x); // t.x = 40, A.x = 40
     System.out.println();
   }
 }
