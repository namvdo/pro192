import java.io.*;
public class Main
 {
  public static void main(String[] args) throws Exception
   {String fname = "test\\matrix.txt";
    File f = new File(fname);
    if(f.exists())
      {System.out.println("The file " + fname + " exists");f.delete();}
       else
        System.out.println("The file " + fname + " does not exist");
    System.out.println();
   }
}
