class Outer
 {int m,n;
   class Inner
      {//Can not declare static member in non-static inner class
        void chao()
           {System.out.println("\nInner class xin chao");
           }
     }
   void chao()
         {System.out.println("\nOuter class xin chao");
         }
 }
public class Main 
  {
       public static void main(String args[])
            {
              Outer t = new Outer();
              Outer.Inner h = t.new Inner();              
              t.chao();
              h.chao();
            }
  }
