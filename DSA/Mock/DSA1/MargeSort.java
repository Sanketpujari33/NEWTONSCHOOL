package DSA.Mock.DSA1;

public class MargeSort {

  public static void divide(int arr[], int l, int r) {
    if (l >= r) {
      return;
    }
    int mid = l + (r - l) / 2;
    divide(arr, l, mid);
    divide(arr, mid + 1, r);
    conqure(arr, l, mid, r);
  }

  public static void conqure(int arr[], int l, int mid, int r) {
    int marge[] = new int[r - l + 1];
    int idx1 = l;
    int idx2 = mid + 1;
    int x = 0;
    while (idx1 <= mid && idx2 <= r) {
      if (arr[idx1] <= arr[idx2]) {
        marge[x++] = arr[idx1++];
      } else {
        marge[x++] = arr[idx2++];
      }
    }
    while (idx1 <= mid) {
      marge[x++] = arr[idx1++];
    }
    while (idx2 <= r) {
      marge[x++] = arr[idx2++];
    }
    for (int i = 0, j = l; i < marge.length; i++, j++) {
      arr[j] = marge[i];
    }
  }

  public static void main(String[] args) {
    int arr[] = { 5, 41, 6, 4, 8, 1, 21, 26, 41, 3, 74, 65 };
    divide(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
