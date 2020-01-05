interface A
 {int x=2;//final by default
  void fun();
  // void fan() {};/*ERROR*/
  void foo();
 }
public class Main
 {public static void main(String[] args)
   {
    System.out.println(A.x);
    // A.x = 10;/*ERROR*/
    System.out.println();
   }
}
