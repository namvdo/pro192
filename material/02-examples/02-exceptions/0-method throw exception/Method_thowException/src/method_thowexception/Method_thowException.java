package method_thowexception;


public class Method_thowException
{
  public static void main (String args[]) throws InvalidSpeedException
    {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();

            // do something

            // print something useful, TODO         
        System.out.println(v1.getSpeed());
        try{
        v1.speedUp(108);
         System.out.println(v1.getSpeed());}
        catch(InvalidSpeedException e) {System.out.println(e.getMessage());}
         v1.speedDown(5);
         System.out.println(v1.getSpeed());
         //v1.speedUp(3);
       
     } // end main
 } 
