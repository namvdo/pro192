import java.io.*;
import java.util.*;
class Logon implements Serializable
  { private Date date = new Date();
    private String username;
    private transient String password;
    public Logon(String name, String pwd)
       { username = name;
         password = pwd;
       }
    public String toString()
       { String pwd = (password == null) ? "(n/a)" : password;
         return "logon info: \n username: " + username +
         "\n date: " + date + "\n password: " + pwd;
       }
  }
public class Main
   { public static void main(String[] args) throws Exception
       { Logon a = new Logon("Hulk", "myLittlePony");
         System.out.println( "logon a = " + a);
         ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Logon.out"));
          o.writeObject(a);
          o.close();
          Thread.sleep(1000); // Delay for 1 second
           // Now get them back:
           ObjectInputStream in = new ObjectInputStream(new FileInputStream("Logon.out"));
           System.out.println("Recovering object at "+new Date());
           a = (Logon)in.readObject();
           System.out.println("logon a = " + a);
        }
   }