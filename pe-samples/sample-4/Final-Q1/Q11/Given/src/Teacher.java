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
    public Teacher(){}
    public Teacher(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setSalary(double s){
        this.salary = s;
    }
    public String toString(){
        return name + " " + salary;
    }
}
