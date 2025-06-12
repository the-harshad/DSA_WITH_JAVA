import java.util.*;

public class TripletSumtoX {

    public static int triplets(ArrayList<Integer> arr, int X) {
        int count = 0;
        int n = arr.size();

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr.get(i).equals(arr.get(i - 1)))
                continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr.get(i) + arr.get(left) + arr.get(right);
                if (sum == X) {
                    count++;
                    int leftVal = arr.get(left);
                    int rightVal = arr.get(right);
                    
                    while (left < right && arr.get(left).equals(leftVal)) left++;
    
                    while (left < right && arr.get(right).equals(rightVal)) right--;
                } else if (sum < X) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) arr.add(sc.nextInt());
            int X = sc.nextInt();
            int result = triplets(arr, X);
            System.out.println(result);
        }
        sc.close();
    }
}
