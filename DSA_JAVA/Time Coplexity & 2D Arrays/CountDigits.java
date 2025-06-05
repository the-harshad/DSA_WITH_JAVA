import java.util.*;

public class CountDigits {
    static int numDigits(int num) {
        int count = 0;
        // Handle the case when num is 0
        if (num == 0) {
            return 1;
        }
        // Make sure to work with positive number for counting digits
        num = Math.abs(num);
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numDigits(n));
        sc.close();
    }
}

