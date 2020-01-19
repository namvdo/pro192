import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Anagram {
    static boolean areAnagram(String a, String b) {
        a = a.replaceAll(" ", "");
        b = b.replaceAll(" ", "");
        Map<String, Integer> mapA = new HashMap();
        Map<String, Integer> mapB = new HashMap();
        for (int i = 0; i < a.length(); i++) {
            if (mapA.get(a.charAt(i) + "") == null) {
                mapA.put(a.charAt(i) + "", 1);
            } else {
                mapA.put(a.charAt(i) + "", mapA.get(a.charAt(i) + "") + 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (mapB.get(b.charAt(i) + "") == null) {
                mapB.put(b.charAt(i) + "", 1);
            } else {
                mapB.put(b.charAt(i) + "", mapB.get(b.charAt(i) + "") + 1);
            }
        }
        return mapA.equals(mapB);
    }

    public static void main(String[] args) {
        System.out.println("Enter two strings");
        Scanner x = new Scanner(System.in);
        String a = x.nextLine();
        String b = x.nextLine();
        x.close();
        if(areAnagram(a, b)) System.out.println("They are anagram");
        else System.out.println("They are not anagram");
    }
}
