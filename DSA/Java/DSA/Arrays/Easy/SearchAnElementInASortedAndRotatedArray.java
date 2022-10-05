package DSA.Java.DSA.Arrays.Easy;

//        An element in a sorted array can be found in O(log n) time via binary search.
//        But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand.
//        So for instance, 1 2 3 4 5 might become 3 4 5 1 2.
//        Devise a way to find an element in the rotated array in O(log n) time.

//All solutions provided here assume that all elements in the array are distinct.
//        Basic Solution:
//
//        Approach:
//
//        The idea is to find the pivot point, divide the array in two sub-arrays and perform binary search.
//        The main idea for finding pivot is – for a sorted (in increasing order) and pivoted array,
//        pivot element is the only element for which next element to it is smaller than it.
//        Using the above statement and binary search pivot can be found.
//        After the pivot is found out divide the array in two sub-arrays.
//        Now the individual sub – arrays are sorted so the element can be searched using Binary Search.
//        Implementation:
//
//        Input arr[] = {3, 4, 5, 1, 2}
//        Element to Search = 1
//        1) Find out pivot point and divide the array in two
//        sub-arrays. (pivot = 2) /*Index of 5*/
//        2) Now call binary search for one of the two sub-arrays.
//        (a) If element is greater than 0th element then
//        search in left array
//        (b) Else Search in right array
//        (1 will go in else as 1 < 0th element(3))
//        3) If element is found in selected sub-array then return index
//        Else return -1.
//Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
//        key = 3
//        Output : Found at index 8
//
//        Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
//        key = 30
//        Output : Not found
//
//        Input : arr[] = {30, 40, 50, 10, 20}
//        key = 10
//        Output : Found at index 3

public class SearchAnElementInASortedAndRotatedArray {

  public static int pivotedBinarySearch(int arr[], int n, int key) {
    int pivot = findPivot(arr, 0, n - 1);

    if (pivot == -1) return binarySearch(arr, 0, n - 1, key);

    if (arr[pivot] == key) return pivot;
    if (arr[0] <= key) return binarySearch(arr, 0, pivot - 1, key);
    return binarySearch(arr, pivot + 1, n - 1, key);
  }

  public static int findPivot(int arr[], int low, int high) {
    //Base case
    if (low > high) return -1;
    if (low == high) return low;

    //Find a Midd
    int mid = low + (high - low) / 2;

    if (mid < high && arr[mid] > arr[mid + 1]) return mid;
    if (mid < high && arr[mid] < arr[mid - 1]) return mid - 1;

    if (arr[low] >= arr[mid]) return findPivot(arr, low, mid - 1);
    return findPivot(arr, mid + 1, high);
  }

  static int binarySearch(int arr[], int low, int high, int key) {
    if (low > high) return -1;

    int mid = low + (high - low) / 2;
    if (key == arr[mid]) return mid;
    if (key > arr[mid]) return binarySearch(arr, mid + 1, high, key);
    return binarySearch(arr, low, mid - 1, key);
  }

  public static void main(String[] args) {
    int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
    int n = arr1.length;
    int key = 3;
    System.out.println(
      "Index of the element is : " + pivotedBinarySearch(arr1, n, key)
    );
  }
}
