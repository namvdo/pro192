import java.io.*;

public class Main
  { public static void main(String[] args) throws Exception
       { TestSerialization ts = new TestSerialization();
          ts.testInstanceObjest();
          ts.testClassObjest();
       }
   }
      
   // ***********************************************************************************
class TestSerialization
  { void testInstanceObjest() throws Exception
       {     
         // Serialize output an Instance Object
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("t1.tmp"));
        out.writeObject(new MySerializabe());
        out.flush();
         	   
         // ATTENTION: Changed the static and transient static value after storage
         MySerializabe.si  = 10000;
         MySerializabe.tsi = 100000;
         	   
         // Read back Serialized Instance Object
         ObjectInputStream in = new ObjectInputStream(new FileInputStream("t1.tmp"));
         MySerializabe mys = (MySerializabe)in.readObject();
         in.close();
         	   
          // .............................................................
          // Show the results
          System.out.println("Output from testInstanceObjest():\n");
         	   
          // instant values are serialized
          System.out.println("instance variable str          : " + mys.str);
          System.out.println("instance variable i            : " + mys.i);
         	   
          // static values are not serialized for an instant object!
          // The new value is picked up, not the old ones!
          System.out.println("static variable sstr           : " + mys.sstr);
          System.out.println("static variable si             : " + mys.si);
         	   
          // transient values are not serialized
          System.out.println("transient variable tstr        : " + mys.tstr);
          System.out.println("transient variable ti          : " + mys.ti);
         	   
          // transient static values are not serialized 
          // The new value is picked up, not the old ones!
          System.out.println("transient static variable tsstr: " + mys.tsstr);
          System.out.println("transient static variable tsi  : " + mys.tsi);
        }
      
   // **************************************************************
   void testClassObjest() throws Exception
       {
         // Serialize output Class Object
         Class c = Class.forName("MySerializabe");
         ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("t2.tmp"));
         out.writeObject(c);
         out.flush();
         	   
         // ATTENTION: Changed the static and transient static value after storage
         MySerializabe.si  = 11111;
         MySerializabe.tsi = 111111;
         	   
         // Read back Serialized Class Object
         ObjectInputStream in = new ObjectInputStream(new FileInputStream("t2.tmp"));
         Class cls = (Class)in.readObject();
         in.close();
         	   
         // .............................................................
         // Show the results
         System.out.println("\nOutput from testClassObjest():\n");

         // Only field with static modifier is legal to get value back
         // The new value is picked up, not the old ones!
         // which means they are both not serialized.
         // The conclusion: static and tansient static does not make any differece
      
         System.out.println("static variable sstr: " + cls.getDeclaredField("sstr").get(cls));
         System.out.println("static variable si: " + cls.getDeclaredField("si").getInt(cls));
         	   
          System.out.println("transient static variable tsstr: " + cls.getDeclaredField("tsstr").get(cls));
          System.out.println("transient static variable tsi: " + cls.getDeclaredField("tsi").getInt(cls));
         	   
          // all other fields will cause exceptions
          // uncomment this code and try it out!
          // System.out.println(cls.getDeclaredField("i").get(cls));
         	   	   
         	   
          // .............................................................
          // Obviously the serialzed Class object know all fields in itself
          System.out.println("\n  Print some reflections from Class MySerializabe:");
          System.out.println("     " + cls);
          System.out.println("     " + cls.getDeclaredField("str"));
          System.out.println("     " + cls.getDeclaredField("tstr"));
          System.out.println("     " + cls.getDeclaredField("sstr"));
          System.out.println("     " + cls.getDeclaredField("tsstr"));
          System.out.println("     " + cls.getDeclaredFields());
         }
   }

// ************************************************************
class MySerializabe implements Serializable
   { String str   = "STRING";
      static String sstr  = "STATIC STRING";
      transient String tstr  = "TRANSIENT STRING";
      transient static String tsstr = "TRANSIENT STATIC STRING";
      
      int i   = 1;
      static int si  = 10;
      transient        int ti  = 100;
      transient static int tsi = 1000;
    }

/* OUTPUT:

Output from testInstanceObjest():

instance variable str : STRING
instance variable i: 1
static variable sstr: STATIC STRING
static variable si: 10000
transient variable tstr: null
transient variable ti: 0
transient static variable tsstr: TRANSIENT STATIC STRING
transient static variable tsi: 100000

Output from testClassObjest():

static variable sstr: STATIC STRING
static variable si: 11111
transient static variable tsstr: TRANSIENT STATIC STRING
transient static variable tsi: 111111

  Print some reflections from Class MySerializabe:
     class MySerializabe
     java.lang.String MySerializabe.str
     transient java.lang.String MySerializabe.tstr
     static java.lang.String MySerializabe.sstr
     static transient java.lang.String MySerializabe.tsstr
     [Ljava.lang.reflect.Field;@64f64241
*/
