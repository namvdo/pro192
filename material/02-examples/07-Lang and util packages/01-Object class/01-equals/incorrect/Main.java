class Person
 {String name;
  Person(String name) {this.name = name;}
  public String toString() {return(name);} 
 }
public class Main
 {
  public static void main(String[] args) throws Exception
   {Person a = new Person("HUNG");
    Person b = new Person("HUNG");

    System.out.println(a.equals(b));
   }
}
