import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HashSet {

    class Solution {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            String[] pair_left = new String[t];
            String[] pair_right = new String[t];

            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
            }

            Set<Set> sets = new HashSet<>();

            for (int j = 0; j < t; j++) {
                Set<String> pairs = new HashSet<>();
                pairs.add(pair_left[j] + "," + pair_right[j]);
                sets.add(pairs);
                System.out.println(sets.size());
            }
        }
    }
}
