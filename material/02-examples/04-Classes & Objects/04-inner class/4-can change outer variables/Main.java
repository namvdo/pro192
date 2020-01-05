class Outer
  {int x=0;
   class Inner
      {//int x;
        void set()
          {x = 10;
          }
        void display()
          {System.out.println("x = " + x); 
          }
      }
  void display()
      {System.out.println("x = " + x);
      }
  }

public class Main
 {public static void main(String [] args)
   {
    Outer t = new Outer();
    Outer.Inner h = t.new Inner();
    h.set();
    h.display(); // x = 10
    t.display();  // x = 10
    System.out.println();
   }
 }
