
// ======= DO NOT EDIT THIS FILE ============
import java.io.*;
public class Main {
    
   public static void main(String args[]) throws Exception {
       
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
       System.out.printf("1. TC = 1 - test getMoney()"
               + "\n2. TC = 2 - test getCode()\n");
       System.out.print("Enter TC: ");
       int tc = Integer.parseInt(in.readLine());
       double price= 0;
       String ad = "";
       int quantyti=0;
       System.out.print("Enter price in VND: ");
           price = Double.valueOf(in.readLine());
           System.out.print("Enter a address: ");
           ad = (in.readLine());
           System.out.print("Enter quantyti: ");
           quantyti = Integer.valueOf(in.readLine());
      
       System.out.println("OUTPUT:");
       MyMoto c = new MyMoto(price, ad, quantyti);
       switch (tc) {
           case 1:
               System.out.printf("%.2f\n",c.getMoney());
               break;
           case 2:
               System.out.printf("%s\n",c.getCode());
               break; 
           default:
               break;
       }
       
   }
 }