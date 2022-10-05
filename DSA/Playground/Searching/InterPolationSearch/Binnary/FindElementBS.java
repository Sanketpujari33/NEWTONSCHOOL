package DSA.Playground.Searching.InterPolationSearch.Binnary;

public class FindElementBS {

  public static int binnaryFindelEment(int arr[], int x, int low, int high) {
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == x) return mid;
      if (arr[mid] < x) low = mid + 1; else if (arr[mid] > x) high = mid - 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 4, 6, 8, 9, 3, 1, 2 };
    int x = 2;
    int size = arr.length;
    int result = binnaryFindelEment(arr, x, 0, size - 1);
    if (result == -1) System.out.println(
      "not found element"
    ); else System.out.println("found element index:- " + result);
  }
}
