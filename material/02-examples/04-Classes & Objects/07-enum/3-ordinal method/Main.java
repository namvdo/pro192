enum Season {
    SPRING, SUMMER, AUTUMN, WINTER  
}

class Main {
    public static void main(String[] args) {
      Season x = Season.WINTER;
      System.out.println(x + ": " + x.ordinal());
      System.out.println();

      for(Season y: Season.values()) {
         System.out.println(y + ": " + y.ordinal());
       }
      System.out.println();
    }
}
