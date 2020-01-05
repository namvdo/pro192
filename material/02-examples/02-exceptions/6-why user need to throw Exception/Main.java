public class Main
 {public static void main(String[] args)
   {// int k = 10/0; Throw ArithmeticException: / by zero
    double x = 10.0/0;// do not throw ArithmeticException, result is infinity
    System.out.println(" x = " + x);
   }
 }
/*
Better to write
if(b==0) throw new ArithmeticException();
  else
   x = a/b;

*/