import java.io.*;
import java.util.*;

//=============================
public class Main
 {public static void main(String [] args)
   {String fname ="Employee.txt";
    RandomAccessFile f;
    String s = "";
    String s1,s2,s3,s4;
    StringTokenizer sk;
    try 
     {f = new RandomAccessFile(fname, "r");
      while((s = f.readLine()) != null )
        {sk = new StringTokenizer(s,"|");
         s1 = sk.nextToken();
         s2 = sk.nextToken();
         s3 = sk.nextToken();
         s4 = sk.nextToken();
	 System.out.println(s1 + " " + s2+ " " + s3 + " " + s4);
        }
      f.close();
     }
     catch(Exception e)
       {System.out.println("Error !");
       }

    }
  }
