package DSA.Mock.DSA1;

//Given a binary array A[] of size N. The task is to arrange the array in increasing order.
//        Note: The binary array contains only 0  and 1.
//
//
//        Example 1:
//
//        Input:
//        5
//        1 0 1 1 0
//
//        Output:
//        0 0 1 1 1
//
//        Explanation:
//        After arranging the elements in
//        increasing order, elements will be as
//        0 0 1 1 1.

//        Sort a binary array using one traversal
//        Difficulty Level : Easy
//        Last Updated : 29 Apr, 2021
//        Given a binary array, sort it using one traversal and no extra space.
//        Examples :
//
//
//        Input : 1 0 0 1 0 1 0 1 1 1 1 1 1 0 0 1 1 0 1 0 0
//        Output : 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1
//        Explanation: The output is a sorted array of 0 and 1
//
//        Input : 1 0 1 0 1 0 1 0
//        Output : 0 0 0 0 1 1 1 1
//        Explanation: The output is a sorted array of 0 and 1
////      Approach: This concept is related to partition of quick sort .
////                 In quick sort’ partition, after one scan,
////                the left of the array is smallest and right of
////                the array is the largest of selected pivot element.
public class BinnarySort {

  public static void binSort(int a[], int n) {
    int j = -1;
    for (int i = 0; i < n; i++) {
      // if number is smaller than 1
      // then swap it with j-th number
      if (a[i] < 1) {
        j++;
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
      }
    }
  }

  public static void printArray(int Arr[], int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(Arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 1, 0, 1, 1, 0 };
    int size = 5;
    binSort(arr, size);
    printArray(arr, size);
  }
}
