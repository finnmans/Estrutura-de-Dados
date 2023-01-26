import java.io.*;
import java.util.*;

public class BitSets {

    class Solution {

        public static void main(String[] args) {
            /*
             * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
             * class should be named Solution.
             */
            Scanner sc = new Scanner(System.in);

            int size = sc.nextInt();
            int ops = sc.nextInt();

            BitSet b1 = new BitSet(size);
            BitSet b2 = new BitSet(size);
            BitSet[] b = new BitSet[3];
            b[1] = b1;
            b[2] = b2;

            for (int i = 0; i < ops; i++) {
                String operat = sc.next();
                int set = sc.nextInt();
                int pos = sc.nextInt();

                switch (operat) {
                    case ("AND"):
                        b[set].and(b[pos]);
                        break;
                    case ("OR"):
                        b[set].or(b[pos]);
                        break;
                    case ("XOR"):
                        b[set].xor(b[pos]);
                        break;
                    case ("FLIP"):
                        b[set].flip(pos);
                        break;
                    case ("SET"):
                        b[set].set(pos);
                        break;
                }
                System.out.println(b[1].cardinality() + " " + b[2].cardinality());
            }

        }
    }
}
