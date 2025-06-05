import java.util.*;

public class BooleanMatrixProblemm {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int nums[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        int[][] ans = BooleanMatrixProblem(m, n, nums);

        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                System.out.print(ans[i][j] + " ");
            }
            System.out.print("\n");
        }

        sc.close();
    }

    public static int[][] BooleanMatrixProblem(int m, int n, int[][] mat){
        boolean[] rowHasOne = new boolean[m];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1){
                    rowHasOne[i] = true;
                    break; 
               }
            }
        }

        for(int i = 0; i < m; i++){
            if(rowHasOne[i]){
                for(int j = 0; j < n; j++){
                    mat[i][j] = 1;
                }
            }
        }

        return mat;
    }
}
