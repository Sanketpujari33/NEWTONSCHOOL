package DSA.Playground.Searching.InterPolationSearch.Binnary;

public class FistOcuranceElement {

  public static int binnaryFistandLastOccurance(
    int arr[],
    int x,
    int start,
    int end
  ) {
    int result = -1;
    while (start <= end) {
      int mid = (start + end) / 2;

      if (arr[mid] == x) {
        result = mid;
        start = mid + 1;
      }
      if (arr[mid] > x) {
        end = mid + 1;
      } else if (arr[mid] < x) {
        start = mid - 1;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 3, 3, 3, 5, 6, 8, 9 };
    int size = arr.length;
    int x = 3;
    int result = binnaryFistandLastOccurance(arr, x, 0, size - 1);
    System.out.println(result);
  }
}
