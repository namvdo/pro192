class Outer
 {int x=5;
    void display() {System.out.println(" outside x = " + x);}
  class Inner
   {//int x=10;
    void display() {System.out.println(" inside x = " + x);}
   }
 }
class Main
 {public static void main(String args[]) throws Exception
   {Outer t = new Outer();
    Outer.Inner h = t.new Inner();
    t.display(); // outside x = 5   
    h.display(); // inside x = 5  
    System.out.println();
   }
 }
