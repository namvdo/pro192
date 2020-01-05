import java.util.Scanner;

public class stringConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your middle name: ");
        String middleName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Hello " + firstName + " " + middleName + " " + lastName);
    }
}