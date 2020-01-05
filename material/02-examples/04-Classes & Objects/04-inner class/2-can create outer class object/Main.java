class Outer
   {int x=5;
    void display()
       {System.out.println(" x = " + x);
       }
    void foo()
       {Inner t = new Inner();
        t.display();
       }
    class Inner
       {void fun() 
           {Outer t = new Outer();
             t.display();
           }
        void display()
           {System.out.println(" x = " + x);
           }
       }
   }

class Main
 {public static void main(String args[]) throws Exception
   {Outer t = new Outer();
    t.foo(); // x = 5
    Outer.Inner h = t.new Inner();
    h.fun(); // x = 5
    System.out.println();
   }
 }
