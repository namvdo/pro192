class Outer
 {
  class Inner
   {   }
 }
class Main
 {public static void main(String args[]) throws Exception
   {Outer t = new Outer();
    Outer.Inner h = t.new Inner();
    System.out.println();
   }
 }
