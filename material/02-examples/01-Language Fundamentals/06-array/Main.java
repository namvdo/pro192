import java.util.Scanner;
class Main
 {public static void main(String args[])
   {// 1 dimension array
    double [] a; int n;
    // 2 dimension array 
    double [][] b; int m,k;
    int i,j;
    Scanner t = new Scanner(System.in);

    // Enter & display elements in 1 dimensional array
    System.out.print("Enter size of the array a, n = ");
    n = t.nextInt();
    a = new double[n];
    System.out.println("Enter " + n + " values for the array a:");
    for(i=0;i<n;i++) a[i] = t.nextDouble();
    System.out.println("List of values in the array a:");
    for(i=0;i<a.length;i++) System.out.print(a[i] + "  ");
    System.out.println();

    // Enter & display elements in 2 dimensional array
    System.out.print("Enter number of rows of the array b, m = ");
    m = t.nextInt();
    System.out.print("Enter number of columns of the array b, k = ");
    k = t.nextInt();
    b = new double[m][k];
    for(i=0;i<m;i++)
      {System.out.println("Enter " + k + " values for the row " + i + " of the array b:");
       for(j=0;j<k;j++) b[i][j] = t.nextDouble();
      }
    System.out.println("Values in the 2 dimensionql array b:");
    for(i=0;i<m;i++) 
      {System.out.println();
       for(j=0;j<k;j++)
        System.out.printf("%7.1f", b[i][j]);
      }
    System.out.println();

    System.out.println();
   }
 }
