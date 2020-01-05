class A {}
class B extends A {}
public class Main
 {public static void main(String [] args)
   {B g = new B();
    A t= (A) g;
    B h= (B) t; 
    
    System.out.println();
   }
 }
/*
    compile ok, but run error
    A t= new A();
    B h= (B) t; 

    both compile and run ok
    B g = new B();
    A t= (A) g;
    B h= (B) t; 

*/