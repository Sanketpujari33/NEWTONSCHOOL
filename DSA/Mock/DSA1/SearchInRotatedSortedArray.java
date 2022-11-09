package DSA.Mock.DSA1;

public class SearchInRotatedSortedArray {

  public int binarySearch(int arr[], int target, int start, int end) {
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      }
      if (arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  public int pivot(int arr[]) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }
      if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }
      if (arr[start] > arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return start;
  }

  public int search(int[] arr, int target) {
    int pivot = pivot(arr);
    if (pivot == -1) {
      return binarySearch(arr, target, 0, arr.length - 1);
    }
    if (arr[pivot] == target) {
      return pivot;
    }
    if (arr[0] <= target) {
      return binarySearch(arr, target, 0, pivot - 1);
    } else {
      return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }
  }

  public static void main(String[] args) {
    SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();
    int arr[] = { 11, 22, 33, 44, 5, 6, 4, 7, 9, 4, 6 };
    int target = 33;
    System.out.println(search.search(arr, target));
  }
}
