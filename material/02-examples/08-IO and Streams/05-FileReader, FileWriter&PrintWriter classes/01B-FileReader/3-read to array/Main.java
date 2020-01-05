import java.io.*;

public class Main {
  
    public static void main(String[] args) throws Exception {

      FileReader fr = new FileReader("Main.java"); 
      char [] a = new char[500];
      fr.read(a); // reads the content to the array
      for(char c : a) {
          if(c=='\0') break;
          System.out.print(c); //prints the characters one by one
        }
       fr.close();
       System.out.println(); 
    }
}