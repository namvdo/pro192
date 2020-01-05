import java.util.*;
class A 
 {
 }
class B extends A
 {public String toString()
    {return("This is B");
    }
  }

class MyList<T>
 {List<T> u;
  MyList()
    {u = new ArrayList<T>();
    }
  void add(T x)
    {u.add(x);
    }
  void addMany(T [] a)
    {for(int i = 0;i<a.length;i++) u.add(a[i]);
    } 
  void display()
    {for(int i=0;i<u.size();i++) System.out.print(u.get(i) + "  ");
     System.out.println();
    }
 }
class Main 
  {
    public static void main(String[] args)
       {MyList<A> t = new MyList();
         B b = new B();
        t.add(b);
        t.display();  
        System.out.println();

        System.out.println();
       }
  }
