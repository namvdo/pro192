
public class Seller extends Employee {  

    double revenue;
   
    public Seller() {
    }

    public Seller(String name, double revenue, double salary) {
        super(name, salary);
        this.revenue = revenue;
    }
    public String toString() { return this.name + " " + this.salary + " " + this.revenue; }
    public double getSalary() {
        if(revenue < 30000){
            if(name.charAt(0) == 'C' || name.charAt(0) == 'c'){
                return Math.ceil(salary + salary * 0.0005);
            }else{
                return Math.floor(salary + salary * 0.0005);
            }
        }else{
            if(name.charAt(0) == 'C' || name.charAt(0) == 'c'){
                return Math.ceil(salary + salary * 0.0001);
            }else{
                return Math.floor(salary + salary * 0.0001);
            }
        }
    }
    
     /*Complete the below function for second test case*/
    
    //add and complete your other methods here (if needed)
    
}
