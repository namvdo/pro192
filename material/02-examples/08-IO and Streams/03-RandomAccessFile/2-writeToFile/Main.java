import java.io.*;
import java.util.*;
//=============================
public class Main
 {public static void main(String [] args)
   {String fname ="Employee.txt", fname2 = "Employee2.txt";
    RandomAccessFile f,f2;
    String s = "";
    String s1,s2,s3,s4;
    StringTokenizer sk;
    try 
     {f = new RandomAccessFile(fname, "r");
      f2 = new RandomAccessFile(fname2, "rw");
      while((s = f.readLine()) != null )
        {sk = new StringTokenizer(s,"|");
         s1 = sk.nextToken();
         s2 = sk.nextToken();
         s3 = sk.nextToken();
         s4 = sk.nextToken();
	 System.out.println(s1 + " " + s2+ " " + s3 + " " + s4);
         f2.writeBytes(s1 + " " + s2+ " " + s3 + " " + s4 + "\n");      
        }
      f.close();
      f2.close();
     }
     catch(Exception e)
       {System.out.println(e.getMessage());
        //System.out.println("Error !");
       }

    }
  }

/*
Content of the Employee.txt:

007  |  Hung  |  25   |  800
003  |  Tuyet |  27   |  500
010  |  Quang |  19   |  700
002  |  An    |  34   |  900
004  |  Giang |  29   | 1200
008  |  Huy   |  27   |  600
012  |  Quoc  |  21   | 1100

*/
