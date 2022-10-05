package DSA.Java.DSA1;

public class TwoMarge {

  public static int[] twoMarge(int arr1[], int arr2[], int n, int m) {
    int marge[] = new int[n + m];
    int i = 0, j = 0, k = 0;
    while (i < n && j < m) {
      if (arr1[i] < arr2[j]) {
        marge[k] = arr1[i];
        i++;
      } else {
        marge[k] = arr2[j];
        j++;
      }
      k++;
    }
    while (i < n) {
      marge[k] = arr1[i];
      i++;
      k++;
    }
    while (j < m) {
      marge[k] = arr2[j];
      j++;
      k++;
    }
    return marge;
  }

  public static void main(String[] args) {
    int arr1[] = { 1, 2, 3, 4, 5, 6, 21, 22, 23, 24, 25 };
    int arr2[] = { 0, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int result[] = twoMarge(arr1, arr2, arr1.length, arr2.length);
    for (int i : result) {
      System.out.print(i + " ");
    }
  }
}
