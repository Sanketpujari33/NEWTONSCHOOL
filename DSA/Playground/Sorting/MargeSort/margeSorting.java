package DSA.Playground.Sorting.MargeSort;

public class margeSorting {

  public static void Divide(int arr[], int l, int r) {
    if (l >= r) {
      return;
    }
    int mid = l + (r - l) / 2;
    Divide(arr, l, mid);
    Divide(arr, mid + 1, r);
    Conqure(arr, l, mid, r);
  }

  public static void Conqure(int arr[], int l, int mid, int r) {
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
    int arr[] = { 5, 4, 8, 1, 6, 9 };
    int size = arr.length;
    Divide(arr, 0, size);
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
