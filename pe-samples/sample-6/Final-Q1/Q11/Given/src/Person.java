/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class Person {
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() { return this.name.toUpperCase(); }
    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = age; }
    public String toString() { return age + "\t" + name; }
}
