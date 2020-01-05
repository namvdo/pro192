class A
 {void test(){}
 }
class B extends A
 {void test() throws Exception {}
 }
public class Main
 {public static void main(String args[])
   {System.out.println();
   }
 }
/*
test() in B cannotovverride test() in A;
overridden method does throw java.lang.Exception 
*/