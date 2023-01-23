import java.util.*;

public class Stack {
    class Solution {

        public static void main(String[] argh) {
            Scanner sc = new Scanner(System.in);

            while (sc.hasNext()) {
                String input = sc.next();
                Deque<Character> stack = new ArrayDeque<Character>();

                for (int i = 0; i < input.length(); i++) {
                    char s = input.charAt(i);
                    if (s == '(' || s == '[' || s == '{') {
                        stack.push(s);
                    } else {
                        try {
                            if (s == ')' || s == ']' || s == '}') {
                                stack.pop();
                            }
                        } catch (EmptyStackException e) {
                            break;
                        }
                    }
                }
                if (stack.isEmpty())
                    System.out.println("true");

                else
                    System.out.println("false");

                stack.clear();
            }
            sc.close();

        }
    }

}
