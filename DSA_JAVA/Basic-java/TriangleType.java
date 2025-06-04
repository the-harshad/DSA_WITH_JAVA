import java.util.Scanner;
// Triangle Type Based on Side Lengths Using Pythagorean Inequality
public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        int LHS = 2 * (largest * largest);
        int RHS = (a * a) + (b * b) + (c * c);

        if (LHS < RHS) System.out.println(1);    // Acute
        else if (LHS > RHS) System.out.println(3); // Obtuse
        else System.out.println(2);               // Right

        sc.close();
    }
}
