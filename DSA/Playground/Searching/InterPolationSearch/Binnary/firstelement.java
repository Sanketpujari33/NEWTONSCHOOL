package DSA.Playground.Searching.InterPolationSearch.Binnary;

public class firstelement {

  public static int binarySearchFirst(
    int arr[],
    int searchValue,
    int start,
    int end
  ) {
    int result = -1;

    while (start <= end) {
      int mid = (start + end) / 2;

      // If searchValue found, continue searching left of the array.
      if (arr[mid] == searchValue) {
        result = mid;
        start = mid + 1;
      } else if (arr[mid] > searchValue) {
        end = mid - 1;
      } else if (arr[mid] < searchValue) {
        start = mid + 1;
      }
    }
    // Return -1 if not found
    return result;
  }

  public static void main(String[] args) {
    int arr[] = { 3, 4, 7, 10, 10, 10, 67, 29, 89 };
    int size = arr.length;
    int X = 10;
    int result = binarySearchFirst(arr, X, 0, size - 1);
    System.out.println(result);
  }
}
