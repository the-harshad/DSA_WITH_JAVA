import java.util.*;

public class ConditionalProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        switch (n) {
            case 28:
                System.out.println("i am young");
                break;
            default:
                System.out.println("i am not young");
                break;
        }
    }
}
