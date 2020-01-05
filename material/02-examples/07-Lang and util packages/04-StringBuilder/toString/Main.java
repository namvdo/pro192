public class Main 
  {
       public static void main(String args[])
            {
        String s = "123456 78";
         t.reverse();//Khong cho phép d?i v?i string
        StringBuilder t = new StringBuilder(s);
        t.reverse();//cho phép v?i bi?n d?i tu?ng StringBuilder
       String u = t.toString();
        System.out.println(u);//cho phép v?i String
             }
  }
//String substring(int startIndex);
