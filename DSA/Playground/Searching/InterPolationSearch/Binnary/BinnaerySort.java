package DSA.Playground.Searching.InterPolationSearch.Binnary;

public class BinnaerySort {

  public static void sortBinnary(int arr[], int size) {
    int j = -1;
    for (int i = 0; i < size; i++) {
      if (arr[i] < 1) {
        j++;
        int Temp = arr[j];
        arr[j] = arr[i];
        arr[i] = Temp;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0 };
    int size = arr.length;

    sortBinnary(arr, size);
  }
}
