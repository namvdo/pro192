
public class Seller extends Employee {  
    
    double revenue;
   
    public Seller() {
    }

    public Seller(String name, double revenue, double salary) {
        super(name, salary);
        this.revenue = revenue;
    }
    
     /*Complete the below function for second test case*/
    public double getSalary() {
        if(revenue < 30000){
            return salary + revenue * 0.05;
        }else{
            return salary + revenue * 0.1;
        }
    }  
    public String toString(){
        return this.name + " " + this.salary +  " " + this.revenue;
    }
    //add and complete your other methods here (if needed)
    
}
