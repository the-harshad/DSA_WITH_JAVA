package Array;
import java.util.*;

public class Arrayadding {

  static int[] calSum(int a[], int b[], int n, int m) {
    int maxLength = Math.max(n, m);
    int[] result = new int[maxLength + 1]; // +1 for possible carry
    int i = n - 1;
    int j = m - 1;
    int k = maxLength;
    int carry = 0;

    // Add from the least significant digit
    while (i >= 0 || j >= 0 || carry != 0) {
      int digitA = (i >= 0) ? a[i] : 0;
      int digitB = (j >= 0) ? b[j] : 0;
      int sum = digitA + digitB + carry;

      result[k] = sum % 10;
      carry = sum / 10;

      i--;
      j--;
      k--;
    }

    // If there's no carry at the start, skip the first element
    if (result[0] == 0) {
      return Arrays.copyOfRange(result, 1, result.length);
    } else {
      return result;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

    sc.close();

    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res) System.out.println(i);
  }
}