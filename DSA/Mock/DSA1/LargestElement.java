package DSA.Mock.DSA1;

//    22.Implement an algorithm, given an array with positive and duplicate elements,
//    find the largest element in given array in O(n):
//    Input Array: 2,8,7,6,4,7,8,5,2,1
//    Output: 8

public class LargestElement {

  public static void largestElement(int arr[], int size) {
    int max = arr[0];
    int min = arr[0];
    for (int i = 0; i < size; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("Largest Element int The Array:- " + max);
    System.out.println("Smallest Element int The Array:- " + min);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 8, 7, 6, 4, 7, 8, 5, 2, 1 };
    int size = arr.length;
    largestElement(arr, size);
  }
}
