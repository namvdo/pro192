/*
derrived class cannot override inner class(for low version java only)
*/
class A_class
  { void a_fun() {System.out.println("I am in A_class");}
    class B_class 
      { void b_fun() {System.out.println("I am in B_class in side A_class");}
        class  C_class
          { void c_fun() {System.out.println("I am in C_class");}
          }  
      }
  }
class X_class extends  A_class
  { void x_fun() {System.out.println("I am in X_class");}
    class B_class 
      { void b_fun() {System.out.println("I am in B_class inside X_class.");}
      }
  }
class Main
 {public static void main(String args[]) throws Exception
   { A_class u = new A_class();
     A_class.B_class v = u.new B_class();
     v.b_fun();

     System.out.println();
     X_class t = new X_class();
     X_class.B_class h = t.new B_class();
     h.b_fun();
     System.out.println();
     }
 }
