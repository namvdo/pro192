
public class Main {
 
 public static boolean isVowel(char x)
  {String vowel = "AEIOUY";
    x = Character.toUpperCase(x);
    return(vowel.indexOf(x)>=0);
  } 
  public static void main(String args[]) throws Exception {

      System.out.println(isVowel('a'));
  }
}
