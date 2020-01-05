import java.util.*;
class A implements Comparable
 {String name; int sal;
  A() {}
  A(String name, int sal) {this.name = name; this.sal = sal;}
  public boolean equals(Object x)
   {A y = (A) x;
    return(sal==y.sal);
   }
  public int compareTo(Object x)
   { A y = (A) x;
     if(sal<y.sal) 
       return(-1);
        else if(sal==y.sal)
         return(0);
           else
            return(1);
   }
  public String toString() {return(name + " " + sal);} 
 } 
class MySet extends TreeSet
 {public boolean isEmpty() {return(super.isEmpty());}
  void add(A x)
   {super.add(x);
   } 
  void addMany(String [] a, int [] p, int n)
    { A x;
     for(int i=0;i<n;i++) {x = new A(a[i],p[i]); add(x);}
    }  
  void display()
    {System.out.println(" The elements of the list:");
     Iterator h = iterator();
     while(h.hasNext())
       System.out.println(h.next());
    }
 }
public class Main
 {
  public static void main(String[] args) throws Exception
   {String [] a = {"Hung", "Lan", "Ngo", "Khoai", "San"};
    int [] p = {22,18, 15, 11, 7};
    int n = 5;
    MySet t = new MySet();
    t.addMany(a,p,n); 
    t.display();
    A x = new A("ABC",15);
    t.display();
    t.add(x);
    System.out.println();
   }
}
