import java.io.*;
class Main
 {
  public static void main(String[] args) throws Exception
   {RandomAccessFile f = new RandomAccessFile("vut.txt","rw");
    f.writeInt(5);
    f.writeDouble(15.5);
    f.writeBytes("ABC XYZ");
    f.close();
    f = new RandomAccessFile("vut.txt","r");
    int k; double x;String s;
    k = f.readInt();
    x = f.readDouble();
    s = f.readLine();
    f.close();
    System.out.println(" k = " + k + ", x = " + x); 
    System.out.println(" s = " + s); 

   }
 }