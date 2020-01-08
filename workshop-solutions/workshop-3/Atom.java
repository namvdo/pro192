import java.util.*;

public final class Atom {
    private final int number;
    private final String symbol;
    private final String fullName;
    private final float weight;

    public Atom(int number, String symbol, String fullName, float weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullName = fullName;
        this.weight = weight;
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public String getFullName() {
        return this.fullName;
    }
    
    public float getWeight() {
        return this.weight;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atom atom = (Atom) o;
        return number == atom.number &&
                Float.compare(atom.weight, weight) == 0 &&
                Objects.equals(symbol, atom.symbol) &&
                Objects.equals(fullName, atom.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, symbol, fullName, weight);
    }

    @Override
    public String toString() {
        return this.number + " " + this.symbol + " " + this.fullName + " " + this.weight;
    }
    public static void main(String[] args) {
        System.out.println("Atomic Information");
        System.out.println("------------------");
        List<Atom> atoms = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter atomic number: ");
            int atomicNumber = sc.nextInt();
            if (atomicNumber == 0) {
                break;
            }

            System.out.println("Enter atomic symbol: ");
            String symbol = sc.next();

            System.out.println("Enter atomic fullname: ");
            String fullName = sc.next();

            System.out.println("Enter atomic weight: ");
            float weight = sc.nextFloat();
            
            Atom atom = new Atom(atomicNumber, symbol, fullName, weight);
            atoms.add(atom);
        }

        for(Atom atom: atoms){
            System.out.println(atom);
        }
    }
}