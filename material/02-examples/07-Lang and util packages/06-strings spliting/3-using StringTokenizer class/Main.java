import java.util.*;
public class Main
 {
  public static void main(String[] args) throws Exception
   {
    // using default delimiter
    String a = "ABC UV XYZ,k";
    String s;
    StringTokenizer t = new StringTokenizer(a);
    while(t.hasMoreTokens()) 
      {s = t.nextToken();
       System.out.println(s);
      }
    System.out.println();

    // using specified delimiter
    String b = "AB  C | UV | X YZ,k";
    t = new StringTokenizer(b,"|+ ,");//d?u cách và kho?ng tr?ng
    while(t.hasMoreTokens()) 
      {s = t.nextToken();
       System.out.println(s);
      }
    System.out.println();

   }
}
