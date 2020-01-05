/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class Teacher {
    String name;
    double salary;
    public Teacher() {}
    public Teacher(String n, double s){
        this.name = n;
        this.salary = s;
    }
    public String getName() { return this.name; }
    public double getSalary() { return this.salary; }
    public void setSalary(double s) { this.salary = s; }
    public String toString() { return this.name + " " + this.salary; }
}
