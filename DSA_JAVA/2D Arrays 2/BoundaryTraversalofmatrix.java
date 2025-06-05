import java.util.*;

public class BoundaryTraversalofmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        boundaryTraversal(m, n, matrix);
        sc.close();
    }

    public static void boundaryTraversal(int m, int n, int[][] matrix) {
    if (m == 1) {
        for (int i = 0; i < n; i++)
            System.out.print(matrix[0][i] + " ");
    } else if (n == 1) {
        for (int i = 0; i < m; i++)
            System.out.print(matrix[i][0] + " ");
    } else {
        for (int i = 0; i < n; i++)
            System.out.print(matrix[0][i] + " ");

        for (int i = 1; i < m; i++)
            System.out.print(matrix[i][n - 1] + " ");

        for (int i = n - 2; i >= 0; i--)
            System.out.print(matrix[m - 1][i] + " ");

        for (int i = m - 2; i >= 1; i--)
            System.out.print(matrix[i][0] + " ");
    }
}

}
