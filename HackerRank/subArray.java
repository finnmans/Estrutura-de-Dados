import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class subArray {

    public class Solution {

        public static void main(String[] args) {
            /*
             * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
             * class should be named Solution.
             */
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[sc.nextInt()];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int k = 0;
            int count = 0;

            while (k < arr.length) {
                for (int i = 0; i < arr.length - k; i++) {
                    int sum = 0;
                    for (int j = i; j < i + k + 1; j++) {
                        sum += arr[j];
                    }
                    if (sum < 0)
                        count++;

                }
                k++;
            }
            System.out.println(count);

        }
    }
}
