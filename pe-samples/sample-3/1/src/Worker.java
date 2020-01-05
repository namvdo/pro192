
public class Worker extends Person{  
    int salary;
    String departmentName;
    public Worker(String name, int salary, String deptName) { 
        super(name);
        this.salary = salary;
        this.departmentName = deptName;
        //your code goes here     
    }
    
    public String getName() { return this.name; }
    public int getSalary() { return this.salary; }
    public String getDepartName() { return this.departmentName; }
    //add and complete your other methods here (if needed)
    public String toString() {
        return this.name + " " + this.salary + " " + this.departmentName;
    }
}
