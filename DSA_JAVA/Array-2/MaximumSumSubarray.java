import java.util.*;

public class MaximumSumSubarray {

  // Driver Code
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
    sc.close();
    System.out.println(maxSubArraySum(arr));
  }

  // Function to return max subarray sum using Kadane’s Algorithm
  static int maxSubArraySum(int a[]) {
    int maxSoFar = a[0];
    int maxEndingHere = a[0];

    for (int i = 1; i < a.length; i++) {
      maxEndingHere = Math.max(a[i], maxEndingHere + a[i]);
      maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }

    return maxSoFar;
  }
}
