import java.io.*;

public class Main {
  
    public static void main(String[] args) throws Exception {
       PrintWriter pw = new PrintWriter("test.txt");
       int k = 5; float x = 12.7f; double y = 23.83;
       pw.write("Hello\r\n");
       pw.println("k = " + k);
       pw.println("x = " + x);
       pw.println("y = " + y);
       pw.flush();
       pw.close();
       System.out.println(); 
    }
}