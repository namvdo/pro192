import java.util.*;
public class Main
 {
  public static void main(String[] args) throws Exception
   {
    String s = "CDABEF";
    char [] a = s.toCharArray();
    Arrays.sort(a);
    int i;
    for(i=0;i<a.length;i++)
      System.out.println(a[i]);
    System.out.println();
   }
}
