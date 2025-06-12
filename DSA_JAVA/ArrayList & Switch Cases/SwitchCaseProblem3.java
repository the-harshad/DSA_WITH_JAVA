import java.util.*;

public class SwitchCaseProblem3 {
  public static void main(String[] args) throws Throwable {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (b == 0) {
        System.out.println("Invalid input: Division by zero");
        return;
    }

    int remainder = a % b;

    switch (remainder) {
      case 0:
        System.out.println("Remainder is too small");
        break;
      case 1:
        System.out.println("Remainder is small");
        break;
      case 2:
        System.out.println("Remainder is large");
        break;
      default:
        System.out.println("Remainder is too large");
        break;
    }

    sc.close();
  }
}
