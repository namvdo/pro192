class A {}
class B extends A {}
public class Main
 {public static void main(String [] args)
   {A t=new A(); B h = new B();
    t=h;//Ok
    h= (B) t; // Ok 
    
    System.out.println();
   }
 }

/*

public class Main
 {public static void main(String [] args)
   {A t=new A(); B h = new B();
    h= (B) t; // ClassCastException 
    t=h;//Ok
    
    System.out.println();
   }
 }

*/