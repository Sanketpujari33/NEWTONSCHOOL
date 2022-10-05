package DSA.Playground.Searching.InterPolationSearch.Binnary;

public class scharchinElement {

  public static void bS(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    for (int j = 0; j < size; j++) {
      System.out.print(arr[j] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 9, 8, 5, 6, 1, 4, 3, 7, 2 };
    int size = arr.length;
    bS(arr, size);
  }
}
