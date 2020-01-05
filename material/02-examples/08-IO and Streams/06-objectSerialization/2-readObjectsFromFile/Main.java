import java.io.*;
/*class Fruit  implements Serializable
  { String name="";
    int weight=0;

    public Fruit(String xName, int xWeight)
      { name = xName;
        weight = xWeight;
       }
 
    public String toString()
       { return (name +"  "+ weight+" g");
       }
   }*/

public class Main 
  { public static void main(String args[]) throws Exception
       {
         ObjectInputStream g = new ObjectInputStream(new FileInputStream("seria.dat"));
         String v = (String) g.readObject();
         System.out.println(v);
          int i = 1;
          try 
            { while (true)
                { System.out.println(g.readObject());
                   i++;
                }
             }
             catch (EOFException e)
               { System.out.println("Total read  "+ i +" objects");
               }
           g.close();
         }
  }