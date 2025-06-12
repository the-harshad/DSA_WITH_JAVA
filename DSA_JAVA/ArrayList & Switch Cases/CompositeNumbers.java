import java.util.*;

class CompositeNumbers {

    static ArrayList<Integer> removeComposite(int arr[], int len) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (isPrime(arr[i])) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = removeComposite(arr, n);
        for(int val : list) System.out.print(val + " ");
    }
}
