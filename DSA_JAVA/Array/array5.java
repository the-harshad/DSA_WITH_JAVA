package Array;
import java.util.*;

public class array5 {

    public static int ArrayProblem(int[] arr, int k) {
        int count = 0;

        for (int i=0; i<arr.length-1; i++) {
            if (arr[i]+arr[i+1]==k) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println(ArrayProblem(arr, k));
    
        sc.close();
    }
}

