import java.util.*;
public class Course {   
    double fee;
    String name;
    public Course() {
        
    }

    
    public Course(String name, double fee) {
        this.name = name;
        this.fee = fee;
    }
 
    public String getName() {
        return this.name;
    }
    public double getFee() { return this.fee; }
    //add and complete you other methods (if needed) here   
    /*
    public int compareTo(Course a){
        if(this.getFee() < a.getFee()) return -1;
        else if(this.getFee() > a.getFee()) return 1;
        else return 0;
    }
     */
}
