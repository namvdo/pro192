class Main
 {static void fun(double x, double y, double ... a)
    {System.out.println("x = " + x);
     System.out.println("y = " + y);
     int n, i;
     n = a.length;
     System.out.print("\nElements in the array a: ");
     for(i=0;i<n;i++) System.out.print(a[i] + "  ");
     System.out.println();
    }
   public static void main(String args[]) throws Exception
   {fun(1,2,3,4,5,6);
    System.out.println();
   }
 }
 