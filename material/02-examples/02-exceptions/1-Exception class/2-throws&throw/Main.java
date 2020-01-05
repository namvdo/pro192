import java.util.*;
class Test
 {int x=0;
  public void input() throws Exception
   {Scanner h = new Scanner(System.in);
    System.out.print(" Enter x = ");
    x = h.nextInt();
    if(x<10) throw new Exception();
   }
  public void testInput()
   {while(true)
     {try {input();} 
        catch(Exception e)
          {System.out.println(" You should enter number >=10");continue;}
      break;
     }
    display();
   }
  public void display()
   {System.out.println(" x = "+x);
   }
 }
public class Main
 {public static void main(String args[])
    { Test g = new Test();
      g.testInput();
    }
 }