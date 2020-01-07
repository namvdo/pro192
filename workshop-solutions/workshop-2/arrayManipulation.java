import java.util.Scanner;
import java.util.Arrays;
public class arrayManipulation {

    public static void main(String[] args) {
        int n; // size of the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        int array[] = new int[n]; // new array with n elements
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("All array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        System.out.println("Array after sorting in ascending manner: " + Arrays.toString(array));
        System.out.println("The maximum value of this array is: " + array[array.length - 1]);
    }
}
