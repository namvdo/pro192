import java.util.*;
import java.io.*;
class Outer
 {private int k = 5;
  void out_display()
    {System.out.println("k = " + k);
    }
  void out_show(Inner t)
    {System.out.println("x = " + t.x);
    }
  class Inner
    {private double x = 3.5;
     void in_fun()
       {out_display();
       }
     void in_show()
       {System.out.println("k = " + k);
       }
    }
 }
class Main
  {
    public static void main(String[] args) throws Exception
       {Outer t = new Outer();
        Outer.Inner h = t.new Inner();
         h.in_fun();
         h.in_show();
         t.out_show(h);
         System.out.println();
       }
  }
