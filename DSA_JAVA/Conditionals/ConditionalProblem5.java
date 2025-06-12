import java.util.*;

public class ConditionalProblem5 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n % 6 == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not divisible");
        }
    }
}
