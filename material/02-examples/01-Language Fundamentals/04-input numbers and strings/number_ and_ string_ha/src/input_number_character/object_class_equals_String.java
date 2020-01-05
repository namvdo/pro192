/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_number_character;
import java.util.*;
import java.lang.Comparable;
/**
 *
 * @author Phan Ha
 */
class Person{String name;
  Person(String name) {this.name = name;}
  /*public boolean equals(Object x)// Nếu không có cái này sẽ báo không tương đương
   {Person y = (Person) x;
    return(name.equals(y.name));
   }*/
public String toString() {return(name);} 
 }
public class object_class_equals_String 

 {
  public static void main(String[] args) throws Exception
   {
System.out.println("SO SANH 2 Xau equals");
    String str="lan";
    String st="L";
    System.out.println(str.equals(st));
    System.out.println("SO SANH 2 Xau CompareTo");
       System.out.println("so sanh"+str.compareTo(st));
   String str1="lan";
   String st1="lan";
    System.out.println("so sanh"+str1.compareTo(st1));
     String str2="L";
   String st2="lan";
    System.out.println("so sanh"+str2.compareTo(st2));
///////Tách 2 xau
String str3="Phan thị Hà";
String b1[]=str3.split(" ");
for(int i=0;i<=b1.length-1;i++)
   System.out.println(b1[i]+" "); 
System.out.println("INDEXOF");

int i= str3.indexOf(" ");
 System.out.println(str3.substring(i+1,str3.length())); 
 
 System.out.println("Tokenizer");
StringTokenizer h;
h=new StringTokenizer(str3," ");
for(int i1=0;i1<str.length();i1++)
System.out.println(h.nextToken()+" "); 
char h1=str3.charAt(0);
System.out.println(h1); 

System.out.println(" SO SÁNH 2 ĐỐI TƯỢNG");
Person a = new Person("HUNG");
 System.out.println(a.toString());
   Person b; b=a;
   System.out.println(a.equals(b));
   Person bb = new Person("HUNG");
    System.out.println(a.equals(bb));
   
   }
}

