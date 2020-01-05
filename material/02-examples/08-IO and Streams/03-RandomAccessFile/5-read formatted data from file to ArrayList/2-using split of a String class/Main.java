import java.io.*;
import java.util.*;

public class Main
 {public static void main(String [] args) throws Exception
   {String fname = "emp.txt";
     MyList t = new MyList();
     t.readFile(fname);
     t.display();
    System.out.println();  
   }
 }
