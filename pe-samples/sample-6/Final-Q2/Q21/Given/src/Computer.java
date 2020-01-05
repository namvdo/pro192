import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER. The function accepts following
     * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        Collections.sort(a);
        Collections.sort(b);
        // Write your code here
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        int x = a.get(a.size() - 1);
        for (int i = 0; i < a.size(); i++) {
            int count = 0;
            while (x <= b.get(0)) {
                if (x % a.get(i) == 0) {
                    count++;
                    if (count == a.size()) {
                        first.add(x);
                    }
                } else {
                    x++;
                }
            }
        }
        for(int i = 0; i < first.size(); i++){
            int count = 0;
            for(int j = 0; j < b.size(); i++){
                if(b.get(j) % first.get(i) == 0){
                    count++;
                    if(count == b.size()){
                        second.add(first.get(i));
                    }else{
                        i++;
                    }
                }
            }
        }
        return second.size();

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
