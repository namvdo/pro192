public class Main 
  {
       public static void main(String args[])
            {
              StringBuilder a = new StringBuilder("abChaoMungcd");
              StringBuilder b = a.replace(2,10,"Chao");
              System.out.println(b);//a ="abChaocd", nhu vay la thay the tu ky tu 2 cho den ky tu 9
             }
  }
//StringBuilder replace(int begin, int end, String replacedString);
