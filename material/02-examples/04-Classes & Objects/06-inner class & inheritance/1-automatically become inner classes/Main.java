class A_class
  { void a_fun() {System.out.println("I am in A_class");}
    class B_class 
      { void b_fun() {System.out.println("I am in B_class");}
        class  C_class
          { void c_fun() {System.out.println("I am in C_class");}
          }  
      }
  }
class X_class extends  A_class
  {void x_fun() {System.out.println("I am in X_class");}
  }
class Main
 {public static void main(String args[]) throws Exception
   {X_class t = new X_class();
     X_class.B_class b = t.new B_class();
     X_class.B_class.C_class c = b.new C_class();
     t.x_fun(); 
     t.a_fun(); 
     b.b_fun(); 
     c.c_fun(); 
     System.out.println();
   }
 }
