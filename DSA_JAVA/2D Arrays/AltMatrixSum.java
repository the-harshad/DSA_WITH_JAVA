import java.util.*;

public class AltMatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int [][]mat = new int[n][n];
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                mat[i][j] = sc.nextInt();
            }
        }
        alternateMatrixSum(mat, n);  
        System.out.println();

        sc.close();
    } 

    public static void alternateMatrixSum(int [][]mat, int n) {
        int blackSum = 0, whiteSum = 0;

        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                if((i + j) % 2 == 0){
                    blackSum += mat[i][j];
                } else {
                    whiteSum += mat[i][j];
                }
            }
        }

        System.out.println(blackSum);
        System.out.println(whiteSum);
    }
}
