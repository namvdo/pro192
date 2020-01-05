public class Main 
  {
       public static void main(String args[])
            {
              StringBuilder a = new StringBuilder("chao ban");
              StringBuilder b = a.insert(5,"mung ");
              System.out.println(b);
              System.out.println(a.insert(5,175.6));
             }
  }
/*
StringBuilder insert(int insertPosition, String insertedString);
StringBuilder insert(int insertPosition, char insertedChar);
StringBuilder insert(int insertPosition, float insertedfloat);
Sau lenh insert chuoi ban dau bi bien doi thanh chuoi moi
*/