package DSA.Mock.DSA1;
public class DutchNationalFlag {
  public static void sort0s1s2s(int arr[]) {
    int j = 0;
    int k = arr.length - 1;
    int i = 0;
    while (i <= k) {
      if (arr[i] == 0) {
        swop(arr, i, j);
        j++;
        i++;
      } else if (arr[i] == 1) {
        i++;
      } else if (arr[i] == 2) {
        swop(arr, i, k);
        k--;
      }
    }
  }

  public static void swop(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int arr[] = {
      0,
      1,
      2,
      0,
      1,
      2,
      0,
      1,
      2,
      0,
      1,
      2,
      0,
      1,
      2,
      0,
      1,
      2,
      0,
      2,
      1,
      2,
      0,
      1,
      2,
      0,
    };
    sort0s1s2s(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
