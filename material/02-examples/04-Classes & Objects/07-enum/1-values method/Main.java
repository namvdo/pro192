enum Season {
    SPRING, SUMMER, AUTUMN, WINTER  
}

class Main {
    static void fun(Season x)
      {switch(x)
         {case SPRING:  System.out.println("It is spring");
                                    break;
          case SUMMER: System.out.println("It is summer");
                                    break;
          case AUTUMN:  System.out.println("It is autumn");
                                    break;
          case WINTER:  System.out.println("It is winter");
                                   break;
         }
      }
    public static void main(String[] args) {
      Season x = Season.WINTER;
      fun(x);

      for(Season y: Season.values()) {
         System.out.print(y + ": ");
         fun(y); 
       }
      System.out.println();
    }
}
