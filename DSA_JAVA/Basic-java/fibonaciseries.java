import java.util.*;
//fibonaci series
public class fibonaciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ft = 0, st = 1;
        System.out.print(ft + " " + st + " ");
        for (int i = 2; i < n; i++) {
            int trd = ft + st;
            System.out.print(trd + " ");
            ft = st;
            st = trd;
        }
        sc.close();
    }
}
