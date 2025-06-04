import java.util.Scanner;

public class twodarray {
    // moday-1
public static void main(String[] args) {
    // int arr[][];
    // arr = new int[3][4];
    // // int arr[][] = new int[3][4];
    // for(int i =0;i<3;i++){
    //     for(int j = 0; j<4; j++){
    //         System.out.print(arr[i][j]);
    //     }
    //     System.out.println();
    // }

    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int arr[][] = new int[rows][cols];

    for(int i = 0; i<rows; i++){
        for(int j =0; j<cols; j++){
            arr[i][j] = sc.nextInt();
        }
    }

    for(int i = 0; i<rows; i++){
        for(int j =0; j<cols; j++){
           System.out.print( arr[i][j]);
           
        }System.out.println();
    }

  }
}
