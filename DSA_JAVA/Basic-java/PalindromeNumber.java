import java.util.Scanner;
// PalindromeNumber
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        while (n != 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10; }

        if (reverse == original) System.out.println(reverse + " is a palindrome number");
        else System.out.println(reverse + " is not a palindrome number");

        sc.close();
    }
}
