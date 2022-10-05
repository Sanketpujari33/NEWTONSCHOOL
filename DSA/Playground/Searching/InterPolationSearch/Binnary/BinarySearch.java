package DSA.Playground.Searching.InterPolationSearch.Binnary;

public class BinarySearch {

  public static int binarySearch(int arr[], int x, int low, int high) {
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == x) return mid;
      if (arr[mid] < x) low = mid + 1; else high = mid - 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    BinarySearch ob = new BinarySearch();
    int arr[] = { 1, 2, 2, 4, 5, 6, 7, 8, 9, 9 };
    int size = arr.length;
    int X[] = { 8, 5, 6 };
    int Temp = arr.length;
    while (Temp > 0) {
      for (int i = 0; i <= Temp; i++) {
        int result = ob.binarySearch(arr, X[i], 0, size - 1);
        if (result == -1) System.out.println(
          "Not found"
        ); else System.out.println("Found at Index:- " + result);
      }
      Temp--;
    }
  }
}
