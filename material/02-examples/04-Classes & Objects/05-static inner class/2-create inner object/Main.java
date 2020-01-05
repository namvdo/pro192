class Outer
  {int m,n;
   static class Inner
      {void fun()
           {System.out.println("\nI am an Inner class");
           }
      }
   void fun()
         {System.out.println("\nI am an Outer class");
         }
  }
public class Main 
  {
       public static void main(String args[])
            {
              Outer.Inner t = new Outer.Inner();// Do not need to create Outer object
              t.fun(); // I am an Inner class
            }
  }
