import java.util.*;
class Test<T>
  {public void display(T [] a)
    { System.out.print("\n");
      for( T x:a)
        { System.out.print("  " + x);
        }
      System.out.print("\n");
    } 
  }
class Main
   {public static void main(String args[])
        { Integer [] b = {15,12,11,24};
          Test<Integer> h  = new Test<Integer>();
           h.display(b);
        }
     }
