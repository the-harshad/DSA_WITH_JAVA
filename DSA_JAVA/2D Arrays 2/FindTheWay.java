import java.util.*;

public class FindTheWay {
    public static int[] findTheWay(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0, j = 0, dir = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        while (i >= 0 && i < m && j >= 0 && j < n) {
            if (matrix[i][j] == 1) {
                matrix[i][j] = 0;
                dir = (dir + 1) % 4;
            }
            i += dx[dir];
            j += dy[dir];
        }
        return new int[] {i - dx[dir], j - dy[dir]};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        int[] result = findTheWay(matrix);
        System.out.print(result[0] + " " + result[1]);
        sc.close();
    }
}
