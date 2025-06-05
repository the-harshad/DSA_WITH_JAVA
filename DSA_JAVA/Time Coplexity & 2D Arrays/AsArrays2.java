import java.io.*;
import java.util.*;

class AsArrays2 {
    static int greater(int arr[], int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > 20) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // array size
        int arr[] = new int[N]; // creating array of size N

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // taking input of array elements
        }

        int ans = greater(arr, N);
        System.out.println(ans);
        sc.close();
    }
}
