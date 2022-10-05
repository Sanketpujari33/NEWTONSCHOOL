package DSA.Arana.DSAThinkitive;

//Given an array of distinct integers arr[], the task is to find a pair which has the minimum sum and print the sum.
//        Examples:
//
//
//        Input: arr[] = {1, 2, 3}
//        Output: 3
//        The pair (1, 2) will have the minimum sum pair i.e. 1 + 2 = 3
//        Input: arr[] = {3, 5, 6, 2}
//        Output: 5
public class SmallestPairSum {

  static int smallest_pair(int[] a, int n) {
    int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
    for (int j = 0; j < n; j++) {
      if (a[j] < min) {
        secondMin = min;
        min = a[j];
      } else if ((a[j] < secondMin) && a[j] != min) secondMin = a[j];
    }
    return (secondMin + min);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    int n = arr.length;
    System.out.println(smallest_pair(arr, n));
  }
}
