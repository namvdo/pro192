import java.io.*;
import java.util.*;
class MyList
 {ArrayList<Emp> t;
   MyList() {t = new ArrayList<Emp>();}
   boolean isEmpty() {return(t.isEmpty());}
   void clear() {t.clear();}
   void add(Emp x) {t.add(x);}
   void display()
     {for(int i=0;i<t.size();i++) System.out.println(t.get(i));
       System.out.println();
     }
   void readFile(String fname) throws Exception
     {RandomAccessFile f = new RandomAccessFile(fname,"r");
       String [] a;
       String s; int k; double y; Emp x;
       while(true)
        {s = f.readLine();
          if(s==null || s.length()<4) break;
          a = s.split("\\s*\\|\\s*");
          if(a==null || a.length<4) break;
          k = Integer.parseInt(a[2]);
          y = Double.parseDouble(a[3]);
          x = new Emp(a[0],a[1],k,y);
          t.add(x);
        }
       f.close();
     }
 }
