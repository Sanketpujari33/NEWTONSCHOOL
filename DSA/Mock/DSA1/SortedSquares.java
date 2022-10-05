package DSA.DSAMock.DSA1;

public class SortedSquares {

  public static int[] sortedSquares(int arr[]) {
    int n = arr.length;
    int i = 0;
    int j = n - 1;
    int result[] = new int[n];
    for (int k = n - 1; k >= 0; k--) {
      if (Math.abs(arr[i]) > Math.abs(arr[j])) {
        result[k] = arr[i] * arr[i];
        i++;
      } else {
        result[k] = arr[j] * arr[j];
        j--;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int arr[] = { -4, -1, 0, 3 };
    int result[] = sortedSquares(arr);
    for (int i : result) {
      System.out.print(i + " ");
    }
  }
}
