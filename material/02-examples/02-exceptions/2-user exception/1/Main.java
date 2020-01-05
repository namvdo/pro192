import java.util.*;
class MyException extends Exception
 {public MyException(String s)
    {super(s);
    }
 }
class Test
 {float x=0;
  public void input() throws MyException
   {Scanner h = new Scanner(System.in);
    try 
     {System.out.print(" Enter x (>=10): ");
      x = h.nextInt();
     System.out.println("hh0");
      if(x<10) throw new MyException("Sai roi");
      x=100;
     }
     catch(MyException e) {System.out.println(e.getMessage()+"hh1");}
   }
  public void display()
   {System.out.println(" x = "+x);
   }
 }
public class Main
 {public static void main(String args[])
    { Test g = new Test();
      try {g.input();} catch(Exception e) {System.out.println(e.getMessage()+"hh2");}
      g.display();    
    }
 }