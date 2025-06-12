import java.util.*;

public class Sortingg01 {
    static int[] Sorting01(int n, int[] arr) {
        int left = 0, right = n - 1;
        
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else {
                if (arr[left] == 0) left++;
                if (arr[right] == 1) right--;
            }
        }
        
        return arr;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int[] ans = Sorting01(n, arr);
        for (int i = 0; i < n; ++i) {
            System.out.print(ans[i] + " ");
        }
    }
}
