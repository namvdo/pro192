class Main
  {
    public static void main(String[] args)
     {
       String str = "au dv   mx  iy      nz";
       String [] a; int i;
       // split a string containing one or more spaces 
       a = str.split("[ ]+");
       for(i=0;i<a.length;i++) System.out.println(a[i]);
       System.out.println();
       String [] b;
       b = str.split("\\s+");
       for(i=0;i<b.length;i++) System.out.println(b[i]);
       System.out.println();
     }
   }
