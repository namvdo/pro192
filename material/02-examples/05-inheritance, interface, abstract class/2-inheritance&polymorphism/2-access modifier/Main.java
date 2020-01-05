class A
 {public void test() {}
 }
class B extends A
 {void test() {}
 }
public class Main
 {public static void main(String args[])
   {System.out.println();
   }
 }
/*
test() in B cannotovverride test() in A;
attempting to assign weaker access privileges: was public 
*/