import java.util.Scanner;
// PrimeNumber
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;

        if (n <= 1) {
            flag = 1;  // 0 and 1 are not prime numbers
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");

        sc.close();
    }
}
