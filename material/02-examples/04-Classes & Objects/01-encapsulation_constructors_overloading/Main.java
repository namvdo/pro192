import java.util.Scanner;
// overloading functions
class Emp
 {String name; double salary, bonus;
   Emp()  // default constructor
    {name=null; salary=bonus=0;
    }
   // parameter constructor
   Emp(String xName, double xSalary, double xBonus)
    {name=xName; salary=xSalary; bonus=xBonus;
    }
   void setData(String xName, double xSalary, double xBonus)
    {name=xName; salary=xSalary; bonus=xBonus;
    }
   void setData(String xName, double xSalary)
    {setData(xName,xSalary,0);
    }
   void display()
    {System.out.println(name + ", " + salary + ", " + bonus);
    }  
   void input()
    {Scanner t = new Scanner(System.in);
     System.out.print("Enter name = ");
     name = t.nextLine();
     System.out.print("Enter salary = ");
     salary = t.nextDouble();
     System.out.print("Enter bonus = ");
     bonus = t.nextDouble();
   }
 }
class Main
 {public static void main(String args[])
   {Emp x = new Emp();
     x.display();
    Emp y = new Emp("Hoa",700,50);
     y.display();
     x.input();
     x.display();
    System.out.println();
   }
 }
