import java.util.Scanner;
public class rotatearraynum {
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        k = ((k % n) + n) % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        rotateArray(arr, k);
        
        for(int num : arr){
            System.out.print(num + " "); 
        }

        scanner.close();
    }
}
