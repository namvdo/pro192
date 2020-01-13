import java.util.*;

public class PhoneNumber {
    int area;
    String number;

    public PhoneNumber() {
    }

    public PhoneNumber(int area, String number) {
        this.area = area;
        this.number = number;
    }

    void display() {
        System.out.println(area + " " + number);
    }
}

class IntPhoneNumber extends PhoneNumber {
    String countryCode;

    public IntPhoneNumber() {
    }

    public IntPhoneNumber(String c, int a, String n) {
        super(a, n);
        this.countryCode = c;
    }

    void display() {
        System.out.println(area + " " + number + " " + countryCode);
    }
}

class Main {
    public static void main(String[] args) {
        List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
        List<IntPhoneNumber> intPhoneNumbers = new ArrayList<IntPhoneNumber>();
        Stack <String> phoneNums = new Stack <> ();
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("Enter list of phone number");
        System.out.println("---------------------------");
        do {
            int area;
            String number;
            String country;
            System.out.println("Type of phone number ? (1 - local phone, 2 - Inter phone, 0 - exit" );
            option = sc.nextInt();
            if(option == 1){
                System.out.println("Enter area code");
                area = sc.nextInt();
                System.out.println("Enter number");
                number = sc.next();
                phoneNumbers.add(new PhoneNumber(area, number));
                phoneNums.push("" + area + " " + number);
            }else if(option == 2){
                System.out.println("Enter country code");
                country = sc.next();
                System.out.println("Enter area code");
                area = sc.nextInt();
                System.out.println("Enter number");
                number = sc.next();
                intPhoneNumbers.add(new IntPhoneNumber(country, area, number));
                phoneNums.push("" + country + " " + area + " " + number);
            }
        } while (option != 0);
        sc.close();
        System.out.println("List of the phone numbers: ");
        Iterator <PhoneNumber> a = phoneNumbers.iterator();
        while(a.hasNext()){
            a.next().display();
        }
        Iterator <IntPhoneNumber> b = intPhoneNumbers.iterator();
        while(b.hasNext()){
            b.next().display();
        }

        System.out.println("List of the phone numbers: ");
        // Identical on the question
        Iterator <String> x = phoneNums.iterator();
        while(x.hasNext()){
            System.out.println(x.next());
        }
    }
}