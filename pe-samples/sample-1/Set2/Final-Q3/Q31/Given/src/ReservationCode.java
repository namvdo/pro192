public class ReservationCode {
    String customerName;
    String code;
    public ReservationCode(String code, String customerName) {
        this.customerName = customerName;
        this.code = code;
    }
    public String toString(){
        return this.customerName + " " + this.code;
    }
     
    String getCode() {
        String a = "";
        for(char x: customerName.toCharArray()){
            if(x >= 'a' && x <= 'z'){
                x = (char) ((char) ((x - 'a' + 1) % 26) + 'a');
                a += x;
            }else if(x >= 'A' && x <= 'Z'){
                x = (char) ((char) ((x - 'A' + 1) % 26) + 'A');
                a += x;
            }else{
                a += x;
            }
        }
        return a;
    }
    
    /*add and complete your other methods here (if needed)*/
    
}
