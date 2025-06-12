import java.util.*;

public class StrangeStrings {

    static String strangeString(int n) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            char ch = (char)('a' + (i % 26));
            if (i % 2 == 0) {
                deque.addFirst(ch);
            } else {
                deque.addLast(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : deque) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            System.out.println(strangeString(n));
        }
    }
}