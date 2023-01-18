public class Matcher {

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0 && in.hasNext()) { // tem q ter o hasNext pra n dar runtime error
            String line = in.nextLine();

            Matcher matcher = Pattern.compile("<(.+)>(([^<>]+))</\\1>").matcher(line);
            // matcher com padrao regex esperado

            if (matcher.find() == false) { // caso n encontre print oq foi pedido passa pro prox loop
                System.out.println("None");
                continue;
            }

            matcher.reset(); // reset match amtes de verificar

            while (matcher.find() == true) { // agrupa os q foram encontrados dentro do padrao
                System.out.println(matcher.group(2));
            }
        }

        in.close();
        testCases--;

    }
}

}
