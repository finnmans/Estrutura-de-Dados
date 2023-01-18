
import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.in;

public class isPrimerArrFunction {

    static class Prime {
        public void checkPrime(int... num) {
            for (int number : num) {
                if (number == 0 || number == 1)
                    System.out.print("");
                else if (number == 2)
                    System.out.print(number + " ");
                else {
                    boolean opitmusPrime = true;
                    for (int i = 2; i <= number / 2; i++) {
                        if (number % i == 0) {
                            opitmusPrime = false;
                            break;
                        }
                    }
                    if (opitmusPrime)
                        System.out.print(number + " ");
                    else
                        System.out.print("");
                }
            }
            System.out.println();
        }
    }

    class Solution {

        public static void main(String[] args) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                int n1 = Integer.parseInt(br.readLine());
                int n2 = Integer.parseInt(br.readLine());
                int n3 = Integer.parseInt(br.readLine());
                int n4 = Integer.parseInt(br.readLine());
                int n5 = Integer.parseInt(br.readLine());
                Prime ob = new Prime();
                ob.checkPrime(n1);
                ob.checkPrime(n1, n2);
                ob.checkPrime(n1, n2, n3);
                ob.checkPrime(n1, n2, n3, n4, n5);
                Method[] methods = Prime.class.getDeclaredMethods();
                Set<String> set = new HashSet<>();
                boolean overload = false;
                for (int i = 0; i < methods.length; i++) {
                    if (set.contains(methods[i].getName())) {
                        overload = true;
                        break;
                    }
                    set.add(methods[i].getName());

                }
                if (overload) {
                    throw new Exception("Overloading not allowed");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

}
