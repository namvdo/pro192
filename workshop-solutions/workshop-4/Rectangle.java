import java.util.Scanner;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void displayData() {
        System.out.println("You entered: " + this.height + " " + this.width);
    }

    public void area(double width, double height) {
        System.out.println("The area: " + width * height);
    }

    public void perimeter(double width, double height) {
        System.out.println("The perimeter: " + (width + height) * 2);
    }
}

class Main {
    public static void main(String[] args) {
        double width, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the heigh of the rectangle: ");
        height = sc.nextDouble();
        System.out.println("Enter the breath of the rectangle: ");
        width = sc.nextDouble();
        Rectangle test = new Rectangle(width, height);
        test.displayData();
        test.area(width, height);
        test.perimeter(width, height);
    }
}
