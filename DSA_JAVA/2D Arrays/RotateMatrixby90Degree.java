import java.util.*;

class Solution {
    public int[][] rotateBy90(int [][]mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotated;
    }
}

public class RotateMatrixby90Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextInt();

        int [][]mat = new int[n][n];
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                mat[i][j] = sc.nextInt();
            }
        }

        Solution Obj = new Solution();
        int[][] ans = Obj.rotateBy90(mat);

        for(int i=0; i<n; i++) {   
            for(int j=0; j<n; j++) {
                System.out.print(ans[i][j] + " ");
            } 
            System.out.println();
        }
        sc.close();
    }
}
