import java.util.*;

public class Deque {
    class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            HashSet hash = new HashSet<>();

            int n = in.nextInt();
            int m = in.nextInt();
            int max = 0;

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num); // add to deque
                hash.add(num); // add to a hashset
                if (deque.size() == m) { // if deque is equals to subarray size
                    max = Math.max(max, hash.size()); // compare a max with the hash size, since is unique
                    int remove = (int) deque.removeFirst(); // remove the first so it will loop again
                    if (!deque.contains(remove))
                        hash.remove(remove); // if doque dosent have the value, remove from hashset
                }

            }
            System.out.println(max);
        }
    }

}
