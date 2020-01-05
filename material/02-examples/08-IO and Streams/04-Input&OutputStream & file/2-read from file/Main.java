import java.io.*;
class Main 
 {public static void main(String [] args) throws Exception
   {File f = new File("test.bin");
    FileInputStream fi = new FileInputStream(f);
    DataInputStream in = new DataInputStream(fi);
    int k=0; float x=0.0f; double y = 0.0;
    k = in.readInt();
    x = in.readFloat();
    y = in.readDouble();
    in.close();
    fi.close();
    System.out.println("k, x, y = " + k + ", " + x + ", " + y);

  }
 }\