class Main 
 {static int k = 1; static int h = 10; // (1)
  public static void main(String [] args)
   {//Main t = new Main();
    System.out.println(" k, h = " + Main.k + "  " + Main.h);
   }
  {k++; h = 30;} // (3)
  static {k++;h = 40;} // (2)
  }
/* Ket qua la 3, 30, chung to rang thu tu thuc hien la
 (1) (2) (3)
*/