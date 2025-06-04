package Array;
import java.util.*;

public class secondLargestfromarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int largestCount = 0;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
                largestCount = 1;
            } else if (num == largest) {
                largestCount++;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        // If largest repeats, second largest is largest itself
        if (largestCount > 1) {
            System.out.println(largest);
        } else if (secondLargest == Integer.MIN_VALUE) {
            // No second largest distinct element found
            System.out.println("No second largest element");
        } else {
            System.out.println(secondLargest);
        }

        sc.close();
    }
}