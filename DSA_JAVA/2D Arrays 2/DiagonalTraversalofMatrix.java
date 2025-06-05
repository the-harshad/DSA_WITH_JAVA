import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalTraversalofMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
        sc.close();
        ArrayList<Integer> res = diagonalTraversal(mat, n);
        for (Integer x : res)
            System.out.print(x + " ");
    }

    public static ArrayList<Integer> diagonalTraversal(int[][] mat, int n) {
        ArrayList<Integer> result = new ArrayList<>();
         for (int col = n - 1; col >= 0; col--) {
            int i = 0;
            int j = col;
            while (i < n && j < n) {
                result.add(mat[i][j]);
                i++;
                j++;
            }
        }

        for (int row = 1; row < n; row++) {
            int i = row;
            int j = 0;
            while (i < n && j < n) {
                result.add(mat[i][j]);
                i++;
                j++;
            }
        }

        return result;
    }
}
