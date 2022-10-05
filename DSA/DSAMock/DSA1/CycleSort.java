package DSA.DSAMock.DSA1;

//Sort an Array which contain 1 to N values in O(N) using Cycle Sort
//Given an array arr[] of elements from 1 to N, the task is to sort the given array in O(N) time.
//        Examples:
//        Input: arr[] = { 2, 1, 5, 4, 3}
//        Output: 1 2 3 4 5
//        Explanation:
//        Since arr[0] = 2 is not at correct position, then swap arr[0] with arr[arr[0] – 1]
//        Now array becomes: arr[] = {1, 2, 5, 4, 3}
//        Now arr[2] = 5 is not at correct position, then swap arr[2] with arr[arr[2] – 1]
//        Now the array becomes: arr[] = {1, 2, 3, 4, 5}
//        Now the array is sorted.
//        Input: arr[] = {1, 2, 3, 4, 5, 6}
//        Output: 1 2 3 4 5 6
//        Explanation:
//        The array is already sorted.
public class CycleSort {

  public static void cycleSort(int arr[], int N) {
    for (int i = 0; i < N;) {
      if (arr[i] == i + 1) {
        i++;
      } else {
        int Temp1 = arr[i];
        int Temp2 = arr[arr[i] - 1];
        arr[i] = Temp2;
        arr[Temp1 - 1] = Temp1;
      }
    }
  }

  public static void printArray(int arr[], int N) {
    for (int i = 0; i < N; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 2, 1, 5, 4, 3, 7, 6, 8, 9 };
    int N = arr.length;
    cycleSort(arr, N);
    printArray(arr, N);
  }
}
