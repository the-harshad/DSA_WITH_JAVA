import java.util.*;

public class TripletsMaxDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] points = new int[N];
        for (int i = 0; i < N; i++) {
            points[i] = sc.nextInt();
        }
        int L = sc.nextInt();

        Arrays.sort(points);
        long count = 0;

        for (int i = 0, j = 0; i < N; i++) {
            while (j < N && points[j] - points[i] <= L) {
                j++;
            }
            int total = j - i - 1;
            if (total >= 2) {
                count += (long) total * (total - 1) / 2;
            }
        }

        System.out.println(count);
    }
}