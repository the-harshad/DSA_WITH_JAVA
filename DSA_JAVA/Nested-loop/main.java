
public class main {
    public static void SecondLargest(int[] arr, int n) {
       
        int max = arr[0];
        for(int i = 0; i<n; i++){
            if (max<arr[i]) max = arr[i];
        }

        int secondMax = Integer.MIN_VALUE;
        int counter = 0;
        for(int i  = 0; i<n;i++){
            if (arr[i] == max) {
                counter++;
                continue;
            }
            if (secondMax<arr[i]) {
                secondMax = arr[i];
            } else{
                System.out.println(secondMax);
            }
        }
    }
}
