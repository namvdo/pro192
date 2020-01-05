import java.io.*;

// A Java application to demonstrate making your own Exception class
// This program catches the exception when the word "client" is
// entered incorrectly.

public class Main
{
  static String s = "";
  

//--------------------------------------------------------
  public static void main (String args[])
  {
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader buf = new BufferedReader(is);

    System.out.print("Enter the word you cannot spell: ");

    try
    {
      s = buf.readLine();
    }
    catch (IOException e)
    {
      System.out.println("IOException was " + e.getMessage());
    }
    

    try
    {
      checkSpelling();   // this method throws SpellException
    }
    catch (SpellException se)   // but it is caught here
    {
      System.out.println("Spell exception was: " + se.getError());
    }
  } // end main
  

//----------------------------------------------------------
// Check spelling of typed in word. Throw exception if wrong.
// Note how this method specifies that it throws such and such 
// exception. Does not have to be caught here.

  private static void checkSpelling() throws SpellException
  {
    if (s.equalsIgnoreCase("client"))
      System.out.println("OK");
    else
      throw new SpellException("Cannot spell client");
   }

}  // end main class

//***********************************************
// Custom exception class that descends from Java's Exception class.

class SpellException extends Exception
{
  String mistake;

//----------------------------------------------
// Default constructor - initializes instance variable to unknown

  public SpellException()
  {
    super();             // call superclass constructor
    mistake = "unknown";
  }
  

//-----------------------------------------------
// Constructor receives some kind of message that is saved in an instance variable.

  public SpellException(String err)
  {
    super(err);     // call super class constructor
    mistake = err;  // save message
  }
  

//------------------------------------------------  
// public method, callable by exception catcher. It returns the error message.

  public String getError()
  {
    return mistake;
  }
}
