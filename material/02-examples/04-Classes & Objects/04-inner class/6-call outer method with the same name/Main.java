import java.util.*;
import java.io.*;
class Outer
 {private int k = 5;
  void display()
    {System.out.println("k = " + k);
    }
  class Inner
    {private double x = 3.5;
     void in_fun()
       {display();
        Outer.this.display();
       }
     void display()
       {System.out.println("x = " + x);
       }
    }
 }
class Main
  {
    public static void main(String[] args) throws Exception
       {Outer t = new Outer();
        Outer.Inner h = t.new Inner();
         h.in_fun();
         System.out.println();
       }
  }
