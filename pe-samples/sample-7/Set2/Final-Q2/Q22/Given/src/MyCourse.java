

 
import java.util.*;

public class MyCourse implements ICourse { 

    public static Comparator compareFee = new Comparator<Course>() {
        public int compare(Course x, Course y){
            if(x.getFee() < y.getFee()){ return - 1;}
            else if(x.getFee() > y.getFee()) { return 1; }
            return 0;

        }
    };
    public static Comparator compareName = new Comparator<Course>(){
        public int compare(Course x, Course y){
            return -(x.getName().compareToIgnoreCase(y.getName()));
        }
    };
     
    @Override
    public void f1(List<Course> a, int st) {
        if(st == 1){
        Collections.sort(a, new Comparator<Course>() {
                public int compare(Course c1, Course c2) {
                    if(c1.getFee() < c2.getFee()) return - 1;
                    else if(c1.getFee() > c2.getFee()) return 1;
                    else return 0;
                }
            });
            
        }if(st == 2){
            Collections.sort(a, new Comparator<Course>() {
                public int compare(Course c1, Course c2){
                    if(c1.getName().toLowerCase().compareTo(c2.getName().toLowerCase()) < 0){
                        return 1;
                    }else if(c1.getName().toLowerCase().compareTo(c2.getName().toLowerCase()) > 0){
                        return - 1;
                    }else return 0;
                }
            });
        }
    }
    

    @Override
    public int f2(List<Course> a, double fee) {
        int count = 0;
        Iterator <Course> x = a.iterator();
        while(x.hasNext()){
            if(x.next().getFee() >= fee ){
                count++;
            }
        }
        return count;
    }
     
}
