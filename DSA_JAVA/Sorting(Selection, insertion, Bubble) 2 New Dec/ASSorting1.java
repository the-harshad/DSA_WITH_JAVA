import java.util.*;

class Solution {
    public static void sortCol(int[][] mat, int N, int M) {
        for (int col = 0; col < M; col++) {
            int[] temp = new int[N];
            for (int row = 0; row < N; row++) {
                temp[row] = mat[row][col];
            }
            Arrays.sort(temp);
            for (int row = 0; row < N; row++) {
                mat[row][col] = temp[row];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class ASSorting1 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        Solution.sortCol(mat, n, m);
    }
}
