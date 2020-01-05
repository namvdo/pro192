import java.util.*;
class Person implements Comparable<Person>
 {String name; int age;
   Person() {}
   Person(String xName, int xAge) {name = xName; age = xAge;}
   public String toString() {return(name + "," + age);}
   public int compareTo(Person x)
     {return(name.compareTo(x.name));
     }

 }
class Emp extends Person
 {double income;
   Emp(String xName, int xAge, double xIncome)
    {super(xName,xAge);
      income = xIncome;
    }
   public String toString()
    {String s = super.toString() + ", " + income;
      return(s);
    }
 }
class MyList
 {ArrayList<Person> t;
   MyList() {t = new ArrayList<Person>();}
   void clear() {t.clear();}
   boolean isEmpty() {return(t.isEmpty());}
   void add(Person x) {t.add(x);}
   void addMany(String [] a, int [] b)
     {int n, i; Person x;
       n = a.length;
       for(i=0;i<n;i++)
         {x = new Person(a[i],b[i]);
          add(x);
         }
     }
   void display()
    {for(int i=0;i<t.size(); i++) System.out.println(t.get(i));
    }
   void sortByName()
    {Collections.sort(t);
    }

   void sortByAge()
    {Collections.sort(t, new Comparator<Person>()
        {
           @Override
            public int compare(Person x, Person y)
              {if(x.age<y.age)
                 return(-1);
                  else if(x.age==y.age)
                    return(0);
                     else
                      return(1);
              }
         });

    }
 }

class Main
 {
   public static void main(String args[]) 
      {String [] a = {"Hoa","La","Canh","Cay"};
        int [] b = {21,19,25,18};
        MyList t = new MyList();
        t.addMany(a,b);
        t.add(new Emp("Re",22,400));
        t.add(new Person("Ba",27));
        t.add(new Person("Ba",17));
        t.add(new Person("Ba",37));
        t.add(new Emp("Ga",26,700));
        t.display();    
        System.out.println("\nSort by name:");
        t.sortByName();
        t.display();    

        System.out.println("\nSort by age:");
        t.sortByAge();
        t.display();    
        System.out.println();

      } 

  }
