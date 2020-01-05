import java.io.*;
class Person
 {String name; int age;
   Person() {}
   Person(String xName, int xAge) {name = xName; age = xAge;}
   public String toString() {return("(" + name + "," + age + ") ");}
 }

class Main
 {
  public static void main(String[] args) throws Exception
   {RandomAccessFile f = new RandomAccessFile("test.txt","rw");
    Person x = new Person("Hoa",22);
    f.writeBytes(x.toString());
    f.close();
    System.out.println(); 

   }
 }