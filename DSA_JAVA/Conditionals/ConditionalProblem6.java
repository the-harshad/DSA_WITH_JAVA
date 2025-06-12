import java.util.*;

public class ConditionalProblem6 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("we are odd");
        } else {
            System.out.println("we are simple");
        }
    }
}
