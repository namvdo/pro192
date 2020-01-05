import java.util.*;
public class Main
 {
  static void display(String [] a)
    {for(int i=0;i<a.length;i++)
         System.out.println(a[i]);
    }
  public static void main(String[] args) throws Exception
   {
     Scanner t;
     String str, delimiters;

     // using special delimiter: space(s), comma (,) and point (.)
     str = "au     dv kk ll,mx,iy.nz,hh.mm     jj.bb";
    delimiters = "\\s+|,|\\.+";
     //  delimiters = "\\s|\\.|,";

      t = new Scanner(str);
      t.useDelimiter(delimiters);
      int i,n; 
      String [] b = new String[100];
      i = 0; String x;
      while(t.hasNext()) 
         {x = t.next();
           b[i++] = new String(x);
         }
      n = i;
      String [] a = new String[n];
      for(i=0;i<n;i++) a[i] = b[i];
      display(a);

     System.out.println();
   }
}
