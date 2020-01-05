import java.io.*;
import java.util.*;
class Fruit implements Serializable
  { String name="";
    int weight=0;

    public Fruit(String xName, int xWeight)
      { name = xName;
        weight = xWeight;
       }
 
    public String toString()
       { return (name +"  "+ weight+" g");
       }
   }


public class Main
  { public static void main(String args[]) throws IOException
       {
          //Tao luong de ghi doi tuong vao 
          ObjectOutputStream h = new ObjectOutputStream(new FileOutputStream("seria.dat"));
          h.writeObject(new String("Hello World"));
          h.writeObject(new Fruit("Orange",10));
          h.writeObject(new Fruit("Apple",5));
          h.writeObject(new Date());
          h.close();

          System.out.println("Total 4 objects written to seria.dat");  
       }
  }



