import java.util.Scanner;
public class totalMinutes {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input hours: ");
        int hours = sc.nextInt(); 
        System.out.println("Input minutes: ");
        int minutes = sc.nextInt();
        int totalMinutes = hours * 60 + minutes;
        System.out.println("The total minutes is: " + totalMinutes);
    }
}