import java.util.*;

public class AJNumber {

    static Set<Integer> ajPrimes = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));

    static boolean isAJ(int num) {
        if (num == 0 || num == 1) return false;
        if (ajPrimes.contains(num)) return true;
        for (int prime : ajPrimes) {
            if (num % prime == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = dp[i + 1];
            int num = 0;
            for (int j = i; j < n; j++) {
                num = num * 10 + (str.charAt(j) - '0');
                if (isAJ(num)) {
                    dp[i] = Math.max(dp[i], 1 + dp[j + 1]);
                }
            }
        }
        System.out.println(dp[0]);
    }
}