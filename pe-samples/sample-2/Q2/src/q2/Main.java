package q2;

// ======= DO NOT EDIT MAIN FUNCTION ============
import java.io.*;
import java.util.*;
class Main {
   public static void main(String args[]) throws Exception{
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter number of Invoice: ");
       int n = Integer.parseInt(in.readLine());
       ArrayList<Invoice> a = new ArrayList(); 
       for(int i = 0; i < n; i++){
           System.out.println("");
           System.out.print("name to customer: ");
           String customer = in.readLine();           
           System.out.print("Total amount: ");
           int amount = Integer.parseInt(in.readLine());          
           a.add(new Invoice(customer, amount));
       }
       System.out.println("");
       System.out.print("Enter test function (1-f1;2-f2): ");
       int c = Integer.parseInt(in.readLine());
       IInvoice i = new MyInvoice();
       System.out.println("OUTPUT:");    
       if(c == 1)
       { System.out.print("ST=");
           int st=Integer.parseInt(in.readLine());
          System.out.println(i.f1(a,st));}     
       else if(c == 2)
          System.out.println(i.f2(a));
   }
 }
