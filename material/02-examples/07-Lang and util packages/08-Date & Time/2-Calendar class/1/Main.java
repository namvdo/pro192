import java.util.*;
public class Main {
  public static void main(String[] args) {
  Calendar t = Calendar.getInstance();
   System.out.println(" t.getTime(): " + t.getTime());
   System.out.println(" t.get(Calendar.HOUR_OF_DAY): " + t.get(Calendar.HOUR_OF_DAY));
   System.out.println(" t.get(Calendar.MINUTE): " + t.get(Calendar.MINUTE));
   System.out.println(" t.get(Calendar.SECOND): " + t.get(Calendar.SECOND));
  }
}
