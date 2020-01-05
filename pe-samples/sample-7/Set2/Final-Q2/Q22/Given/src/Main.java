// ======= DO NOT EDIT MAIN FUNCTION ============

import java.io.*;
import java.util.*;

public class Main {

    public static void OutputList(List<Course> c) {
        for (Course x : c) {
            System.out.println(x.getName());
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<Course> a = new ArrayList();
        a.add(new Course("PRJ311", 110));
        a.add(new Course("DBI202", 150));
        a.add(new Course("PRF192", 120));
        System.out.print("Add more how many course: ");
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            System.out.println("");
            System.out.print("Course name: ");
            String name = in.readLine();
            System.out.print("Course fee: ");
            double fee = Double.parseDouble(in.readLine());
            a.add(new Course(name, fee));
        }
        System.out.println("");
        System.out.print("Enter test function (1-f1;2-f2): ");
        int c = Integer.parseInt(in.readLine());
        ICourse i = new MyCourse();
        int st = 0;
        double fee = 0;
        if (c == 2) {
            System.out.print("Enter course fee: ");
            fee = Double.parseDouble(in.readLine());
        } else if (c == 1) {
            System.out.print("Enter st: ");
            st = Integer.parseInt(in.readLine());
        }
        System.out.println("");
        System.out.println("OUTPUT:");
        if (c == 1) {
            i.f1(a, st);
            OutputList(a);
        } else if (c == 2) {
            System.out.println(i.f2(a, fee));
        }
    }
}
