
class Main {
    public static void main(String[] args) {
      StringBuffer t = new StringBuffer("ABC");
      StringBuffer h = t.append(" XYZ");
      System.out.println("t == h is " + (t==h));
      System.out.println("h = " + h);

      System.out.println();
   }
}
