import java.util.*;

public class NaturalSum {
    static int printSum(int N){
        return N * (N + 1) / 2;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();    
        System.out.println(printSum(N));
        sc.close();
    }
}
