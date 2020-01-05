import java.util.*;
class Main 
 {public static void main(String [] args) throws Exception
   {Calendar t = Calendar.getInstance();
    int year,month,day,hour,minute,second,dayOfWeek,dayOfMonth;long millis; Date today;
    year = t.get(Calendar.YEAR);
    month = t.get(Calendar.MONTH)+1;
    today = t.getTime();
    hour = t.get(Calendar.HOUR_OF_DAY);
    minute = t.get(Calendar.MINUTE);
    dayOfMonth = t.get(Calendar.DAY_OF_MONTH);
    second = t.get(Calendar.SECOND);
    dayOfWeek = t.get(Calendar.DAY_OF_WEEK);
    System.out.println(" Year: " + year);
    System.out.println(" Month: " + month);
    System.out.println(" Day of month: " + dayOfMonth);
    System.out.println(" Day of week: " + dayOfWeek);
    System.out.println(" Hour: " + hour);
    System.out.println(" Minute: " + minute);
    System.out.println(" Second: " + second);
    System.out.println(" Milli seconds from 1900: " + t.getTimeInMillis());
    System.out.println(" Milli seconds from 1900: " + System.currentTimeMillis());
    System.out.println(" The current time: " + Calendar.getInstance().getTime());
   }
  }