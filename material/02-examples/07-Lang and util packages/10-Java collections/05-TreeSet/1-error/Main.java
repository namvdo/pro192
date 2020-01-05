import java.util.*;
class A // implements Comparable
 {
  public int compareTo(Object x)
   {return(-1);
   }
 }
public class Main {
  public static void main(String[] args) {
    TreeSet t = new TreeSet();
    t.add(new A());
    t.add(new A());
    System.out.println();
  }
}

