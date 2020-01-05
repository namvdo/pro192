public class Main
  {
    public static void main(String args[])
      { int [] a = {0,1,2};
        try {
         System.out.println(a[3]);// No error at compiling time, but there is error at runtime
        }
        catch(Exception e) {System.out.print(" Loi cua chuong trinh la: ");e.printStackTrace();}
      }
 }
