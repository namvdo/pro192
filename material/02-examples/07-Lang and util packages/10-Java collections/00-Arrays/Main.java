import java.util.*;
public class Main
 {
  public static void main(String[] args) throws Exception
   {String [] a = {"1","9","6","7","3","2","10A"};
    int i;
    System.out.println(" Before sorting:");
    for(i=0;i<7;i++) System.out.println(a[i]);
    Arrays.sort(a);

    System.out.println(" After sorting:");
    for(i=0;i<7;i++) System.out.println(a[i]);
    
    System.out.println();
   
   
   }
}
