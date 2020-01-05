class A
 {protected int x;
 }
public class Main
 {public static void main(String args[])
   {A t = new A();
    t.x=5; // Ok
    System.out.println(" x = " + t.x);
    System.out.println();
   }
 }
