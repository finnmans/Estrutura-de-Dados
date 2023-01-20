import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayList {
    class Solution {

        public static void main(String[] args) {
            /*
             * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
             * class should be named Solution.
             */

            Scanner scan = new Scanner(System.in);

            List<List<Integer>> arr = new ArrayList();

            int size = scan.nextInt(); // tamanho da matriz

            for (int j = 0; j < size; j++) { // preencher o arr de listas
                int k = scan.nextInt();
                List<Integer> lines = new ArrayList<Integer>();
                for (int i = 0; i < k; i++) { // preencher o lines
                    lines.add(scan.nextInt());
                }
                arr.add(lines); // add line
            }

            int q = scan.nextInt(); // qtd de queries

            for (int m = 0; m < q; m++) {
                int x = scan.nextInt(); // valor da linha
                int y = scan.nextInt(); // valor da coluna

                try {
                    System.out.println(arr.get(x - 1).get(y - 1));
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }
            }

        }
    }
}
