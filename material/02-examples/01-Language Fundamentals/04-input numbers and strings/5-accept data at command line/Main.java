public class Main
 {public static void main(String [] args)
   {int n, i;
    n = args.length; 
    if(n==0) 
     {System.out.println("No argument");
      return;
     }
    double [] a = new double[n];
    for(i=0;i<n;i++)
      a[i] = Double.parseDouble(args[i]);

    System.out.println();
    for(i=0;i<n;i++) System.out.print("  " + a[i]);
    System.out.println();
   }
 }
