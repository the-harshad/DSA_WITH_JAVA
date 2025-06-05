package Array;
import java.util.*;

public class SumofArraySelf {

    public static int[] SumArrayExpectSelf(int[] nums, int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = totalSum - nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] Ans = SumArrayExpectSelf(nums, n);

        for(int a : Ans)
            System.out.print(a + " ");
        sc.close();
    }
}

