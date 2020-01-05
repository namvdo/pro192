
import java.util.*;
class MyException extends Exception
 {int x;
  public MyException() {}
  public MyException(String s)
    {super(s);
    }
  public MyException(int x1)
    {x=x1;
    }
  public String getMessage()
    {return(x + " is wrong number");
}  
 }
class Test
 {int x=0;
  public void input() throws MyException
   {Scanner h = new Scanner(System.in);
    try 
     {System.out.print(" Enter number >=10: ");
      x = h.nextInt();
      if(x<10) throw new MyException(x);
      x += 100;
     }
     catch(MyException e) {System.out.println(e.getMessage());}
   }
  public void display()
   {System.out.println(" x = "+x);
   }
 }
public class Main
 {public static void main(String args[])
    { Test g = new Test();
      try {g.input();} catch(Exception e) {} // Try to input 5, then 20
      g.display();    
    }
 }