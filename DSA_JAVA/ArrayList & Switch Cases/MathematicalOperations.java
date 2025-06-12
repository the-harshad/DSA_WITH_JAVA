import java.util.*;

public class MathematicalOperations {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A + B);  
        System.out.println(A - B);  
        System.out.println(A * B);   
        System.out.println(A / B);   
        System.out.println(A % B); 

        sc.close();
    }
}
