import java.io.*;

public class Main {
  
    public static void main(String[] args) throws Exception {
       FileReader fr = new FileReader("Main.java");
       int k; char c;
       while(true) {
         k = fr.read();
         if(k == -1) break;
         c = (char) k;
         System.out.print(c);
        }
        fr.close();
       System.out.println(); 
    }
}