package Array;
import java.util.*;

public class array1 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int ans = ArrayProblem1(n, arr);
        System.out.println(ans);
        
        sc.close();
    }

    public static int ArrayProblem1(int n, int[] arr) {
        int max = arr[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        } return index;
    }
}
