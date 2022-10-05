package DSA.Playground.Arrays.OneDArray;

//Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
//        You must write an algorithm with O(log n) runtime complexity.
//        Example 1:
//        Input: nums = [1,3,5,6], target = 5
//        Output: 2

public class InsertedInOrder {

  public static int targetIndex(int arr[], int l, int r, int t) {
    while (l <= r) {
      int mid = l + (r - l) / 2;
      if (arr[mid] == t) return mid; else if (arr[mid] > t) r =
        mid - 1; else l = mid + 1;
    }
    return l;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 3, 5, 6 };
    int t = 5;
    int size = arr.length;
    int result = targetIndex(arr, 0, size - 1, t);
    System.out.println(result);
  }
}
