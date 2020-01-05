import java.io.*;
public class Main
 {
  public static void main(String[] args) throws Exception
   {String fname = "test\\matrix1.txt";
    File f = new File(fname);
    if(!f.exists())
      System.out.println("The file " + fname + " does not exist");
       else
        {System.out.println("The file " + fname + " exists");
         System.out.println("The file now is deleted");
         f.delete();
        }
    System.out.println();
   }
}
