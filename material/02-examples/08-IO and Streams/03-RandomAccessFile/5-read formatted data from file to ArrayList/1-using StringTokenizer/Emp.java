class Emp
 {String code, name; int age; double sal;
   Emp() {}
   Emp(String xCode, String xName, int xAge, double xSal)
    {code=xCode;name=xName;age=xAge;sal=xSal;}
   public String toString() {return("("+code + ","+name+","+age+","+sal+") ");}
 }
