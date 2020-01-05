interface A 
 {final int x=10;
  void show();
 }
class B implements A 
 {int y = 20;
  public void show()
   {System.out.println(" x, y = " + x + " " + y);
   }
  void foo()
   {System.out.println(" This is foo method in B ");}
 }
class C implements A 
 {int z = 30;
  public void show()
   {System.out.println(" x, z = " + x + " " + z);
   }
 }
public class Main
 {public static void main(String [] args)
   {A t;
    // t = new A();/*ERROR*/
    t = new B();
    t.show();
    t = new C();
    t.show();
    t = new A()
     {public void show()
       {System.out.println(" x = " + x);
       }
     };
    t.show();
    System.out.println(" A.x = " + A.x);
    System.out.println();
   }
 }
