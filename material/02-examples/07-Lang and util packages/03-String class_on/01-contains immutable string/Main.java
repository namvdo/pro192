
public class Main
 {
  public static void main(String[] args) throws Exception
   {String t = new String("ABC");
    String h = t;
    t += "XYZ";
    System.out.println(h==t);// false
    StringBuffer t1 = new StringBuffer("ABC");
    StringBuffer h1 = t1;
    t1.append("XYZ");
    System.out.println(h1==t1);// true
    StringBuilder t2 = new StringBuilder("ABC");
    StringBuilder h2 = t2;
    t1.append("XYZ");
    System.out.println(h2==t2);// true

   }
}
