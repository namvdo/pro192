abstract class A
 {int x;
  abstract void fun();
  void foo() {};
 }
// class B extends A {} /*ERROR*/
class B extends A {void fun() {}} // Ok
public class Main
 {public static void main(String[] args)
   {System.out.println();
   }
 }
