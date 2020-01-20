import java.util.Scanner;
class HexToDecimal {
    private static int toDigits(char a){
        if(a >= '0' && a <= '9'){
            return Integer.parseInt(a+"");
        }
        return Integer.parseInt(a - 55 + "");
    }
    private static int hexToDecimal(String num){
        int value = 0;
        for(int i = 0; i < num.length(); i++){
            value = value * 16 + toDigits(num.charAt(i));
        }
        return value;
    }
    public static void main(String ...xxx){
        System.out.println("Enter a valid hexadecimal number: ");
        Scanner sc = new Scanner (System.in);
        String hex = sc.next().toUpperCase();
        sc.close();
        for(int i = 0; i < hex.length(); i++){
            if(hex.charAt(i) < '0' || hex.charAt(i) > '9' || hex.charAt(i) < 'A' || hex.charAt(i) > 'F'){
                System.out.println("Invalid hex value");
                return;
            } 
        }
        System.out.println(hexToDecimal(hex));
    }
}