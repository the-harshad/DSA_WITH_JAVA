import java.util.*;
public class subarray {

    public static int subarrayDivisbleByK(int arr[], int n, int k){
        Map<Integer, Integer> remainderCount = new HashMap<>();
        remainderCount.put(0, 1); // to handle subarrays starting from index 0

        int sum = 0;
        int count = 0;

        for(int i = 0; i < n; i++) {
            sum += arr[i];
            int remainder = sum % k;

            // Handle negative remainders
            if (remainder < 0) {
                remainder += k;
            }

            if (remainderCount.containsKey(remainder)) {
                count += remainderCount.get(remainder);
            }

            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }

        int result = subarrayDivisbleByK(arr, n, k);
        System.out.println(result);        
    
        sc.close();
    }
}
