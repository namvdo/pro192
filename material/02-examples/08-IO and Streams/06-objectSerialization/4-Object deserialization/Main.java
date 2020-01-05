import java.util.*;
import java.io.*;
class A implements Serializable
 {int k; float x;
    static int m; transient int r;
  A() {}
  A(int k1, float x1, int m1, int r1)
   {k=k1;x=x1;m=m1;r=r1;
   }
  void display()
   {System.out.println("k = " + k);
     System.out.println("x = " + x);
     System.out.println("m = " + m);
     System.out.println("r = " + r);

   }
 }
public class Main
 {public static void main(String [] args) throws Exception
   {A t = new A();
     ObjectInputStream h = new ObjectInputStream(new FileInputStream("test.dat"));
     t = (A) h.readObject();
     h.close();
     t.display();
     System.out.println();  
   }
 }
