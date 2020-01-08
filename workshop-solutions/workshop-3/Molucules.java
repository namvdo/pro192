import java.util.Scanner;
public class Molucules {
    int structure;
    String name;
    float weight;
    void Moluclues(int struct, String n, float weight){
        this.structure = struct;
        this.name = n;
        this.weight = weight;
    }
    void display(){
        System.out.println(structure + " " + name + " " + weight);
    }
    public static void main(String[] args){
        Molucules[] mo = new Molucules[30];
        int structure;
        String name;
        float weight;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
        structure = sc.nextInt();
        name = sc.next();
        weight = sc.nextFloat();
        mo[i].Moluclues(structure, name, weight);
        }
        for(int i = 0; i < n; i++){
            mo[i].display();
        }

    }
}