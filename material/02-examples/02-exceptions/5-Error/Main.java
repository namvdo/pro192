public class Main
 {public static void main(String [] args) throws Exception
   { 
    try {
     System.out.println("ABC1");
     if(2>1) throw new Error();
     System.out.println("ABC2");
     System.out.println("ABC3");
    }
    catch(Exception e) {System.out.println("Exception");}
    finally {System.out.println("finally");}
    System.out.println("last");  

   }
 }
/*
finally luon luon duoc thuc hien. ngay ca truong hop co error
*/

