import java.util.Scanner;

public class CountUntilOdd {
    public static void main(String[] args) {
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            counter++;

            if (n % 2 == 1) break;
        }

        System.out.println("Total numbers entered until first odd: " + counter);
        sc.close();
    }
}
