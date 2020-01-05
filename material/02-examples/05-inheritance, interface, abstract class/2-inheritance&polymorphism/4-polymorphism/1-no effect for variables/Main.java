class A
 {int x = 5;
 }
class B extends A
 {int x = 100;
  int y;
 }
public class Main
 {public static void main(String args[])
   {A t = new B();
    System.out.println(" t.x = " + t.x); // x in A is displayed
    //t.y = 30; /*ERROR*/
    System.out.println();
   }
 }
