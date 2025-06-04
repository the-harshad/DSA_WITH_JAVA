import java.util.Scanner;
// Character Type Checker (Lowercase Alphabet Identifier)
public class CharCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') 
            System.out.println(1);
        else 
            System.out.println(0);

        sc.close();
    }
}
