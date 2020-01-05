import java.io.*;
import java.util.*;
class MyMatrix
 {int [][] a; int n;
  MyMatrix() {}
  void loadFromFile(String filename) throws IOException
   {int i,j;
    String s="", s1="";
    StringTokenizer t;
    RandomAccessFile f; 
    f = new RandomAccessFile(filename, "r");

    try { 
     s = f.readLine();
     n = Integer.parseInt(s.trim());
     a = new int[n][];
     for(i=0;i<n;i++)
       a[i]= new int[n];
     for(i=0;i<n;i++)
      {s = f.readLine();
       t = new StringTokenizer(s);
       for(j=0;j<n;j++)
         {s1 = t.nextToken();
          a[i][j]=Integer.parseInt(s1.trim());
         }
      }

     }
     catch(Exception e)
       {System.out.println("Error !");
       }
    f.close();
   }
  void display()
   {int i,j;
    for(i=0;i<n;i++)
      {System.out.println();
       for(j=0;j<n;j++) System.out.print("  " + a[i][j]);
      }
    System.out.println();
   }
  void writeToFile(String filename) throws Exception
   {Formatter out = new Formatter(new File(filename));
    int i,j;
    out.format("%d\n",n);
    for(i=0;i<n;i++)
      {for(j=0;j<n;j++) out.format("%5d",a[i][j]);
       out.format("\n");
      }
    out.close();
   }
 }

class Main 
 {public static void main(String [] args) throws Exception
   {String fname;
    fname="matrix.txt";
    MyMatrix g =new MyMatrix();
    g.loadFromFile(fname);
    g.display();
    g.writeToFile("matrix2.txt"); 
    System.out.println();
   }
 }
