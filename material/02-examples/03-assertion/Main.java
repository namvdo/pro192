public class Main
 {static int test(int x)
   {assert x>0;
    return(x+10);
   }
  public static void main(String args[])
    {int x = 5;
     System.out.println(test(x));
     x = -5;
     System.out.println(test(x));
    }
 }