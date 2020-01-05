
class Main {
    public static void main(String[] args) {
      String t = new String("ABC");
      String h = t.concat(" XYZ");
      System.out.println("t == h is " + (t==h));
      System.out.println("h = " + h);
      System.out.println();

      String g = t + " XYZ";
      System.out.println("t == g is " + (t==g));
      System.out.println("g = " + g);

      System.out.println();
   }
}
