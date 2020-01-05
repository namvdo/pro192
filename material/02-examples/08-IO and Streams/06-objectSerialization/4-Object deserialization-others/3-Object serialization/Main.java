import java.util.*;
import java.io.*;
class A implements Serializable
 {int k; float x;
    int m; int r;
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
 {public static void main(String [] args) throws IOException
   {A t = new A(1,2,3,4);
     t.display();
     ObjectOutputStream h = new ObjectOutputStream(new FileOutputStream("test.dat"));
     h.writeObject(t);
     h.close();
     System.out.println();  
   }
 }
