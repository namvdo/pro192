public class Main 
  {
       public static void main(String args[])
            {
              StringBuilder s = new StringBuilder("abcdef");
              char [] a = new char[10];
              s.getChars(0,3,a,0);
              System.out.println(a);//a ="abc"
             }
  }
//void getChars(int begin, int end, char [] destArray, int destArrayBegin);
