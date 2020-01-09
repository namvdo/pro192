import java.util.Scanner;
public class Student{
    private String name;
    private String studentId;
    private String birthDate;
    private String major;
    private String address;
    private double mark;
    // constructor
    public Student(String name, String studentId, String birthDate, String major, String address, double mark){
        this.name = name;
        this.studentId = studentId;
        this.birthDate = birthDate;
        this.major = major;
        this.address = address;
        this.mark = mark;
    }
    public String getName() { return this.name; }
    public String getStudentId() { return this.studentId; }
    public String getBirthDate() { return this.birthDate; }
    public String getMajor() { return this.major; }
    public String getAddress() { return this.address; }
    public double getMark() { return this.mark; }
    public void setName(String name) { this.name = name; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }
    public void setMajor(String major) { this.major = major; }
    public void setAddress(String address) { this.address = address; }
    public void setMark(double mark) { this.mark = mark; }
    void printAllAttributes(){
        System.out.println("Student Name: " + this.name);
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student birthday: " + this.birthDate);
        System.out.println("Student major: " + this.major);
        System.out.println("Student address: " + this.address);
        System.out.println("Student mark: " + this.mark);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.next();
        System.out.println("Enter student id: ");
        String studentId = sc.next();
        System.out.println("Enter student birth day: ");
        String birthDate = sc.next();
        System.out.println("Enter student major: ");
        String major = sc.next();
        System.out.println("Enter student address: ");
        String address = sc.next();
        System.out.println("Enter student marks: ");
        double mark = sc.nextDouble();
        Student foo = new Student(name, studentId, birthDate, major, address, mark);
        foo.printAllAttributes();
    }

}
