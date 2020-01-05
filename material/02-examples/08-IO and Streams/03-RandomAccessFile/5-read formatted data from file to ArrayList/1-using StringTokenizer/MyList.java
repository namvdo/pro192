import java.util.*;
import java.io.*;
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
       StringTokenizer r;
       String s, s1, s2, s3, s4; int k; double y; Emp x;
       while(true)
        {s = f.readLine();
         if(s==null || s.length()<3) break;
          r = new StringTokenizer(s,"|");
          s1 = r.nextToken().trim();
          s2 = r.nextToken().trim();
          s3 = r.nextToken().trim();
          s4 = r.nextToken().trim();
          k = Integer.parseInt(s3);
          y = Double.parseDouble(s4);
          x = new Emp(s1,s2,k,y);
          t.add(x);
        }
       f.close();
     }
 }
