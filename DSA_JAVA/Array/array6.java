package Array;
import java.util.*;

public class array6 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }
        int ans = ArrayProblem6(n, arr);
        System.out.println(ans);
        sc.close();
    }

    public static int ArrayProblem6(int n, int[] arr){
        int lastIndex = -1;
        int minDistance = Integer.MAX_VALUE;
        int evenCount = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] > 0 && arr[i] % 2 == 0) {
                evenCount++;
                if(lastIndex != -1) {
                    minDistance = Math.min(minDistance, i - lastIndex);
                }
                lastIndex = i;
            }
        }

        return (evenCount < 2) ? -1 : minDistance;
    }
}

