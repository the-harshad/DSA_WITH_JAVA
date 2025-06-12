import java.util.*;

public class ConditionalProblem3 {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n > 1) {
            System.out.println("You entered more");
        } else {
            System.out.println("You entered less");
        }
    }
}
