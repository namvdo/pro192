enum Season {
    SPRING(25, 11), SUMMER(32, 13), AUTUMN(23, 10), WINTER(10, 9);
    private final int avgTemp;
    private final int dayLength;
    Season(int x, int y) {
       avgTemp = x;
       dayLength = y;
     }
   public void display() {
     System.out.println(this + " average temperature is " + avgTemp);
     System.out.println(this + " average day's length is " + dayLength);
     System.out.println();
    }  
}

class Main {
    public static void main(String[] args) {
      Season x = Season.WINTER;
      x.display();
      System.out.println();

      for(Season y: Season.values()) {
         y.display();
       }
      System.out.println();
    }
}
