import java.util.*;

public class EvenOddSorting {
    static void oddEvenSort(int a[], int n) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i <= n - 2; i += 2) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
            for (int i = 0; i <= n - 2; i += 2) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        oddEvenSort(array, n);
    }
}
