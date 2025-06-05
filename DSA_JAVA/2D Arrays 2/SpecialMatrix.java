import java.util.Scanner;

public class SpecialMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int N = scanner.nextInt();
            int[][] matrix = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            boolean isSpecial = true;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == j || i + j == N - 1) {
                        if (matrix[i][j] == 0) {
                            isSpecial = false;
                            break;
                        }
                    } else {
                        if (matrix[i][j] != 0) {
                            isSpecial = false;
                            break;
                        }
                    }
                }
                if (!isSpecial) {
                    break;
                }
            }
            System.out.println(isSpecial ? "true" : "false");
        }
        scanner.close();
    }
}