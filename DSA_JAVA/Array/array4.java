package Array;
import java.util.*;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Size of first array
        int[] arrA = new int[n];
        for (int i = 0; i < n; ++i) {
            arrA[i] = sc.nextInt();
        }

        int m = sc.nextInt();  // Size of second array
        int[] arrB = new int[m];
        for (int i = 0; i < m; ++i) {
            arrB[i] = sc.nextInt();
        }

        System.out.println(ArrayProblem(arrA, arrB));

        sc.close();
    }

    public static String ArrayProblem(int[] arrA, int[] arrB) {
        int sumA = 0, sumB = 0;

        for (int num : arrA) {
            sumA += num;
        }

        for (int num : arrB) {
            sumB += num;
        }

        if (sumA > sumB) {
            return "First array is larger";
        } else if (sumB > sumA) {
            return "Second array is larger";
        } else {
            return "Both are equal";
        }
    }
}

