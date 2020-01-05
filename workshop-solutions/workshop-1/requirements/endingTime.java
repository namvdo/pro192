import java.util.Scanner;

public class endingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours: ");
        int hours = sc.nextInt();
        System.out.println("Enter minutes: ");
        int minutes = sc.nextInt();
        System.out.println("Enter the duration in minute: ");
        int duration = sc.nextInt();
        int totalMinutes = (hours * 60) + minutes + duration;
        int totalHours = totalMinutes / 60;
        int totalLeftMinutes = totalMinutes - (totalHours * 60);
        if (totalHours >= 24 && totalLeftMinutes > 0) {
            totalHours = totalHours - 24;
        }
        if (Integer.toString(totalLeftMinutes).length() == 1) {
            System.out.println(totalHours + ":" + "0" + totalLeftMinutes);

        } else {
            System.out.println(totalHours + ":" + totalLeftMinutes);

        }
    }
}