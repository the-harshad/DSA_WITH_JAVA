import java.util.*;

public class ArraySwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        if (X <= N / 2) {
            System.out.println("YES");
        } else {
            int[] sorted = A.clone();
            Arrays.sort(sorted);
            boolean same = true;
            for (int i = 0; i < N; i++) {
                if (A[i] != sorted[i]) {
                    same = false;
                    break;
                }
            }
            System.out.println(same ? "YES" : "NO");
        }
    }
}