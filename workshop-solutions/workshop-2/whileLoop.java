public class whileLoop {
    public static void main(String[] args){
        int i = 2;
        boolean flag = true;
        while(flag){
            if(i % 2 == 0){
                System.out.println(i);
            }
            if(i > 10){
                flag = false;
            }
            i++;
        }
    }
}