class X
  {void x_fun()
     {System.out.println("I am in X class");
     }
  }
class Y
  {void y_fun()
     {System.out.println("I am in Y class");
     }
  }
class A_class extends  X
  {class B_class extends Y 
      { 
      }
  }
class Main
 {public static void main(String args[]) throws Exception
   { A_class u = new A_class();
     A_class.B_class v = u.new B_class();
     u.x_fun();
     v.y_fun();
     System.out.println();
     }
 }
