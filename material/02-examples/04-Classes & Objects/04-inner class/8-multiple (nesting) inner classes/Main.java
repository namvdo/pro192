class A_class
  { void a_fun() {System.out.println("I am in A_class");}
    class B_class 
      { void b_fun() {System.out.println("I am in B_class");}
        class  C_class
          { void c_fun() {System.out.println("I am in C_class");}
          }  
      }
  }
class Main
 {public static void main(String args[]) throws Exception
   {A_class a = new A_class();
     A_class.B_class b = a.new B_class();
     A_class.B_class.C_class c = b.new C_class();
     a.a_fun(); 
     b.b_fun(); 
     c.c_fun(); 
     System.out.println();
   }
 }
