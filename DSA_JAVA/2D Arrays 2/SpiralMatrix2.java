import java.util.Scanner;
import java.util.*;

class Solution {
    public int[] spiralMatrix2(int[][] mat, int n, int m) {
        ArrayList<Integer> result = new ArrayList<>();

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        for (int i = top; i <= bottom; i++) {
            result.add(mat[i][left]);
        }
        left++;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(mat[bottom][i]);
            }
            bottom--;

            if (top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    result.add(mat[i][right]);
                }
                right--;
            }

            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(mat[top][i]);
                }
                top++;
            }

            if (top <= bottom && left <= right) {
                for (int i = top; i <= bottom; i++) {
                    result.add(mat[i][left]);
                }
                left++;
            }
        }

        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }

        return arr;
    }
}

public class SpiralMatrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int[] result = ob.spiralMatrix2(matrix, n, m);
            for (int i = 0; i <result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}