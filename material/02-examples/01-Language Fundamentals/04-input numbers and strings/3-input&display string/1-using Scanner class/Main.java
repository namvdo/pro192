import java.util.*;
class Main
  {
    public static void main(String[] args) throws Exception
     {String code, name; int age;
       Scanner t = new Scanner(System.in);
       System.out.print("Enter code = ");
       code = t.nextLine();
       System.out.print("Enter name = ");
       name = t.nextLine();
       System.out.print("Enter age = ");
       age = t.nextInt();

       System.out.println("code = " + code);
       System.out.println("name = " + name);
       System.out.println("age = " + age);

     }
  }
