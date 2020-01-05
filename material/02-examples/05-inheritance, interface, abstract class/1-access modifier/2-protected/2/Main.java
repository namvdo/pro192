import PA.A;
class B extends A {}
public class Main
 {public static void main(String args[])
   {A t = new A();
    //t.x=5; /*ERROR*/
    B h = new B();
    //h.x=5; /*ERROR*/
    System.out.println();
   }
 }
