import java.util.*;
import java.io.*;
class A
 { int k = 1; static int x = 1;
   {k += 10; x += 10; }
    static {x += 50; }
    static {System.out.println("static block"); }
    void fun()
      {System.out.println("non-static k = " + k);
       System.out.println("static x = " + x);
      }
    static void foo()
      {System.out.println("static x = " + x);
      }

 }
class Main
  {
    public static void main(String[] args) throws Exception
       { A t, h;
         A.foo();
         h = new A();
         A.foo();

        System.out.println();
       }
  }
