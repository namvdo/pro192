package insert;

public class Main
 {static int test(int x)
   {assert x>=0 &&x<=10:" over ";
    return(x+10);
   }
  public static void main(String args[])
    {int x = 6;
     System.out.println(test(x));
   x = 17;
     System.out.println(test(x));
    }
 }