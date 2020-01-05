public class Main
 {
  public static void main(String[] args) throws Exception
   {
    String s = " 12345 ";
    // int k = Integer.parseInt(s);/*incorrect*/
    int k = Integer.parseInt(s.trim());
    System.out.println(" k = " + k);

    System.out.println();
   }
}
