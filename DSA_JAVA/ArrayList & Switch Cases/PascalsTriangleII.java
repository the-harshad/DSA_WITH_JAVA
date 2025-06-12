import java.util.*;

public class PascalsTriangleII {
    public static List<Integer> pascalTriangleRow(int n) {
        List<Integer> row = new ArrayList<>();
        long val = 1;
        for (int i = 0; i < n; i++) {
            row.add((int) val);
            val = val * (n - 1 - i) / (i + 1);
        }
        return row;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> result = pascalTriangleRow(n);
        for (int num : result) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}