import java.io.File;
public class Main
 {public static void main(String args[])
   {File f = new File("data");  
    f.mkdir();
    System.out.println(f.isDirectory());
    System.out.println();

    File g = new File("data1");  
    System.out.println(g.isDirectory());
    System.out.println();
   } 
 }
