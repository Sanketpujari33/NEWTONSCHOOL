package DSA.Mock.DSA1;

//Given an array arr[] of size N and an integer K, the task is to find an array element which contains the digit
//        K maximum number of times.If more than one solutions exist, then print any one of them. Otherwise, print -1.

//        Examples:
//        Input: arr[] = {3, 77, 343, 456}, K = 3
//        Output: 343
//        Explanation:
//        Frequency of 3 in array elements: 1, 0, 2, 0
//        343 has maximum frequency i.e. 2.

//        Input: arr[] = {1, 1111, 111, 11}, K = 1
//        Output: 1111
//        Explanation:
//        Frequency of 1 in array elements: 1, 4, 3, 2
//        1111 has maximum frequency i.e. 4.

public class ArrayElementHavingMaximum {

  public static int countFrqu(int size, int k) {
    int count = 0;
    while (size > 0) {
      if (size % 10 == k) {
        count++;
      }
      size = size / 10;
    }
    return count;
  }

  public static int findElementUntil(int arr[], int size, int k) {
    int c = 0;
    int max = 0;
    int ele = 0;
    for (int i = 0; i < size; i++) {
      c = countFrqu(arr[i], k);
      if (c > max) {
        max = c;
        ele = arr[i];
      }
    }
    if (max == 0) return -1; else return ele;
  }

  public static void FindElement(int arr[], int size, int k) {
    int ele = findElementUntil(arr, size, k);
    if (ele == -1) System.out.println("-1"); else System.out.println(ele);
  }

  public static void main(String[] args) {
    int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
    int size = arr.length;
    int K = 3;
    FindElement(arr, size, K);
  }
}
