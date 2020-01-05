public class Main
  {
    public static void main(String args[])
      {
        //Exception handling mechanism
        try
          {//The following statement within try block will raise divide-by-zero, a type of ArithmeticException exception
            System.out.println(1/0);
            System.out.println("\n\nDong lenh nay o phia sau dong lenh phat sinh loi, do do se bi bo qua");
          }
          //Exception handler method
        catch(ArithmeticException e)
          {
            System.out.println("\nSau day la thong tin chi tiet ve exception:");
            e.printStackTrace();
          }    
          System.out.println("\n\nSau khi exception duoc catch va xu ly, cac lenh phia sau van duoc tiep tuc");
      }
 }
/*
 Exception phat sinh trong khoi lenh try se duoc nem ra ngoai, phan con lai cua khoi try bi bo qua
 O ben ngoai cac khoi catch se nam bat va xu ly cac exception. Co the co nhieu khoi catch. Cac lenh phia sau catch van duoc tiep tuc thuc hien
 Xem vi du o thu muc 02 de thay rang exception co the duoc catch nhung khong xu ly gi ca va chuong trinh van tiep tuc
*/