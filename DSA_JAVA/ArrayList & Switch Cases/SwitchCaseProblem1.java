import java.util.*;

public class SwitchCaseProblem1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 

        switch (N) {
            case 55:
                System.out.println("Study is important");
                break;
            default:
                System.out.println("No value");
        }

        sc.close();
    }
}
