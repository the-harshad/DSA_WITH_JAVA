package Array;
import java.util.*;

public class Buildings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print building pattern from top to bottom
        for (int level = max; level >= 1; level--) {
            for (int i = 0; i < n; i++) {
                if (arr[i] >= level) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}