import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class TdArray {
class Solution {

    static void sumHourg(List<List<Integer>> arr){
        int sum = Integer.MIN_VALUE;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int top = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                int mid = arr.get(i+1).get(j+1);
                int bot = arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                if((top+mid+bot) > sum) sum = top + mid + bot;
            }
        }
        System.out.println(sum);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        sumHourg(arr);
        bufferedReader.close();
    }
}

}
