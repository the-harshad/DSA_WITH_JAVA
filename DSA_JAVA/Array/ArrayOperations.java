package Array;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); }

        performArrayOperations(arr, n);
        scanner.close();
    }

    public static void performArrayOperations(int[] arr, int n) {
        int sum = 0;
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] > max) max = arr[i]; 
        }

        int avg = sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Maximum: " + max);
    }
}
