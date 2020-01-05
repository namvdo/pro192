

 
import java.util.*;

public class MyCourse implements ICourse { 

     
    @Override
    public void f1(List<Course> a, int st) {
        if(st == 1){
           Collections.sort(a, new Comparator<Course>() {
               public int compare(Course x, Course y){
                   if(x.getFee() < y.getFee()) return -1;
                   else if(x.getFee() > y.getFee()) return 1;
                   else return 0;
               }
           });
        }
        else{
           for(int i = 0; i < a.size(); i++){
               if(a.get(i).getFee() <= 120){
                   a.remove(i);
               }
           }
        }
    }
    

    @Override
    public int f2(List<Course> a, double fee) {
        Iterator <Course> x = a.iterator();
        int count = 0;
        while(x.hasNext()){
            if(x.next().getFee() >= fee){
                count++;
            }
        }
        return count;
    }
     
}
