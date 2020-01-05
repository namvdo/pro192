import java.util.*;
//Your task is to complete this class 
public class MyBook implements IBook {    
    //write the definition of method f1 here 
    @Override
    public String f1(ArrayList<Book> a) {
        return a.get(0).getName().toString();
    }  
    
    //write the definition of method f2 here 
    @Override
    public int f2(ArrayList<Book> a, int price) { 
        int count = 0;
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).getPrice() >= price){
                count++;
            }
        }
        return count;
    }    
    //add and complete you other methods (if needed) here   
     
}
