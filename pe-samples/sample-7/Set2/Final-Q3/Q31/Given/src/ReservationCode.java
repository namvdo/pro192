import java.util.*;
public class ReservationCode {
    
    String code;
    String name;
    public ReservationCode(String code, String customerName) {
        this.code = code;
        this.name = customerName;
    }
    
     
    String getCode() {
        ArrayList <String> ab = new ArrayList<String>();
        for(int i = 0; i < code.length(); i += 3){
            ab.add(code.substring(i, Math.min(i + 3, code.length())));
        }
        return String.join("-", ab);
    }
    public String toString(){
        return this.name + " " + this.code;
    }
    
    /*add and complete your other methods here (if needed)*/
    
}
