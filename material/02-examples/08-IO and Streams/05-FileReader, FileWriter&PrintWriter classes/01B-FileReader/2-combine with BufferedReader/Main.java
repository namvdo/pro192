import java.io.*;

public class Main {
  
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("Main.java");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while((s = br.readLine()) != null) {
           System.out.println(s);
        }
       fr.close(); 
       System.out.println(); 
    }
}