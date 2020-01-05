class A
 {private int x;
  void set(int x) {this.x = x;}
  void display() {System.out.println(" x = " + x);}
 }
public class Main
 {public static void main(String args[])
   {A t = new A();
    //t.x=5; /*ERROR*/
    t.set(5);//Ok
    t.display();
    System.out.println();
   }
 }
