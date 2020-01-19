import java.util.*;

abstract class Person {
    String name;

    Person() {
    }

    Person(String n) {
        this.name = n;
    }

    abstract double getSalary();

}

class Officer extends Person {
    double bSalary;

    Officer() {
    }

    Officer(String n, double s) {
        super(n);
        this.bSalary = s;
    }

    double getSalary() {
        return bSalary;
    }

    void display() {
        System.out.println("Officer's salary is: " + getSalary());
    }
}

class Worker extends Person {
    double hrs;
    final double RATE = 5.5;

    Worker() {
    }

    Worker(String n, double h) {
        super(n);
        this.hrs = h;
    }

    void display() {
        System.out.println("Worker's salary is: " + getSalary());
    }

    double getSalary() {
        return hrs * RATE;
    }
}

class Main {
    public static void main(String... ags) {
        Person[] e = new Person[5];
        int n = 0, c = 0;
        do {
            System.out.println("Worker (1); Officer(2): ");
            Scanner in = new Scanner(System.in);
            c = in.nextInt();
            if (c == 1) {
                // accept information of worker
                System.out.print("Enter worker name: ");
                String name = in.next();
                System.out.print("Enter worker working hours: ");
                int hrs = in.nextInt();
                e[n] = new Worker(name, hrs);
                n++;
            } else if (c == 2) {
                // accept information of Officer
                System.out.print("Enter Officer name: ");
                String name = in.next();
                System.out.print("Enter officer salary: ");
                double salary = in.nextDouble();
                e[n] = new Officer(name, salary);
                n++;
            }
        } while (n < 5);
        // print all objects of e
        // display workers
        System.out.println("Workers: ");
        for (int i = 0; i < n; i++) {
            // print the instance of Worker only
            if (e[i] instanceof Worker)
                ((Worker) e[i]).display();
        }

        // print all objects of e
        // display officers
        System.out.println("Officer: ");
        for(int i = 0; i < n; i++){
            if(e[i] instanceof Officer){
                // because e[i] still is a person, you need to cast it to Officer.
                ((Officer) e[i]).display();
            }
        }

    }
}