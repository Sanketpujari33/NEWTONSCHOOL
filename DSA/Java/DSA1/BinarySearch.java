package DSA.Java.DSA1;

public class BinarySearch {

  public static int binarySearch(int arr[], int x) {
    int low = 0;
    int high = arr.length - 1;
    while (low < high) {
      int mid = (high - low) / 2;
      if (arr[mid] == x) {
        return mid;
      }
      if (arr[mid] < x) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int result = binarySearch(arr, 5);
    if (result == -1) {
      System.out.print("NOT FOUND");
    } else {
      System.out.print(result);
    }
  }
}
