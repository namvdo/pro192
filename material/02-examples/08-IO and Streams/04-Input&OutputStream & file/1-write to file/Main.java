import java.io.*;
class Main 
 {public static void main(String [] args) throws Exception
   {File f = new File("test.bin");
    FileOutputStream fo = new FileOutputStream(f);
    DataOutputStream o = new DataOutputStream(fo);
    int k = 15; float x = 25.8f; double y = 234.789;
    o.writeInt(k);
    o.writeFloat(x);
    o.writeDouble(y);
    o.close();
    fo.close();
    System.out.println();

  }
 }