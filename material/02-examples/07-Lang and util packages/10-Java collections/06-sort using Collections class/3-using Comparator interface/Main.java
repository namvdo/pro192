import java.util.*;
class Person
 {String name; int age;
   Person() {}
   Person(String xName, int xAge) {name = xName; age = xAge;}
   public String toString() {return("(" + name + "," + age + ") ");}
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
    {for(int i=0;i<t.size(); i++) System.out.print(t.get(i));
    }
   void sortByName()
    {Collections.sort(t, new Comparator<Person>()
        {
           @Override
            public int compare(Person x, Person y)
              {
                 return(x.name.compareTo(y.name));
              }
         });

    }

   void sortByAge()
    {Collections.sort(t, new Comparator<Person>()
        {
           @Override
            public int compare(Person x, Person y)
              {if(x.age < y.age)
                  return(-1);
                   else if (x.age == y.age)
                     return(0);
                       else
                         return(1);
              }
         });

    }

   void sortByAge2()
    {Collections.sort(t, new Comparator<Person>()
        {
           @Override
            public int compare(Person x, Person y)
              {if(x.age<y.age)
                  return(-1);
                   else if (x.age>y.age)
                      return(1);
                       else
                         return(0);
              }
         });

    }

 }

class Main
 {
   public static void main(String args[]) 
      {String [] a = {"Hoa","La","Canh","Cay","Goc","Re"};
        int [] b = {21,19,25,18,23,22};
        MyList t = new MyList();
        t.addMany(a,b);
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
