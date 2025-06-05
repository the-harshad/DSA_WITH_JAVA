package Array;
import java.util.*;

class Solution {
    public int LargestElement(int[] nums, int n) {
        int maxIndex = 0;
        int max = nums[0];
        int secondMax = Integer.MIN_VALUE;

        // Find max and maxIndex
        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        // Find second max (ignore maxIndex)
        for (int i = 0; i < n; i++) {
            if (i != maxIndex && nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        // Check if max is at least twice every other number
        if (max >= 2 * secondMax) {
            return maxIndex;
        } else {
            return -1;
        }
    }
}

public class LargestNumberTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution Obj = new Solution();
        System.out.println(Obj.LargestElement(nums, n));
        sc.close();
    }
}
