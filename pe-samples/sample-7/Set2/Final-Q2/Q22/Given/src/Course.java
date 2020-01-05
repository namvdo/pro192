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
    public double getFee(){
        return this.fee;
    }
    class CourseFee implements Comparator<Course>{
        public int compare(Course c1, Course c2){
            if(c1.getFee() < c2.getFee()) return - 1;
            else if(c1.getFee() > c2.getFee()) return 1;
            else return 0;
        }
    }
    class CourseName implements Comparator<Course>{
        public int compare(Course a1, Course a2){
            return a1.getName().compareTo(a2.getName());
        }
    }
 
    //add and complete you other methods (if needed) here   

     
}
