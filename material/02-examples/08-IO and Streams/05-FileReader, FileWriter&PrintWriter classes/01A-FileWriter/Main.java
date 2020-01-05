import java.io.*;

public class Main {
  
    public static void main(String[] args) throws IOException {

      FileWriter f = new FileWriter("test.txt"); 
       // Writes the content to the file
       f.write("This\r\n is\r\n an\r\n example\r\n"); 
       //f.flush();
       f.close();
       System.out.println(); 
    }
}