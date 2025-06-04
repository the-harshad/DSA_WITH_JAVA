import java.util.Scanner;
// else if
public class elseif {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 60) print("below exception");
        else if (n <= 70) print("meets Expectation");
        else if (n <= 80) print("fair");
        else if (n <= 90) print("good");
        else print("Excellent");

        sc.close();
    }
}
