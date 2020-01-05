import java.io.*;
import java.util.*;
class Person
 {String code, name; int sal, bon;
  Person(String code, String name, int sal, int bon)
   {this.code=code;this.name=name;this.sal=sal;this.bon=bon;} 
  public String toString()
   {return(code + "  " + name + "  " + sal + "  " + bon);}
 }
class Main 
 {public static void main(String [] args) throws Exception
   {String fname ="persons.txt";
    RandomAccessFile f = new RandomAccessFile(fname,"r");
    ArrayList t = new ArrayList();
    String s,s1,s2,s3,s4;
    StringTokenizer h;
    int x, y, i; Person u;
    while(true)
     {s = f.readLine();
      if(s==null || s.trim().length()==0) break;
      h = new StringTokenizer(s,"|");
      s1 = h.nextToken();
      s2 = h.nextToken();
      s3 = h.nextToken();
      s4 = h.nextToken();
      x = Integer.parseInt(s3.trim());
      y = Integer.parseInt(s4.trim());
      u = new Person(s1.trim(),s2.trim(),x,y);
      t.add(u);
     }
    f.close();
    for(i=0;i<t.size();i++) 
       System.out.println(t.get(i));
    File g = new File("report.txt");
    g.delete();
    f = new RandomAccessFile("report.txt","rw");    
    for(i=0;i<t.size();i++) 
       f.writeBytes(t.get(i) +"\n");
    f.close(); 
    System.out.println();


   }
  }